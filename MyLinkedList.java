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
      index = index.next();
    }
    return index; //Returns the desired node
  }
  public int get(int index) {
    if (index > size - 1 || index < 0) { //Invalid input for index
      throw new IndexOutOfBoundsException("Index is out of bounds.");
    }
    return getNthNode(index).getData(); //Uses helper function to get the correct node and then gets the correct value for that node
  }
  public int set(int index, int value) {
    if (index > size - 1 || index < 0) { //Invalid input for index
      throw new IndexOutOfBoundsException("Index is out of bounds.");
    }
    Node old = getNthNode(index); //Gets the node at the desired index
    int wanted = old.getData(); //Gets the old value of the wanted node to be returned later
    old.setData(value); //Puts in the new value
    return wanted; //Returns the final integer value
  }
  public boolean contains(int value) {
    Node index = start; //Will change with the progression of the function
    for(int i = 0; i < size; i = i + 1) {
      if (index.getData() == value) { //If the value has been found
        return true; //Return true
      }
      index = index.next(); //Change to the next node
    }
    return false; //Value is not found
  }
  public int indexOf(int value) {
    Node index = start; //Will change with the progression of the function
    for(int i = 0; i < size; i = i + 1) {
      if (index.getData() == value) { //If the value is found
        return i; //Return the index
      }
      index = index.next(); //Update the node to the next one
    }
    return -1; //If the value is never found
  }
  public void add(int index, int value) {
    if (size == 0 && index != 0 || size != 0 && index > size || index < 0) { //Invalid input for index
      throw new IndexOutOfBoundsException("Index is out of bounds.");
    }
    if (size == 0) { //If adding to an empty list
      Node element = new Node(value, null, null); //There can be no previous or next elements
      size = size + 1; //The size goes from zero to one
      start = element; //The first node would be the element
      end = element; //The last node would also be the element
    } else if (index == size) { //If adding to the end of a list
      Node element = new Node(value, null, end); //The is no next element but the previous element would be the old last element
      size = size + 1; //Increase the size
      end.setNext(element); //Change the constructor of the old last element
      end = element; //New last element
    } else if (index == 0) { //If adding to the beginning of a list
      Node element = new Node(value, start, null); //The is no previous element
      size = size + 1; //Increase the size
      start.setPrev(element); //Change the constructor of the old first element
      start = element; //New first element
    } else { //If the element is in the middle of the list
      Node element = new Node(value, getNthNode(index), getNthNode(index - 1)); //The old node at the index is the next node and the previous old node is still the previous node
      size = size + 1; //Start and end are unaffected
      getNthNode(index - 1).setNext(element); //Change the next of the node before
      getNthNode(index).setPrev(element); //Change the previous of the node after
    }
  }
  public int remove(int index) {
    if (size == 0 || index > size - 1 || index < 0) { //Invalid input for index
      throw new IndexOutOfBoundsException("Index is out of bounds.");
    }
    int old = getNthNode(index).getData();
    if (index == size - 1) { //If removing at the end of a list
      getNthNode(index - 1).setNext(null); //Change the previous element's next to null
      size = size - 1; //Decrease the size
      end = getNthNode(index - 1); //New last element
    } else if (index == 0) { //If removing at the beginning of a list
      getNthNode(index + 1).setPrev(null); //Change the next element's previous to null
      size = size - 1; //Decrease the size
      start = getNthNode(index + 1); //New first element
    } else { //If the element is in the middle of the list
      getNthNode(index + 1).setPrev(getNthNode(index - 1)); //Set the next node's previous to the previous node
      getNthNode(index - 1).setNext(getNthNode(index + 1)); //Set the previous node's next to the next node
      size = size - 1; //Start and end are unaffected
    }
    return old;
  }
  public boolean remove(Integer value) {
    if (contains(value)) { //Checks to see if value exists
      remove(indexOf(value)); //Remove at the index of value
      return true; //Return true
    }
    return false; //Return false
  }
}
