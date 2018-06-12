import java.io.*;

class Solution{
    private static boolean[] array;
    private static void generateSieve(int n){

        for(int i = 2 ; i < array.length;i++)
            array[i]=true;

        for(int i = 2; i*i < n ;i++)
        {
            if(array[i])
            {
                for(int j = i*2 ; j <= n ; j+=i)
                {
                    array[j]=false;
                }
            }
        }

    }
    public static void main(String ar[]) throws Exception{

        System.out.println("Enter the number upto which you want to generate primes.");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input =  Integer.parseInt(reader.readLine());
        array = new boolean[input+1];

        //TO GENERATE A SERIES OF PRIME NUMBERS
        generateSieve(input);
        for(int i=2;i<array.length;i++){
            if(array[i])
            {
                System.out.print(i+" ");
            }
        }

        //CHECK FOR A PARTICULAR NUMBER
        System.out.println("\nEnter the number you want to check for prime? ");
        int isPrime = Integer.parseInt(reader.readLine());
        generateSieve(isPrime);
        System.out.println(array[isPrime]);
    }
}
