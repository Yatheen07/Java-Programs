import java.util.*;
import java.io.*;

class Solution{

  private static void printX(String input){

      for(int i = 0 ; i < input.length() ; i++){

          int j = input.length() -1 -i;

          for(int k = 0 ; k < input.length() ; k++){

              if(k == i || k==j)  System.out.print(input.charAt(k));
              else System.out.print(" ");

          }

          System.out.println();

      }
  }

  public static void main(String ar[]) throws Exception{

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String input = reader.readLine();
    printX(input);

  }


}
