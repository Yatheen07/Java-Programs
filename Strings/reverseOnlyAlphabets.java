import java.io.*;
import java.util.*;

class Solution{

    private static ArrayList<Character> alphabets;

    private static void seperateAlphabets(String input)
    {
        char[] array = input.toCharArray();
        int i=0;
        for(char ch : array){
            if(Character.isLetter(ch)){
                alphabets.add(ch);
                i++;
            }
        }
    }
    public static void main(String ar[]) throws Exception {

        //Step 1: Get input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        //Step 2: Initialise the arrayList
        alphabets = new ArrayList<Character>();

        //step 3: seperate the alphabets
        seperateAlphabets(input);

        //Step 4: reverse the arrayList
        Collections.reverse(alphabets);

        int j=0;//runner variable

        for(char ch : input.toCharArray())
        {
            if(Character.isLetter(ch))
            {
                    System.out.print(alphabets.get(j)+"");
                    j++;
            }
            else{
                System.out.print(ch+"");
            }
        }


    }
}
