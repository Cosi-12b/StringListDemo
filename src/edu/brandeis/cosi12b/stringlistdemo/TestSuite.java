package edu.brandeis.cosi12b.stringlistdemo;

public class TestSuite {

  public void runAll() {
    test1();
    test2();
    test3();
    test4();
    test5();
    test6();
    test7();
  }

  /*
   * Test Suites
   */
  public boolean test1() {
    StringLinkedList l = new StringLinkedList();
    if (l.length() != 0) {
      return error("Test1");
    } else
      return success("Test1");
  }

  public boolean test2() {
    StringLinkedList l = new StringLinkedList();
    l.add("Seth");
    if (l.length() != 1) {
      return error("Test2");
    } else
      return (success("Test2"));
  }

  public boolean test3() {
    StringLinkedList l = new StringLinkedList();
    l.add("Seth");
    l.add("Elana");
    if (!l.toString().equals("[Seth, Elana]")) {
      return error("Test3: " + l.toString());
    } else {
      return success("Test3");
    }
  }

  public boolean test4() {
    StringLinkedList list1 = new StringLinkedList();
    list1.add("Shuyuan");
    list1.add("Nora");
    list1.add("Qifu");
    list1.add("Austin");
    if (list1.length() != 4)
      return error("test4: Length ne 4");
    if (!list1.get(1).equals("Nora"))
      return error("test4: add in the middle index 2 was: " + list1.get(2));
    return success("test4");
  }

  public boolean test5() {
    StringLinkedList list1 = new StringLinkedList();
    list1.add("Shuyuan");
    list1.add("Nora");
    list1.add("Qifu");
    list1.add("Austin");
    list1.remove(2);
    if ((list1.length() != 3) || (!list1.get(2).equals("Austin"))) {
      return error("test5: remove in the middle failed");
    }
    return success("test5");

  }

  public boolean test6() {
    StringLinkedList list1 = new StringLinkedList();
    list1.add("Shuyuan");
    list1.add("Nora");
    list1.add("Qifu");
    list1.add("Austin");
    list1.remove(2);
    if (list1.indexOf("Qifu") != -1)
      return error("test6: indexof error");
    return success("test6");
  }

  public boolean test7() {
    StringLinkedList list1 = new StringLinkedList();
    list1.add("Shuyuan");
    list1.add("Nora");
    list1.add("Qifu");
    list1.add("Austin");
    list1.remove(0);
    if (!list1.get(0).equals("Nora")) {
      return error("test7: Remove 0 failed");
    } else {
      return success("test7");
    }
  }

  /*
   * Utility methods
   */

  private boolean error(String message) {
    System.out.println("ERROR: " + message);
    return false;
  }

  private boolean success(String message) {
    System.out.println("OK: " + message);
    return true;
  }
}
