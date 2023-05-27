package design2;
/**
 * Design 2: Store polar coordinates only
 * 
 * How Cartesian coordinates are computed: 
 * Computed on demand but not stored. 
 * 
 * How polar coordinates are computed: 
 * Simply returned. 
 */

public class PointCP2 {
  
  // Contains the current value RHO.
  private double Rho;
  
  // Contains the current value of THETA 
  private double Theta;
    
  
  //Constructors ******************************************************

  public PointCP2( double Rho, double Theta){
    this.Rho = Rho;
    this.Theta = Theta;
  }
    
  
  //Instance methods **************************************************
 
 
  public double getX(){
    return (Math.cos(Math.toRadians(Theta)) * Rho);
  }
  
  public double getY(){
    return (Math.sin(Math.toRadians(Theta)) * Rho);
  }
  
  public double getRho(){
    return Rho;
   
  }
  
  public double getTheta(){
    return Theta;
  
  }
  
  
    
  /**
   * Compute Cartesian coordinate.
   */
  public String computeCartesian(){
      //Calculate X and Y
      double temp = getX();
      double y = getY();
      double x = temp;

      return "Cartesian" + "(" + x + "," + y + ")" + "\n";
  }

  public String toString(){
    return "Polar" + "[" + getRho() + "," + getTheta() + "]" + "\n";
  }

}
