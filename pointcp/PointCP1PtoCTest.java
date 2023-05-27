package pointcp;

/** This file returns the min, max and average computation time 
 * to convert Cartisian points to Polar points and display them 
 * to the user.
 */

import java.io.*;
import design1.PointCP;                 

public class PointCP1CtoPTest{
  
  public static void main(String[] args){
    PointCP point;
    

    String csvFile = "./TestData/polar_points.csv";
    String line;
    String csvDelimiter = ",";

    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

      long startTime = System.currentTimeMillis();

      while ((line = br.readLine()) != null) {
        String[] data = line.split(csvDelimiter);
                
        // Process each line of data here
        point = new PointCP('P', Double.parseDouble(data[0]), Double.parseDouble(data[1]));
        point.convertStorageToCartesian();
        System.out.println(point);
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
