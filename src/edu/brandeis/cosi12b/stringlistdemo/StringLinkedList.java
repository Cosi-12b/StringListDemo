package edu.brandeis.cosi12b.stringlistdemo;

import java.util.NoSuchElementException;

public class StringLinkedList {
  private StringListNode front;

  public StringLinkedList() {
    front = null;
  }

  // Adds the given value to the end of the list.
  public void add(String value) {
    if (front == null) {
      // adding to an empty list
      front = new StringListNode(value);
    } else {
      // adding to the end of an existing list
      StringListNode current = front;
      while (current.next != null) {
        current = current.next;
      }
      current.next = new StringListNode(value);
    }
  }

  // Returns value in list at given index
  // Precondition: 0 <= index < size()
  // Pretty inefficient, eh?
  public String get(int index) {
    StringListNode current = front;
    for (int i = 0; i < index; i++) {
      current = current.next;
    }
    return current.word;
  }

  // Inserts the given value at the given index.
  // Precondition: 0 <= index <= size()
  public void add(int index, String value) {
    if (index == 0) {
      // adding to an empty list
      front = new StringListNode(value, front);
    } else {
      // inserting into an existing list
      StringListNode current = front;
      for (int i = 0; i < index - 1; i++) {
        current = current.next;
      }
      current.next = new StringListNode(value, current.next);
    }
  }

  // Removes and returns the first value.
  // Throws a NoSuchElementException on empty list.
  public String remove() {
    if (front == null) {
      throw new NoSuchElementException();
    } else {
      String result = front.word;
      front = front.next;
      return result;
    }
  }

  // Removes value at given index from list.
  // Precondition: 0 <= index < size()
  public void remove(int index) {
    if (index == 0) {
      // special case: removing first element
      front = front.next;
    } else {
      // removing from elsewhere in the list
      StringListNode current = front;
      for (int i = 0; i < index - 1; i++) {
        current = current.next;
      }
      current.next = current.next.next;
    }
  }

  public String toString() {
    if (front == null) {
      return "[]";
    } else {
      String result = "[" + front.word;
      StringListNode current = front.next;
      while (current != null) {
        result += ", " + current.word;
        current = current.next;
      }
      result += "]";
      return result;
    }
  }

  public int size() {
    int count = 0;
    StringListNode current = front;
    while (current != null) {
      current = current.next;
      count++;
    }
    return count;
  }

  public int indexOf(String value) {
    int index = 0;
    StringListNode current = front;
    while (current != null) {
      if (current.word == value) {
        return index;
      }
      index++;
      current = current.next;
    }
    return -1;
  }

  // Adds given value to list in sorted order.
  // Precondition: Existing elements are sorted

  public void addSorted(String value) {
    if (front == null || value.compareTo(front.word) <= 0) {
      // insert at front of list
      front = new StringListNode(value, front);
    } else {
      // insert in middle of list
      StringListNode current = front;
      while (current.next != null && current.next.word.compareTo(value) < 0) {
        current = current.next;
      }
      current.next = new StringListNode(value, current.next);
    }
  }

  public int length() {
    StringListNode current = front;
    int count = 0;
    while (current != null) {
      count++;
      current = current.next;
    }
    return count;
  }

}
