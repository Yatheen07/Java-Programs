//GeeksFOrGeeks Problem
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	private static void Solve(int s , int n){

	    if (s == 0)  System.out.print(n == 1 ? "0" : "-1");
		  else if(s > 9*n){
		    System.out.print("-1");
		  }
  		else{
		    int[] result = new int[n];

    		s-=1;

    		for(int i = n-1;i>0;i--){
    		    if(s>9){
    		        result[i] = 9;
    		        s-=9;
    		    }
    		    else{
    		        result[i] = s;
    		        s = 0;
    		    }
    		}

    		result[0] = s + 1;

    		for(int i : result){
    		    System.out.print(i+"");
    		}
		}
	}

	public static void main (String[] args)
	 {
	 //code
	 Scanner scan=new Scanner(System.in);

	 int test_cases=scan.nextInt();

	 while(test_cases>0)
	 {
	    int digitSum = scan.nextInt();
	    int noOfDigits = scan.nextInt();
	    Solve(digitSum , noOfDigits);
	    System.out.println();
	    test_cases--;
	 }

	 }
}
