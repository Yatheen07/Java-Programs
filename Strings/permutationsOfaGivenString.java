import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    private static ArrayList<String> permutations = new ArrayList<String>();

    private static String swap(String a, int left , int right){
        char array[] = a.toCharArray();

        char temp = array[left];
        array[left] = array[right];
        array[right] = temp;

        return String.valueOf(array);
    }
    
  	private static void permuteString(String str , int left , int right){

  	    if(left == right ){
  	        permutations.add(str);
  	        return;
  	    }
  	    else{
  	        for(int i = left ; i <= right; i++){
  	            str = swap(str,left,i);
  	            permuteString(str,left+1,right);
  	            str = swap(str,left,i);
  	        }
  	    }


  	}
	public static void main (String[] args) throws Exception
	 {
	 //code
	 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	 int test_cases=Integer.parseInt(reader.readLine());

	 while(test_cases-- > 0)
	 {
	     permutations.clear();
	     String input = reader.readLine();
	     permuteString(input , 0 , input.length() -1);
	     Collections.sort(permutations);
	     for (String str : permutations) {
    		System.out.print(str+" ");
    	 }
	     System.out.println();

	 }

	 }
}
