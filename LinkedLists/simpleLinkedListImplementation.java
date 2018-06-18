import java.util.*;
import java.io.*;

class Solution{

  public static void main(String a[]) throws Exception{

    LinkedList<String> list = new LinkedList<String>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int size = Integer.parseInt(reader.readLine());

    for(int i = 0 ; i< size ;i++){
      list.add(reader.readLine());
    }

    System.out.println(list);



  }

}
