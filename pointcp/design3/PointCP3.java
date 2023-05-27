package design3;
/**
 * Design 3: Store Cartesian coordinates only.
 * 
 * How Cartesian coordinates are stored: 
 * Simply returned. 
 * 
 * How polar coordinates are computed: 
 * Computed on demand, but not stored. 
 */

public class PointCP3 {

    // Contains the current value x.
  private double x;
  
  // Contains the current value of y 
  private double y;
    
  
  //Constructors ******************************************************

  public PointCP3( double x, double y){
    this.x = x;
    this.y = y;
  }
    
  
  //Instance methods **************************************************
 
 
  public double getX(){
    return x;
  }
  
  public double getY(){
    return y;
  }
  
  public double getRho(){
    return (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
   
  }
  
  public double getTheta(){
    return Math.toDegrees(Math.atan2(y, x));
  
  }
  
  
    
  /**
   * Compute Polar coordinate.
   */
  public String computePolar(){
      //Calculate Rho and Theta
      double temp = getRho();
      double Theta = getTheta();
      double Rho = temp;

      return "Polar" + "[" + getRho() + "," + getTheta() + "]" + "\n";
  }

  public String toString(){
    return "Cartesian" + "(" + getX() + "," + getY() + ")" + "\n";
  }
    
}
