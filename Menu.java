import java.util.LinkedList;
import java.util.Scanner;
import  java.util.Random;

public class Menu {

  public void menu(){
    DoubleLinkedListOfInteger linkedList = new DoubleLinkedListOfInteger();
    Scanner in = new Scanner(System.in);
    int option;

    do{

      System.out.println("-------- Choyse an option --------");
      System.out.println("1 - Method isEmpty");
      System.out.println("2 - Method size");
      System.out.println("3 - Method add");
      System.out.println("4 - Method contains");
      System.out.println("5 - Method indexOf");
      System.out.println("6 - Method clear");
      System.out.println("7 - Method get");
      System.out.println("8 - Method set");
      System.out.println("9 - Method removeByIndex");
      System.out.println("10 - Method removeAll");
      System.out.println("11 - Method subList");
      System.out.println("12 - Method sort");
      System.out.println("13 - Method reverse");
      System.out.println("14 - Method accountOccurrences");
      System.out.println("0 - To go out");
      System.out.println();
      System.out.print("Write the choised option: ");
      option = in.nextInt();
      System.out.println();
      

      switch(option){
          case 1:
          System.out.println("----------------- Method isEmpty -----------------");
          
          long runTimeIsEmpty = 0;
          long startIsEmpty = System.currentTimeMillis();
          
          boolean valueIsEmpty = linkedList.isEmpty();
          
          long endIsEmpty = System.currentTimeMillis();
          runTimeIsEmpty = endIsEmpty - startIsEmpty;

          System.out.println("Resposta do Método IsEMpty: " + valueIsEmpty);
          System.out.println("Tempo de Execução do Método isEmpty : " + runTimeIsEmpty);
          System.out.println("");
          break;

          case 2: //MÉTODO ADD NÃO ESTÁ FUNCIONANDO!!!!!
          System.out.println("----------------- Method size -----------------");
          
          long runTimeSize = 0;
          long startSize = System.currentTimeMillis();
          
          int valueSize = linkedList.size();
          
          long endSize = System.currentTimeMillis();
          runTimeSize = endSize - startSize;

          System.out.println("Resposta do Método size: " + valueSize);
          System.out.println("Tempo de Execução do Método size : " + runTimeSize);
          System.out.println("");
          break;

          case 3:
          System.out.println("----------------- Method Add -----------------");
          
          long runTimeAdd = 0;
          long startAdd = System.currentTimeMillis();
          
          LinkedList list = linkedList.generateList();
          
          long endAdd = System.currentTimeMillis();
          runTimeAdd = endAdd - startAdd;

          System.out.println("Resposta do Método: Os valores adicionados à lista são:" + list);
          System.out.println("Tempo de Execução do Método Add : " + runTimeAdd);
          System.out.println("");
          break;

          case 4:
          System.out.println("----------------- Method Contains -----------------");
          
          long runTimeContains = 0;
          long startContains = System.currentTimeMillis();
          
          boolean returnContais = linkedList.contains(17);
          
          long endContains = System.currentTimeMillis();
          runTimeContains = endContains - startContains;

          System.out.println("Resposta do Método Contains: " + returnContais);
          System.out.println("Tempo de Execução do Método Contains : " + runTimeContains);
          System.out.println("");
          break;

          case 5:
          System.out.println("----------------- Method indexOf -----------------");
          
          long runTimeIndexOf = 0;
          long startIndexOf = System.currentTimeMillis();
          

          int returnIndexOf = linkedList.indexOf(568942);

          long endIndexOf = System.currentTimeMillis();
          runTimeIndexOf = endIndexOf - startIndexOf;

          System.out.println("Resposta do Método indexOf: " + returnIndexOf);
          System.out.println("Tempo de Execução do Método indexOf : " + runTimeIndexOf);
          System.out.println("");
          break;

          case 6:
          System.out.println("----------------- Method clear -----------------");
          
          long runTimeClear = 0;
          long startClear = System.currentTimeMillis();
          

          linkedList.clear();

          long endClear = System.currentTimeMillis();
          runTimeClear = endClear - startClear;

          System.out.println("Tempo de Execução do Método clear : " + runTimeClear);
          System.out.println("");
          break;

          case 7:
          System.out.println("----------------- Method get -----------------");
          
          long runTimeGet = 0;
          long startGet = System.currentTimeMillis();
          

          int returnGet = linkedList.get(7);

          long endGet = System.currentTimeMillis();
          runTimeGet = endGet - startGet;

          
          System.out.println("Resposta do Método get: " + returnGet);
          System.out.println("Tempo de Execução do Método get : " + runTimeGet);
          System.out.println("");
          break;

          case 8:
          System.out.println("----------------- Method set -----------------");
          
          long runTimeSet = 0;
          long startSet = System.currentTimeMillis();
          

          int returnSet = linkedList.set(7, 16);

          long endSet = System.currentTimeMillis();
          runTimeSet = endSet - startSet;

          
          System.out.println("Resposta do Método get: " + returnSet);
          System.out.println("Tempo de Execução do Método get : " + runTimeSet);
          System.out.println("");
          break;
      } 
    } while(option != 0);
  }
}
