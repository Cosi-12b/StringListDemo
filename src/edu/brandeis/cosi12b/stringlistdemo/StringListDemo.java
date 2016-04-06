package edu.brandeis.cosi12b.stringlistdemo;

public class StringListDemo {

  public static void main(String[] args) {
    // example1();
    // example2();
    // example3();
    // example4();
    // example5();
      new TestSuite().runAll();
  }

  private static void example1() {
    StringListNode list = new StringListNode();
    list.word = "House";
    list.next = new StringListNode();
    list.next.word = "Joke";
    list.next.next = new StringListNode();
    list.next.next.word = "Mole";
    list.next.next.next = null;

    System.out.println(list.word + " " + list.next.word + " " + list.next.next.word);
  }
  
  public static void example2() {
    StringListNode list = 
         new StringListNode("House", 
             new StringListNode("Joke",
                 new StringListNode("Mole", null)));
    System.out.println(list.word + " " + list.next.word + " " + list.next.next.word);
  }
  
  public static void example3() {
    StringListNode list1 = new StringListNode("A", new StringListNode("B", null));
    StringListNode list2 = new StringListNode("X", new StringListNode("Y", null));
    System.out.println("Before: ");
    printList("list1", list1);
    printList("list2", list2);
    
    list1.next.next = list2;
    list2 = list2.next;
    list1.next.next.next=null;

    System.out.println("\nAfter: ");
    printList("list1", list1);
    printList("list2", list2);

  }
  
  public static void example4() {
    StringLinkedList l1 = new StringLinkedList();
    l1.add("Maura");
    l1.add("Jiayi");
    l1.add("Nicole");
    System.out.println(l1);
  }
  
  public static void example5() {
    StringLinkedList l1 = new StringLinkedList();
    l1.addSorted("Remi");
    l1.addSorted("Maura");
    l1.addSorted("Jiayi");
    l1.addSorted("Nicole");
    l1.addSorted("Maura");
    System.out.println(l1);
  }

  public static void printList(String name, StringListNode n) {
    System.out.print(name + ":     ");
    while (n != null) {
      System.out.print(n.word  + " ->   ");
      n = n.next;
    }
    System.out.println("null");
  }

}
