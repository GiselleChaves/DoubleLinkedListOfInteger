import java.util.LinkedList;

public class DoubleLinkedListOfInteger {
  class Node{
    public int element;
    public Node next;

    public Node(int element){
      this.element = element;
      this.next = null;
    }
  }

  private Node header;
  private Node trailer;
  private int count;

  public DoubleLinkedListOfInteger(int element){
    Node node = new Node(element);
    this.header = node;
    this.trailer = node;
    this.count = 1;
  }

  /* 
   * Methos is Empty
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
   * @return the size of the LinkedList.
   */
  public int size(){
    return count;
  }

// 3. boolean contains(int element): retorna true se a lista contém o elemento e 
// falso caso contrário 

  /* */
  public boolean contains(int element){
    if(!isEmpty()){
      
    }
  }
// 4. int indexOf(int element): retorna a posição da primeira ocorrência onde o 
// elemento está na lista
// 5. void clear(): limpa a lista
// 6. void add(int index, int element): insere um elemento na lista na posição
// indicada por index
// 7. int get(int index): retorna o elemento da posição indicada por index
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
