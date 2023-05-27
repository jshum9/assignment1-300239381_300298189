package pointcp;

/** This file returns the min, max and average computation time 
 * to convert Cartisian points to Polar points and display them 
 * to the user.
 */

import java.io.*;
import design5.PointCP2;                 

public class PointCP3CtoPTest{
  
  public static void main(String[] args){
    PointCP2 point;
    

    String csvFile = "./TestData/polar_points.csv";
    String line;
    String csvDelimiter = ",";

    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

      long startTime = System.currentTimeMillis();

      while ((line = br.readLine()) != null) {
        String[] data = line.split(csvDelimiter);
                
        // Process each line of data here
        point = new PointCP2(Double.parseDouble(data[0]), Double.parseDouble(data[1]));
        System.out.println(point.computeCartesian());
      }

      long endTime = System.currentTimeMillis();
      long elapsedTime = endTime - startTime;
      System.out.println("Elapsed time: " + elapsedTime + " milliseconds");

    }

    catch (IOException e) {
            e.printStackTrace();
        }
    
  }
}
