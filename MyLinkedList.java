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
      return true; //This is a boolean function
    } else { //What if the list were to have more than one element
      Node element = new Node(value, null, end); //The is no next element but the previous element would be the old last element
      size = size + 1; //Increase the size
      end.setNext(element); //Change the constructor of the old last element
      end = element; //New last element
      return true; //This is a boolean function
    }
  }
  public String toString() {
    String sad = "["; //Creates the string of a new list
    if (size == 0) {
      return "[]"; //This is what should be returned if the list is empty
    }
    Node index = start; //This runs through the entire list
    while (index != end) { //While index is not the last index
      sad = sad + index.getData() + ", "; //Add the current element to the string
      index = index.next(); //Changes to next element
    }
    sad = sad + index.getData() + "]"; //At the last element now
    return sad; //Return the final product
  }
  private Node getNthNode(int n) { //Helper function
    Node index = start;
    for(int i = 0; i < n; i = i + 1) { //Goes through the list until hitting n
      index = index.getNext();
    }
    return index; //Returns the desired node
  }
  public int get(int index) {
    if (index > size - 1 || index < 0) { //Invalid input for index
      throw new IndexOutOfBoundsException("Index is out of bounds.");
    }
    Node old = getNode
  }
}
