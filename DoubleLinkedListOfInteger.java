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


// 8. int set(index, e): substitui o valor na posição index pelo elemento
  // passado por parâmetro e retorna o valor antigo.
  /* */
  public int set(int index, int element) 
  {
    if (index < 1 || index > count) 
    {
      System.out.println("A posição de índice está fora dos limites válidos.");
      return -1;
    }
    if (isEmpty()) 
    {
      System.out.println("A lista está vazia");
      return -1;
    }

    Node auxNode = header;
    int auxIndex = 1;

    while (auxIndex < index) 
    {
      auxNode = auxNode.next;
      auxIndex++;
    }

    int valorAntigo = auxNode.element;
    auxNode.element = element;
    return valorAntigo;
  }


  // 9. int removeByIndex (int index): remove o elemento da posição index
  /* */
  public int removeByIndex(int index) 
  {
    if (index < 1 || index > count) 
    {
      // Verifica se o índice está fora dos limites válidos
      System.out.println("A posição de índice está fora dos limites válidos.");
      return -1;
    }
    if (isEmpty()) 
    {
      // Verifica se a lista está vazia
      System.out.println("A lista está vazia.");
      return -1;
    }
    if (index == 1) 
    {
      // Caso o índice seja 1, o primeiro elemento da lista será removido
      int valorRemovido = header.element;

      if (count == 1) 
      {
        // Se a lista contém apenas um elemento, ela ficará vazia
        header = null;
        trailer = null;
      } else 
      {
        // Se houver mais elementos na lista, a cabeça (header) é movida para o próximo
        // elemento
        header = header.next;
      }
      count--;
      return valorRemovido;
    }
    if (index == count) 
    {
      // Caso o índice seja igual ao tamanho da lista, o último elemento da lista será
      // removido
      int valorRemovido = trailer.element;
      Node auxNode = header;

      for (int i = 1; i < count - 1; i++) 
      {
        // Encontra o nó anterior ao último nó
        auxNode = auxNode.next;
      }

      trailer = auxNode;
      trailer.next = null;
      count--;
      return valorRemovido;
    }
    // Se o índice não é o primeiro nem o último, o elemento na posição index é
    // removido
    Node auxNode = header;
    for (int i = 1; i < index - 1; i++) 
    {
      // Encontra o nó anterior ao nó a ser removido
      auxNode = auxNode.next;
    }
    // Aqui, Pegamos o elemento do nó que queremos remover, que é o nó seguinte a
    // auxNode, e armazenamos em valorRemovido.
    int valorRemovido = auxNode.next.element;
    // Alteramos o ponteiro next do nó auxNode para pular o nó que estamos
    // removendo. Isso "desconecta" o nó que queremos remover da lista, ligando
    // auxNode diretamente ao nó que estava após o nó removido.
    auxNode.next = auxNode.next.next;
    // Decrementamos o contador da lista, pois estamos removendo um elemento.
    count--;
    return valorRemovido;
  }


  // 10.boolean removeAll(int element): remove todas as ocorrência do elemento
  // passado por parâmetro e retorna true se conseguiu remover e falso caso
  // contrário.
  /* */
  public boolean removeAll(int element) 
  {
    // Verifica se a lista está vazia.
    if (isEmpty()) 
    {
      return false;
    }

    boolean removido = false; // Variável para rastrear se pelo menos um elemento foi removido.
    Node auxNode = null; // Nó anterior na lista (inicialmente nenhum nó anterior).
    Node current = header; // Nó atual na lista (começamos da cabeça da lista).

    while (current != null) {
      if (current.element == element) 
      {
        if (auxNode == null) 
        {
          // Se o elemento a ser removido está na cabeça da lista.
          header = current.next;
        } else 
        {
          // Se o elemento a ser removido não está na cabeça da lista.
          auxNode.next = current.next;
        }

        removido = true; // Atualiza a variável para indicar que pelo menos um elemento foi removido.
        current = current.next; // Avança para o próximo nó sem avançar auxNode, pois o elemento foi removido.

      } else 
      {
        // Se não encontramos uma ocorrência do elemento a ser removido, avançamos ambos
        // auxNode e current.
        auxNode = current;
        current = current.next;
      }
    }
    if (removido) 
    {
      // Pelo menos um elemento foi removido.
      return true;
    } else 
    {
      // Nenhum elemento correspondente foi encontrado.
      return false;
    }
  }


  // 11.int[] subList(int fromIndex, int toIndex): retorna um arranjo com os
  // elementos da lista original entre fromIndex (inclusivo) e toIndex
  // (exclusivo). Ex: 10, 20, 30, 40 à subList(0, 3) à 10, 20, 30
  /* */
  public int[] subList(int fromIndex, int toIndex) 
  {
    // Verifica se os índices estão dentro dos limites válidos e se fromIndex é
    // menor que toIndex.
    if (fromIndex < 0 || toIndex > count || fromIndex >= toIndex) 
    {
      return null;
    }

    int subListSize = toIndex - fromIndex;
    int[] subArray = new int[subListSize];
    Node auxNode = header;
    // Move o nó atual para a posição fromIndex
    for (int i = 0; i < fromIndex; i++) 
    {
      auxNode = auxNode.next;
    }
    // Copia os elementos da faixa desejada da lista para o array
    for (int i = 0; i < subListSize; i++) 
    {
      subArray[i] = auxNode.element;
      auxNode = auxNode.next;
    }
    return subArray;
  }


  // 12.void sort(): ordena a lista do maior para o menor elemento.
  /* */
  public void sort() 
  {
    if (isEmpty() || count == 1) 
    {
      // Não é necessário classificar uma lista vazia ou com apenas um elemento.
      return;
    }

    header = mergeSort(header);
  }

  private Node mergeSort(Node head) 
  {
    if (head == null || head.next == null) 
    {
      // A lista está vazia ou contém apenas um elemento, então já está ordenada.
      return head;
    }

    // Divide a lista em duas metades.
    Node middle = getMiddle(head);
    Node nextOfMiddle = middle.next;
    middle.next = null;

    // Recursivamente ordena as duas metades.
    Node left = mergeSort(head);
    Node right = mergeSort(nextOfMiddle);

    // Combina as duas metades ordenadas.
    Node sortedList = merge(left, right);
    return sortedList;
  }

  private Node merge(Node left, Node right) 
  {
    Node result = null;

    if (left == null) 
    {
      return right;
    }
    if (right == null) 
    {
      return left;
    }
    if (left.element >= right.element) 
    {
      result = left;
      result.next = merge(left.next, right);
    } else 
    {
      result = right;
      result.next = merge(left, right.next);
    }
    return result;
  }

  private Node getMiddle(Node head) 
  {
    if (head == null) 
    {
      return head;
    }

    Node slow = head;
    Node fast = head;

    while (fast.next != null && fast.next.next != null) 
    {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }


  // 13.void reverse(): inverte o conteúdo da lista. Ex: 2,3,4,1 à 1, 4, 3,2
  /* */
  public void reverse() 
  {
    // Verifique se a lista está vazia ou contém apenas um elemento.
    if (isEmpty() || count == 1) 
    {
      // Não há nada a fazer, a lista permanece inalterada.
      return;
    }

    Node prev = null; // Inicialmente, o nó anterior é nulo.
    Node current = header; // Começamos na cabeça da lista.
    Node next = null;

    while (current != null) 
    {
      // Armazenamos o próximo nó para não perdê-lo.
      next = current.next;

      // Invertemos o ponteiro para apontar para o nó anterior.
      current.next = prev;

      // Avançamos prev e current para a próxima iteração.
      prev = current;
      current = next;
    }

    // Atualizamos o cabeçalho e o trailer, pois o primeiro nó agora é o antigo
    // último nó.
    trailer = header;
    header = prev;
  }


  // 14.int contaOcorrencias(int element): conta o número de ocorrências do
  // elemento passado como parâmetro na lista, retornando este valor.
  /* */
  public int contaOcorrencias(int element) 
  {
    int contador = 0; // Inicializa um contador para rastrear as ocorrências.
    Node auxNode = header; // Começa na cabeça da lista.

    while (auxNode != null) 
    {
      if (auxNode.element == element) 
      {
        // Se o elemento do nó atual for igual ao elemento fornecido, incrementa o
        // contador.
        contador++;
      }
      auxNode = auxNode.next; // Avança para o próximo nó.
    }
    return contador; // Retorna o número de ocorrências encontradas.
  }

  
}
