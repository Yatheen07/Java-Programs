import java.io.*;
import java.util.*;

class Solution{
  public static void main(String args[]) throws Exception{

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String input = reader.readLine();

    HashMap<Character,Integer> frequency = new HashMap<Character,Integer>();

    char[] characters = input.toCharArray();

    for(char c : characters){
      if(frequency.containsKey(c)){
          frequency.put(c,frequency.get(c) + 1);
      }
      else{
        frequency.put(c,1);
      }
    }

    int max_freq = Integer.MIN_VALUE,ch_freq=0;
    char result = ' ';

    for(Map.Entry<Character, Integer> entry : frequency.entrySet()){
      ch_freq = entry.getValue();
      if(ch_freq >= max_freq){
        max_freq = ch_freq;
        result = entry.getKey();
      }
    }

    System.out.println(frequency.toString()+"\n"+"Character with highest Frequency is: "+result + " with frequency of : "+max_freq);
  }
}
