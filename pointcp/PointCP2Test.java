package pointcp;
import java.io.*;
import design2.PointCP2;

/**
 * This class prompts the user for a set of polar coordinates, and then
 * displays it's cartesian equivalent. 
 */
public class PointCP2Test
{
  //Class methods *****************************************************

  /**
   * @param args[0] The value of RHO.
   * @param args[1] The value of THETA.
   */
  public static void main(String[] args)
  {
    PointCP2 point;

    System.out.println("Polar to Cartesian Coordinate Conversion Program");

    // Check if the user input coordinates from the command line
    // If he did, create the PointCP2 object from these arguments.
    // If he did not, prompt the user for them.
    try
    {
      point = new PointCP2(Double.valueOf(args[0]).doubleValue(), Double.valueOf(args[1]).doubleValue());
    }
    catch(Exception e)
    {
      // If we arrive here, it is because either there were no
      // command line arguments, or they were invalid
      if(args.length != 0)
        System.out.println("Invalid arguments on command line");

      try
      {
        point = getInput();
      }
      catch(IOException ex)
      {
        System.out.println("Error getting input. Ending program.");
        return;
      }
    }
    System.out.println("\nYou entered:\n" + point);
    System.out.println("\nStoring as Polar:\n" + point);

    System.out.println("\nComputing Cartesian:\n" + point.computeCartesian());
  }

  /**
   * This method obtains input from the user and verifies that
   * it is valid.  When the input is valid, it returns a PointCP2
   * object.
   *
   * @return A PointCP2 constructed using information obtained 
   *         from the user.
   * @throws IOException If there is an error getting input from
   *         the user.
   */
  private static PointCP2 getInput() throws IOException{
    byte[] buffer = new byte[1024];  //Buffer to hold byte input
    boolean isOK = false;  // Flag set if input correct
    String theInput = "";  // Input information
    
    double a = 0.0;
    double b = 0.0;

    // Allow the user to enter the two different arguments
    for (int i = 0; i < 2; i++){

      while (!(isOK)){
        isOK = true;  //flag set to true assuming input will be valid
          

        // Get the user's input      
       
        // Initialize the buffer before we read the input
        for(int k=0; k<1024; k++)
        	buffer[k] = '\u0020';        
        
        System.out.print("Enter the value of " + (i == 0 ? "Rho " : "Theta ") + "using a decimal point(.): ");
        System.in.read(buffer);
        theInput = new String(buffer).trim();

        
        // Verify the user's input
        try{

          //Convert the input to double values
          if (i == 0)
            a = Double.valueOf(theInput).doubleValue();
          else
            b = Double.valueOf(theInput).doubleValue();  
        }

        catch(Exception e){

        	System.out.println("Incorrect input");
        	isOK = false;  //Reset flag as so not to end while loop
          
        }
      }

      //Reset flag so while loop will prompt for other arguments
      isOK = false;
    }
    //Return a new PointCP object
    return (new PointCP2(a, b));
  }
}
