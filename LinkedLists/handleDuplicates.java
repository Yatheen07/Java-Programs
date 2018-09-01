import java.util.*;

class Solution{

  public static HashMap<String,Integer> map = new HashMap<String,Integer>();

  public static void usingCollections(){
    LinkedList<String> list = new LinkedList<String>();

    list.add("Yatheen");
    list.add("Vp");
    list.add("veebha");
    list.add("Sneha");
    list.add("Some Joker");

    boolean status = true;

    for(int i =0;i<list.size();i++){
      String data = list.get(i);
      if(!(list.indexOf(data) == list.lastIndexOf(data)))
        status = false;
    }

    System.out.println(status);

  }

  Node head;

  static class Node{
    String data;
    Node next;
    Node(String d){
      data = d;
    }
  }

  public boolean checkDuplicates(){
    Node n = head;
    boolean status = false;
    map.clear();
    while(n != null){
      String data =  n.data;
      if(map.containsKey(data)){
        status = true;
      }
      else{
        map.put(data,1);
      }
      n = n.next;
    }
    System.out.println(status);
    return status;
  }

  public void removeDuplicates(){
    Node n = head;
    boolean status = true;
    while(n != null){
      String data =  n.data;
      if(map.containsKey(data)){
        if(n.next.next == null){
          n.next = null;
          return;
        }
      }
      n = n.next;
    }
  }

  public void removeDuplicatesWithoutBuffer(){
    Node current = head;
    while( current != null){
      Node runner = current;
      while(runner.next != null){
        if(runner.next.data == current.data){
          runner.next = runner.next.next;
        }
        else{
          runner = runner.next;
        }
      }
      current = current.next;
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

  public static void main(String ar[]){
    Solution list = new Solution();
    list.head = new Node("Yatheen");
    Node Sneha = new Node("Sneha");
    Node ashu = new Node("Ashu");
    Node veebha = new Node("Sneha");
    Node vp = new Node("Vp");

    list.head.next = vp;
    vp.next = veebha;
    veebha.next = ashu;
    ashu.next = Sneha;

    list.printList();
    boolean containsDuplicates = list.checkDuplicates();
    if(containsDuplicates){
      list.removeDuplicatesWithoutBuffer();
    }
    list.printList();

  }
}
