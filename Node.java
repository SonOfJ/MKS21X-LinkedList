class Node{
 private int data;
 private Node next,prev;
 public Node (int newData) {
   data = newData;
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
 public int setData(int i) {
   int K = data;
   data = i;
   return K;
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
