import java.util.*;
import java.io.*;

class Solution{
 private static boolean isVowel(char c)
 {
    if(c == 'a' || c =='e' || c =='i' || c=='o' || c=='u')
        return true;
    else
        return false;
 }
 public static void main(String a[]) throws Exception{

  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  String input = reader.readLine().toLowerCase();
  System.out.println("The given String is: "+ input.toLowerCase());
  char[] input_array = input.toCharArray();
  char[] vowels = new char[100];
  int v=0;
  for(char c : input_array)
  {
      if(isVowel(c)){
        vowels[v]=c;
        v++;
      }
  }
  for(char c : input_array)
  {
      if(isVowel(c)){
        System.out.print(vowels[--v]);
      }
      else{
        System.out.print(c);
      }
  }

 }
}
