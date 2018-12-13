class MyLinkedList{
  private int size;
  private Node start,end;
  public MyLinkedList(int newSize, Node newStart, Node newEnd) {
    size = newSize;
    start = newStart;
    end = newEnd;
  }
  public int size() {
    return size;
  }
  public boolean add(int value) {
    Node what = new Node();
    size = size + 1;
    end.setNext(newNext);
  }
  public String toString() {
    String sad = "[";
    Node index = start;
    while (index != end) {
      sad = sad + index;
      index = getNext();
    }
    return sad;
  }
}
