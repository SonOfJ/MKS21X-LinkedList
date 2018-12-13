class Node{
 private int data;
 private Node next,prev;
 public Node (int newData, Node newNext, Node newPrev) {
   data = newData;
   next = newNext;
   prev = newPrev;
 }
 public int getData() {
   return data;
 }
 public Node getNext() {
   return next;
 }
 public Node getPrev() {
   return prev;
 }
}
