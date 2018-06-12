import java.util.*;
import java.io.*;

class Solution{
    public static void main(String ar[]) throws Exception{
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string in which you want to reverse each word");
        String input = reader.readLine();
        System.out.println(input);
        String[] words = input.split("\\.");

        StringBuilder result = new StringBuilder();

        for(String word : words){
            result.append(new StringBuilder().append(word).reverse()+".");
        }

        System.out.println(result);

    }
}
