import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class DesafioJavaQueue {

    public static void main(String[] args) {

        //Criando a fila
        Queue<String> minhaFila = new LinkedList<>();

        //Adicionando os nomes a fila
        minhaFila.add("Juliana");
        minhaFila.add("Pedro");
        minhaFila.add("Carlos");
        minhaFila.add("Larissa");
        minhaFila.add("João");

        //Percorrendo a fila com for
        for(String filaM: minhaFila){
            System.out.println("Imprimindo a fila com for: "+filaM);
        }

        //Percorrendo a fila com Iterator

        Iterator<String> it = minhaFila.iterator();
        while(it.hasNext()){
            System.out.println("Imprimindo a fila com Iterator: "+it.next());
        }

        //Retornando o primeiro elemento sem removê-lo
        System.out.println("Primeiro da fila "+minhaFila.peek());
        System.out.println("Imprimindo a fila: "+minhaFila);

        //Retornando e removendo o primeiro elemento da fila
        System.out.println("Imprimindo a fila: "+minhaFila);
        System.out.println("Removendo o primeiro elemento da fila: "+minhaFila.poll());
        System.out.println("Imprimindo a fila: "+minhaFila);

        //Adicionando um novo elemento
        minhaFila.add("Daniel");
        System.out.println("Verificando se Daniel está na Fila: "+minhaFila.contains("Daniel"));


        //Retornando o tamanho da fila
        System.out.println("Qual o tamanho da fila? "+minhaFila.size());

        //Verificando se a fila está vazia
        System.out.println("A fila está vazia? "+minhaFila.isEmpty());

        //Verificando se o nome Carlos está na fila
        System.out.println("O Carlos está na fila? "+minhaFila.contains("Carlos"));


    }

}
