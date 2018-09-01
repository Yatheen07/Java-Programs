import java.util.*;

class Solution{
  Node head;

  static class Node{
    int data;
    Node next;

    Node(int d){
      data = d;
    }
  }

  public void printList(){
    Node n = head;

    while(n != null){
      System.out.print(n.data+"-->");
      n = n.next;
    }
    System.out.println("null");
  }

  public static void main(String a[]){
    Solution list = new Solution();

    list.head = new Node(1);
    Node q = new Node(2);
    Node w = new Node(3);

    list.head.next = q;
    q.next = w;

    list.printList();

  }

}
