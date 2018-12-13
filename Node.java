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
 public Node next() {
   return next;
 }
 public Node prev() {
   return prev;
 }
 public void setData(int i) {
   data = i;
 }
 public void setNext(Node other) {
   next = other;
 }
 public void setPrev(Node other) {
   prev = other;
 }
 public String toString() {
   String K = "" + data;
   return K;  
 }
}
