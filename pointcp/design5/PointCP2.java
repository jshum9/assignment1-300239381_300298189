package design5;
/**
 * Design 2: Store polar coordinates only
 * 
 * How Cartesian coordinates are computed: 
 * Computed on demand but not stored. 
 * 
 * How polar coordinates are computed: 
 * Simply returned. 
 */

public class PointCP2 extends PointCP5 {
    
  
  //Constructors ******************************************************

  public PointCP2( double xOrRho, double yOrTheta){
    super(xOrRho, yOrTheta);
  }
    
  
  //Instance methods **************************************************
 
 
  public double getX(){
    return (Math.cos(Math.toRadians(yOrTheta)) * xOrRho);
  }
  
  public double getY(){
    return (Math.sin(Math.toRadians(yOrTheta)) * xOrRho);
  }
  
  public double getRho(){
    return xOrRho;
   
  }
  
  public double getTheta(){
    return yOrTheta;
  
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
