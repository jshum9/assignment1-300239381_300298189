package pointcp;

//This file prints out the elapsed time it takes to convert a cartesian points
//to polar points and display them to the user.

import java.io.*;
import design5.PointCP3;                 

public class PointCP3CtoPTest{
  
  public static void main(String[] args){
    PointCP3 point;
    

    String csvFile = "./TestData/cartesian_points.csv";
    String line;
    String csvDelimiter = ",";

    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

      long startTime = System.currentTimeMillis();

      while ((line = br.readLine()) != null) {
        String[] data = line.split(csvDelimiter);
                
        // Process each line of data here
        point = new PointCP3(Double.parseDouble(data[0]), Double.parseDouble(data[1]));
        System.out.println(point.computePolar());
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

