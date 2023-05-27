package design5;
/**
 * Design 3: Store Cartesian coordinates onlyOrTheta.
 * 
 * How Cartesian coordinates are stored: 
 * SimplyOrTheta returned. 
 * 
 * How polar coordinates are computed: 
 * Computed on demand, but not stored. 
 */

public class PointCP3 extends PointCP5 {
    
  //Constructors ******************************************************

  public PointCP3( double xOrRho, double yOrTheta){
    super(xOrRho, yOrTheta);
  }
    
  
  //Instance methods **************************************************
 
 
  public double getX(){
    return xOrRho;
  }
  
  public double getY(){
    return yOrTheta;
  }
  
  public double getRho(){
    return (Math.sqrt(Math.pow(xOrRho, 2) + Math.pow(yOrTheta, 2)));
   
  }
  
  public double getTheta(){
    return Math.toDegrees(Math.atan2(yOrTheta, xOrRho));
  
  }
  
  
    
  /**
   * Compute Polar coordinate.
   */
  public String computePolar(){
      //Calculate Rho and Theta
      double temp = getRho();
      double Theta = getTheta();
      double Rho = temp;

      return "Polar" + "[" + Rho + "," + Theta + "]" + "\n";
  }

  public String toString(){
    return "Cartesian" + "(" + getX() + "," + getY() + ")" + "\n";
  }
    
}
