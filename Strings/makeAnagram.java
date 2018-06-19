import java.util.*;
import java.io.*;

class Solution{

  private static int[] freq = new int[26];

  private static void getCharFreq(String a,String b){

    for(int i =0;i<freq.length;i++)
      freq[i] = 0;

    for(char ch : a.toCharArray()){
      freq[ch - 'a']++;
    }

    for(char ch : b.toCharArray()){
      freq[ch - 'a']--;
    }

    System.out.println(Arrays.toString(freq));
  }

  private static int getResult(){

    int result = 0;

    for(int i : freq)
      result += Math.abs(i);

    return result;
  }

  public static void main(String ar[]) throws Exception{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String input_1 = reader.readLine();
    String input_2 = reader.readLine();

    getCharFreq(input_1 , input_2);
    System.out.println("The number of characters that has to be deleted is: "+ getResult());

  }
}
