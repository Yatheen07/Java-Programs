import java.io.*;

class Solution{
    private static boolean[] primes;
    public static void generateSieve(int input){

        primes = new boolean[input+1];
        for(int i=2;i<input;i++)
            primes[i] = true;

        for(int i=2;i*i<input;i++)
        {
            if(primes[i]){
                for(int j=i*i;j<=input;j+=i){
                    primes[j]=false;
                }
            }
        }
    }
    public static void main(String ar[]) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());
        generateSieve(input);

        int flag = 0;
        for(int i=2 ; i<=input/2;i++){
            if(primes[i]){
                if(primes[input - i])
                {
                    System.out.println("The required sum is : "+input+" = "+i+" + "+(input-i));
                    flag = 1;
                }
            }
        }
        if(flag==0)
            System.out.println("No such sum");
    }
}
