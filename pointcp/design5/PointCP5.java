package design5;
/**
 * Design 5: Abstract superclass with designs 2 and 3 as subclasses.
 * 
 * How Cartesian coordinates are computed: 
 * Depends on the concrete class used.
 * 
 * How polar coordinates are computed: 
 * Depends on the concrete class used. 
 */

public abstract class PointCP5{

    double xOrRho;
    double yOrTheta;
    
  
  
  public PointCP5(double xOrRho, double yOrTheta){
    this.xOrRho = xOrRho;
    this.yOrTheta = yOrTheta;
  }
    
  
 
 
  public abstract double getX();
  
  public abstract double getY();

  public abstract double getRho();
  
  public abstract double getTheta();

  public abstract String toString();


    
}
