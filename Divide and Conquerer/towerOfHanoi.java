import java.util.*;

class Solution{
  private static void towerOfHanoi(int plates , String src , String dest , String aux){

    if(plates == 1){
      System.out.println("Move the top plate from |"+ src +" | "+dest);
      return;
    }
    else{
      towerOfHanoi(plates - 1 , src , aux , dest);
      System.out.println("Move the top plate from |"+ src +" | "+dest);
      towerOfHanoi(plates - 1 , aux , dest , src);
    }

  }

  public static void main(String ar[]){
    System.out.println("Tower Of Hanoi through Recursion: \nThe steps involved in moving 3 plates from source rod to destination rod are as follows: \n");
    towerOfHanoi(4,"Src - A","Dst - C","Aux - B");
  }
}
