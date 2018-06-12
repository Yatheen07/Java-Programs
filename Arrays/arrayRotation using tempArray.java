import java.io.*;

class Solution{
    public static void main(String ar[]) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Length?");
        int length = Integer.parseInt(reader.readLine());
        int[] input_array = new int[length];

        System.out.println("rotations?");
        int n = Integer.parseInt(reader.readLine());

        System.out.println("elements?");
        for(int i = 0 ; i <input_array.length ; i++)
        {
            input_array[i] = Integer.parseInt(reader.readLine());
        }

        int[] temp_array = new int[n];

        for(int i =0 ; i<n;i++)
        {
            temp_array[i] = input_array[i];
        }

        int temp_len1 = temp_array.length;

        int s=n;

        while(s>0)
        {
            for(int i=0 ; i < input_array.length - 1 ;i ++)
            {
                    input_array[i]=input_array[i+1];
            }
            s--;
        }
        s=1;
        while(temp_len1 > 0)
        {
            input_array[input_array.length - s] = temp_array[temp_array.length - s];
            s++;
            temp_len1--;
        }

        System.out.println("Result!");
        for(int i : input_array){
            System.out.println(i);
        }
    }
}
