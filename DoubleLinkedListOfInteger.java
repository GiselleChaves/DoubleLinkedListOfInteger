import java.util.LinkedList;

public class DoubleLinkedListOfInteger {
  //Node node;
  LinkedList<Integer> list = new LinkedList<>();
  private Node header, trailer;
  private int count;

  public DoubleLinkedListOfInteger(){
    this.header = null;
    this.trailer = null;
    this.count = 0;
  }

  /* 
   * Method is Empty
   * Verify if the list is empty.
   * @return true if the list is empty, or false if it´s not.
  */
  public boolean isEmpty(){
    if(header == null){
      return true;
    }
    else{
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
    if(!isEmpty()){
      Node nodeAux = header;
      if(nodeAux.next.element != element){
        nodeAux= nodeAux.next;
        situation = false;
      }else{
        situation = true;
      }      
    }
    return situation;
  }
// 4. int indexOf(int element): retorna a posição da primeira ocorrência onde o 
// elemento está na lista
  /*
  *Method indexOf
  * Verify if the element is in the list and return the index position.
  * @return the index position of the element in the list.
  */
  public int indexOf(int element){
    int indexAux = 0;
    if(!isEmpty()){
      Node nodeAux = header;
      if(nodeAux.next.element != element){
        indexAux++;
      }
    }
    return indexAux;
  }

  /*
   * Method Clear
   * If the list is not empty, clear the list.
   */
  public void clear(){
    if(!isEmpty()){
      
    }
  }
  
  /*
   * Method add.
   * Insert the element passed by parameter in the list
   */
  public void add(int index, int element){
    Node aux = header;
    int countAux = 0;
    if(!isEmpty()){
      Node nodeAux = new Node(element);
      if(countAux < index){
        aux = aux.next;
        countAux++;
      }
      nodeAux.next = aux.prev;
      nodeAux.prev = aux.next.prev;
      aux.prev.next = nodeAux;
      aux.next.prev = nodeAux;
      count++;
    }
  }

  /*
   * Method get
   * Method return 
   * @return int index
   */
  public int get(int index){}

//A PARTIR DAQUI SÃO DO EDUARDO!!!!
// 8. int set(index, e): substitui o valor na posição index pelo elemento passado 
// por parâmetro e retorna o valor antigo. 
// 9. int removeByIndex (int index): remove o elemento da posição index
// 10.boolean removeAll(int element): remove todas as ocorrência do elemento 
// passado por parâmetro e retorna true se conseguiu remover e falso caso 
// contrário.
// 11.int[] subList(int fromIndex, int toIndex): retorna um arranjo com os 
// elementos da lista original entre fromIndex (inclusivo) e toIndex (exclusivo).
// Ex: 10, 20, 30, 40 à subList(0, 3) à 10, 20, 30
// 12.void sort(): ordena a lista do maior para o menor elemento.
// 13.void reverse(): inverte o conteúdo da lista. Ex: 2,3,4,1 à 1, 4, 3,2
// 14.int contaOcorrencias(int element): conta o número de ocorrências do 
// elemento passado como parâmetro na lista, retornando este valor.
  
}
