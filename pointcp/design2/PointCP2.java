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
    private char typeCoord;
    private double xOrRho;
    private double yOrTheta;

    public PointCP2(char type, double xOrRho, double yOrTheta){
        if (type != 'C' && type != 'P'){
            throw new IllegalArgumentException();
        }
        this.xOrRho = xOrRho;
        this.yOrTheta = yOrTheta;
        typeCoord = type;
    }

    public double getX(){
        if (typeCoord == 'C'){
            return xOrRho;
        } else{
            return (Math.cos(Math.toRadians(yOrTheta)) * xOrRho);
        }
    }

    public double getY(){
        if (typeCoord == 'C'){
            return yOrTheta;
        } else{
            return (Math.sin(Math.toRadians(yOrTheta)) * xOrRho);
        }
    }

    public double getRho(){
        if (typeCoord == 'P'){
            return xOrRho;
        } else{
            return (Math.sqrt(Math.pow(xOrRho, b:2) + Math.pow(yOrTheta, b:2)));
        }
    }

    public double getTheta(){
        if (typeCoord == 'P'){
            return yOrTheta;
        } else{
            return Math.toDegrees(Math.atan2(yOrTheta, xOrRho));
        }
    }
}
