package edu.brandeis.cosi12b.stringlistdemo;

public class StringListNode {
  String word;
  StringListNode next;
  
  public StringListNode() {
    this("", null);
  }
  
  public StringListNode(String word) {
    this(word, null);
  }
  
  public StringListNode(String word, StringListNode next) {
    this.word = word;
    this.next = next;
  }
}