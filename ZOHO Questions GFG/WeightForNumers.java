import java.util.*;
import java.io.*;

class Solution{
  private static int getFive(int n){
    double sqrt = Math.sqrt(n);

    if( (sqrt - Math.floor(sqrt)) == 0 ) return 5;
    else  return 0;
  }

  private static int getFour(int n){
    if(n % 12 == 0) return (4+3);
    else if(n%2==0) return 3;
    else return 0;
  }


  private static int getWeight(int n){
    int weight_sum = 0;
    weight_sum+= getFive(n) + getFour(n);
    return weight_sum;
  }

  public static void main(String ar[]) throws Exception{

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int input = Integer.parseInt(reader.readLine());
    System.out.println(getWeight(input));
  }

}
