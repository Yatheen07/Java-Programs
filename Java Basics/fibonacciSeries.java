import java.io.*;
import java.util.*;

class Solution{
    public static void main(String ar[]) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the limit upto which the series must be generated?");
        int upper_limit = Integer.parseInt(reader.readLine());

        int a=0,b=1,c=0;
        do{
            System.out.print(a+" ");
            c=a+b; 
            a=b;
            b=c;
        }while(a<=upper_limit);


    }
}
