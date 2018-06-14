import java.io.*;

class Solution{

    private static int[] input_array;

    private static int getGcd(int a,int b){
        if(b == 0)
            return a;
        else
            return getGcd(b,a%b);
    }
    private static void juggle(int[] ar , int r){

        int j,k,temp,n=ar.length,gcd = getGcd(ar.length,r);

        for(int i=0;i<gcd;i++){
            temp = ar[i];
            j=i;
            while (true){
                k=j+r;
                if(k>=n) k=k-n;
                if(k==i) break;
                ar[j] = ar [k];
                j=k;
            }
            ar[j]=temp;
        }
    }
    public static void main(String ar[]) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Length?");
        int length = Integer.parseInt(reader.readLine());
        input_array = new int[length];

        System.out.println("rotations?");
        int n = Integer.parseInt(reader.readLine());

        System.out.println("elements?");

        for(int i = 0 ; i <input_array.length ; i++)
        {
            input_array[i] = Integer.parseInt(reader.readLine());
        }

        juggle(input_array,n);

        for(int i : input_array)
        {
            System.out.print(i+" ");
        }
    }
}
