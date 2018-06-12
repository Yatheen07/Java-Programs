import java.io.*;
import java.util.*;

class Solution{

    public static void main(String ar[]) throws Exception {

        //Step 1: Get input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        int first=0,last=input.length()-1;
        char[] array = input.toCharArray();

        for(int i = 0 ; i < array.length;i++)
        {
            if(!Character.isLetter(array[first]))
                first++;
            if(!Character.isLetter(array[last]))
                last--;
            if(first==last) break;
            array[first] = array[last];
        }

        System.out.println(String.valueOf(array));


    }
}
