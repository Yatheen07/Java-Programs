import java.util.*;
import java.io.*;

class Solution{
    public static void main(String ar[]) throws Exception{
        //Type 1: Scanner Class
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String b= scan.next();
        //String c = scan.nextLine();

        //type 2: Buffered reader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String d = reader.readLine();
        int e = Integer.parseInt(reader.readLine());

        System.out.println(a+""+b+""+d+""+e);
    }
}
