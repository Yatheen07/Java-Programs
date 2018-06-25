import java.util.*;

class Solution{

  private static Integer[] removeDupliactes(int[] arr){

    Set<Integer> unique = new HashSet<Integer>();

    for(int i : arr){
        unique.add(i);
    }

    return unique.toArray(new Integer[0]);
  }

  private static void UnionArray(Integer[] arr1,Integer[] arr2){

      int i = 0 , j = 0;

      while(i < arr1.length && j < arr2.length){

          if(arr1[i] < arr2[j]) System.out.print(arr1[i++]);
          else if(arr1[i] > arr2[j])  System.out.print(arr2[j++]);
          else{
            i++;
            System.out.print(arr2[j++]);
          }
      }

      while(i < arr1.length ) System.out.print(arr1[i++]);
      while(j < arr2.length ) System.out.print(arr2[j++]);
  }

  private static void InterSection(Integer[] arr1 , Integer[] arr2){

      int i = 0 , j = 0;

      while(i < arr1.length && j < arr2.length){
        if(arr1[i] < arr2[j]) i++;
        else if(arr1[i] > arr2[j]) j++;
        else{
          System.out.print(arr2[j]+" ");
          j++;
          i++;
        }
      }

  }

  public static void main(String ar[]) throws Exception{

        int arr1[] = {1, 2, 3, 2, 3, 4, 5};
        int arr2[] = {2, 3, 4, 5};

        System.out.println("Union of two arrays is: ");
        UnionArray(removeDupliactes(arr1), removeDupliactes(arr2));

        System.out.println("\nIntersection of two arrays is: ");
        InterSection(removeDupliactes(arr1), removeDupliactes(arr2));

  }
}
