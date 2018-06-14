import java.util.*;
import java.io.*;

class Solution{

    private static int[] array;

    private static void pushZerosToEnd(int[] array){
        int count=0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]!=0){
                array[count++] = array[i];
            }
        }
        while(count<array.length)
            array[count++] = 0;
    }
    public static void main(String ar[]) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        array = new int[]{1,2,3,4,0,0,5,6,0,7,8,0};
        pushZerosToEnd(array);
        for(int i : array){
            System.out.print(i+" ");
        }

    }

}
