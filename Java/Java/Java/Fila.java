import com.sun.tools.javac.Main;
import java.util.Scanner;
import java.util.ArrayList;
public class Fila {

    private ArrayList<Integer> fila = new ArrayList<>();

    //Inserçáo -- enqueue
    public void enqueue(int item){
        fila.add(item);
    }
    //Remoçáo -- dequeue
    public Integer dequeue(){
        if (!fila.isEmpty()){
            return fila.remove(0);
        }
        return null;
    }
    //Consulta do 1º elemento -- front
    public Integer front(){
        if (!fila.isEmpty()){
            return fila.get(0);
        }
        return null;
    }
    //Ver se a fila está vazia
    public boolean isEmpty(){
        return fila.isEmpty();
    }
    //class Main
    public static void main(String[] args){
        Fila fila = new Fila();
        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        fila.enqueue(4);
        fila.enqueue(5);
        fila.enqueue(6);
        System.out.println("Front: "+fila.front());
        System.out.println("1º a Sair: "+fila.dequeue());

        System.out.println("Está Vazia?: "+fila.isEmpty());


    }

}

