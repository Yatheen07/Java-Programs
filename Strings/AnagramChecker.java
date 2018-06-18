import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    //Method 1: USing Sorting
    private static boolean isAnagram(String input1 , String input2){
        if(input1.length() != input2.length())
            return false;

        char[] array1 = input1.toCharArray();
        char[] array2 = input2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        for(int i = 0 ; i < array1.length ; i++)
        {
            if(array1[i] != array2[i])
                return false;
        }

        return true;
    }

    private static boolean isAnagram2(String input1 , String input2) throws Exception{
        if(input1.length() != input2.length())
            return false;

        byte[] bytes1 = input1.getBytes("US-ASCII");
        byte[] bytes2 = input2.getBytes("US-ASCII");

        byte sum = 0;

        for(byte b : bytes1){
            sum+=b;
        }

        for(byte b : bytes2){
            sum-=b;
        }
        if(((int)sum) == 0) return true;
        else return false;
    }

	public static void main (String[] args) throws Exception
	 {
	 //code
	 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


	 int test_cases=Integer.parseInt(reader.readLine());

	 while(test_cases>0)
	 {
	    String input1 = reader.readLine();
	    String input2 = reader.readLine();
	    if(isAnagram2(input1, input2)){
	        System.out.println("YES");
	    }
	    else{
	        System.out.println("NO");
	    }
	    test_cases--;
	 }

	 }
}
