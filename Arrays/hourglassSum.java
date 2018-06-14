import java.io.*;
import java.util.*;

class Solution{

    static int hourglassSum(int[][] arr) {
        int max_sum = Integer.MIN_VALUE;

        for(int i=0 ;i < 3 ; i++){
            for(int j=0 ; j < 3 ; j++){
                int sum = 0;
                sum = arr[i][j]
                    + arr[i][j+1]
                    + arr[i][j+2]
                    + arr[i+1][j+1]
                    + arr[i+2][j]
                    + arr[i+2][j+1]
                    + arr[i+2][j+2] ;

                max_sum = Math.max(max_sum , sum);

            }
        }

        return max_sum ;
    }

    public static void main(String ar[]) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //int input = Integer.parseInt(reader.readLine());

        int arr[][] = {{1, 2, 3, 0, 0},
                    {0, 0, 0, 0, 0},
                    {2, 1, 4, 0, 0},
                    {0, 0, 0, 0, 0},
                    {1, 1, 0, 1, 0}};

        System.out.println("The required Sum is: "+ hourglassSum(arr));
    }
}
