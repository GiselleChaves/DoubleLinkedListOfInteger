import java.util.LinkedList;
import  java.util.Random;
import  java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        DoubleLinkedListOfInteger linkedList = new DoubleLinkedListOfInteger();
        Scanner in = new Scanner(System.in);
        int option;

        do{

            System.out.println("-------- Choyse an option --------");
            System.out.println("1 - Method isEmpty");
            System.out.println("2 - Method size");
            System.out.println("3 - Method contains");
            System.out.println("4 - Method indexOf");
            System.out.println("5 - Method clear");
            System.out.println("6 - Method add");
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

                System.out.println("Resposta do Método: " + valueIsEmpty);
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

                System.out.println("Resposta do Método: " + valueSize);
                System.out.println("Tempo de Execução do Método size : " + runTimeSize);
                System.out.println("");
                break;

                //MÉTODO ADD NÃO ESTÁ FUNCIONANDO!!!!!
            }
                
        }while(option != 0);
    }

        /*long runTime = 0;
        long start = System.currentTimeMillis();
        
        generateList(list);
        
        long end = System.currentTimeMillis();
        runTime = end - start;
        }
          System.out.println("Tempo de Execução gerando os : " + tempoDeExecucao);
        }
        System.out.println("");*/
        
                
        

    
    public static void generateList(LinkedList list){  
        Random r = new Random();          
        for(int i=0; i<5000; i++){
            int number = r.nextInt();
            list.add(number);
        }
        System.out.println(list.size());
    }
}
