import java.util.LinkedList;
import java.util.Random;

public class DoubleLinkedListOfInteger {
  LinkedList<Integer> list = new LinkedList<>();
  private Node header, trailer;
  private int count;

  public DoubleLinkedListOfInteger(){
    this.header = null;
    this.trailer = null;
    this.count = 0;
  }

  public LinkedList<Integer> generateList(){  
    LinkedList<Integer> list = new LinkedList<>();

    Random r = new Random();    

    for(int i=0; i<150; i++){
        int number = r.nextInt();
        list.add(i, number);
        count++;
    }
    return list;
  }

  /* 
   * Method is Empty
   * Verify if the list is empty.
   * @return true if the list is empty, or false if it´s not.
  */
  public boolean isEmpty(){
    if(count == 0){
      return true;
    } else {
      return false;
    }
  }
  
  /*
   * Method Size
   * Verify the size of the list.
   * @return the size of the LinkedList.
   */
  public int size(){
    return count;
  }

  /* 
  * Method contains
  * Verify if the element informed by parameter is in the list.
  *@return true if the element informed by parameter is in the list, our false if it does not.
  */
  public boolean contains(int element){
    boolean situation = false;
    Node nodeAux = header;
    if(!isEmpty()){
      while(nodeAux != trailer){
        if(nodeAux.element != element){
          nodeAux = nodeAux.next;
          situation = false;
        }else{
          situation = true;
        }    
      }  
    }
    return situation;
  }

  /*
  *Method indexOf
  * Verify if the element is in the list and return the index position.
  * @return the index position of the element in the list.
  */
  public int indexOf(int element){
    int indexAux = 0;
    if(!isEmpty()){
      Node nodeAux = header;
      while(nodeAux != trailer){
        if(nodeAux.element == element){
          return indexAux;
        }
          nodeAux = nodeAux.next;
          indexAux++;
        }
      }
      return -1;
    }

  /*
   * Method Clear
   * If the list is not empty, clear the list.
   */
  public void clear(){
    if(!isEmpty()){
      Node nodeAux = header;
        while (nodeAux != null) {
          Node nextNode = nodeAux.next;
          nodeAux.prev = null;
          nodeAux.next = null;
          nodeAux = nextNode;
        }
        header = null;
        trailer = null;
        count = 0;
    }
    System.out.println("Lista foi completamente esvaziada.");
  }
  
  /*
   * Method add.
   * Insert the element passed by parameter in the list
   */
  public void add(int index, int element){
    int countAux = 0;
    Node newNode = new Node(element);

    if(!isEmpty()){
      newNode.prev = header;
      newNode.next = trailer;
      count++;
    }else{
      Node nodeAux = header;
      while(countAux < index-1){
        nodeAux = nodeAux.next;
        countAux++;
      }
      newNode.prev = nodeAux;
      newNode.next = nodeAux.next;
      nodeAux.next = newNode;
      nodeAux.next.prev = nodeAux;
    }
  }

  /*
   * Method get
   * Return the element in the index passed by parameter
   * @return int index
   */
  public int get(int index){
    if (index < 0) {
      return -1;
    }

    Node nodeAux = header;
    int nodeAuxIndex = 0;

    while (nodeAuxIndex < index) {
      nodeAux = nodeAux.next;
      nodeAuxIndex++;
    }

    if (nodeAux.element != 0) {
      return nodeAux.element;
    } else {
      return -1;
    }
  }

  /*
   * Method set
   * Replace the element of the index for the element passed by parameter
   * @return the element replaced
   */
  public int set(int index, int element) 
  {
    if (index < 1 || index > count) {
      return -1;
    }

    if (isEmpty()) {
      return -1;
    }

    Node auxNode = header;
    int auxIndex = 0;

    while (auxIndex < index) {
      auxNode = auxNode.next;
      auxIndex++;
    }

    int previousValue = auxNode.element;
    auxNode.element = element;
    return previousValue;
  }

  /*
   * Method remove by index
   * Remove the element in the index passed by parameter
   * @return a int element
   */
  public int removeByIndex(int index) {
    if ((index < 1 || index > count)  && (isEmpty())) {
      return -1;
    }

     if (index == 1) {
      int valorRemovido = header.element;

      if (count == 1) {
        header = null;
        trailer = null;
      } else {
        header = header.next;
      }
      count--;
      return valorRemovido;
    }
    if (index == count) {
      int valorRemovido = trailer.element;
      Node auxNode = header;

      for (int i = 1; i < count - 1; i++) {
        auxNode = auxNode.next;
      }

      trailer = auxNode;
      trailer.next = null;
      count--;
      return valorRemovido;
    }
    Node auxNode = header;
    for (int i = 1; i < index - 1; i++) {
      auxNode = auxNode.next;
    }
    int valorRemovido = auxNode.next.element;
    auxNode.next = auxNode.next.next;
    count--;
    return valorRemovido;
  }

  /*
   * Method removeAll
   * Remove all the ocorrences of the element passed by parameter
   * @return true if the element was revmoved or false if was not
   */
  public boolean removeAll(int element) {
    if (isEmpty()) {
      return false;
    }

    boolean removido = false; 
    Node auxNode = null; 
    Node current = header; 

    while (current != null) {
      if (current.element == element) {
        if (auxNode == null) {
          header = current.next;
        } else {
          auxNode.next = current.next;
        }

        removido = true; 
        current = current.next; 
      } else {
        auxNode = current;
        current = current.next;
      }
    }
    if (removido) {
      return true;
    } else {
      return false;
    }
  }

  /*
   * Method subList
   * return an array with the elements to the inicial to end index passed by  parameter
   * @return an array with the elements to the inicial to end index passed by  parameter
   */
  public int[] subList(int fromIndex, int toIndex) {
    if (fromIndex < 0 || toIndex > count || fromIndex >= toIndex) {
      return null;
    }

    int subListSize = toIndex - fromIndex;
    int[] subArray = new int[subListSize];
    Node auxNode = header;

    for (int i = 0; i < fromIndex; i++) {
      auxNode = auxNode.next;
    }
    for (int i = 0; i < subListSize; i++) {
      subArray[i] = auxNode.element;
      auxNode = auxNode.next;
    }
    return subArray;
  }

  /*
   * Method Sort
   * Order the list
   */
  public void sort() {
    if (isEmpty() || count == 1) {
      return;
    }

    header = mergeSort(header);
    }

    private Node mergeSort(Node head) {
    if (head == null || head.next == null) {
      return head;
    }

    Node middle = getMiddle(head);
    Node nextOfMiddle = middle.next;
    middle.next = null;

    Node left = mergeSort(head);
    Node right = mergeSort(nextOfMiddle);
    Node sortedList = merge(left, right);
    return sortedList;
  }

  private Node merge(Node left, Node right) {
    Node result = null;

    if (left == null) {
      return right;
    }
    if (right == null) {
      return left;
    }
    if (left.element >= right.element) {
      result = left;
      result.next = merge(left.next, right);
    } else {
      result = right;
      result.next = merge(left, right.next);
    }
    return result;
  }

  private Node getMiddle(Node head) {
    if (head == null) {
      return head;
    }

    Node slow = head;
    Node fast = head;

    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  /*
   * Method Reverse
   * invert the elements of the list
   */
  public void reverse() {
    if (isEmpty() || count == 0) {
      return;
    }

    Node prev = null; 
    Node nodeAux = header;
    Node next = null;

    while (nodeAux != null) {
      next = nodeAux.next;
      nodeAux.next = prev;
      prev = nodeAux;
      nodeAux = next;
    }

    trailer = header;
    header = prev;
  }

  /*
   * Method occurrentAccounts
   * Return the number of occurrent of the element
   * @return the number of occurrent of the element
   */
  public int occurrencesAccount(int element) 
  {
    int contador = 0; 
    Node auxNode = header;

    while (auxNode != null) {
      if (auxNode.element == element) {
        contador++;
      }
      auxNode = auxNode.next;
    }
    return contador;
  }
}