import java.util.Arrays;
import java.util.Collections;

public class IntroTo2DArrays{

  public static void main(String[] args)
  {
    
    int[][] twoDee = new int[3][5];

    //Store incremental values in row major order
    //[1,2,3,4,5]
    //[6,7,8,9,10]
    //[11,12,13,14,15]

    int val = 1;
    for(int row = 0; row<twoDee.length; row++)
    {
      for(int col = 0; col<twoDee[row].length; col++)
      { 
        twoDee[row][col] = val;
        val++;
      }
      System.out.println(Arrays.toString(twoDee[row]));
    }
     //Print ouit the total sum of each row in the following 
     //format:
     //Row 0: 15
     //Row 1: ...
     int sum = 0;
     for(int row = 0; row<twoDee.length; row++)
    {
      for(int col = 0; col<twoDee[row].length; col++)
      { 
        sum  +=   twoDee[row][col];
      }
      System.out.println("Row " + row + ": " + sum);
      sum = 0;
    }
  //Print out the sum of each column in the following 
  //format:
  //Column 0: ??
  //Column 1: ??
  //...
  //Column 5: ??
    int total = 0;
    for(int col = 0; col < twoDee[0].length; col++)
    {
      for(int row = 0; row<twoDee.length; row++)
        total += twoDee[row][col];
      System.out.println("Column " + col + ": " + total);
      total = 0;
      
    }
  }
  
}
