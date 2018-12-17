class MyLinkedList{
  private int size;
  private Node start,end;
  public MyLinkedList() {
    size = 0; //Creates an empty list with length of zero
  }
  public int size() {
    return size; //Returns the length of the list
  }
  public boolean add(int value) {
    if (size == 0) { //If the list is only supposed to have one element
      Node element = new Node(value, null, null); //There can be no previous or next elements
      size = size + 1; //The size goes from zero to one
      start = element; //The first node would be the element
      end = element; //The last node would also be the element
    } else { //What if the list were to have more than one element
      Node element = new Node(value, null, end); //The is no next element but the previous element would be the old last element
      size = size + 1; //Increase the size
      end.setNext(element); //Change the constructor of the old last element
      end = element; //New last element
      return true; //This is a boolean function
    }
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
