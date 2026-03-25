import java.util.ArrayList;
public class Pilha {
    private ArrayList<Integer> pilha = new ArrayList<>();

    //Inserçáo -- push
    public void push(int item){
        pilha.add(item);
    }
    //Remoçáo -- pop
    public Integer pop(){
        if (!pilha.isEmpty()){
            return pilha.remove(pilha.size()-1);
        }
        return null;
    }
    //Consulta do Topo -- peek
    public Integer peek(){
        if (!pilha.isEmpty()){
            return pilha.get(pilha.size()-1);
        }
        return null;
    }
    //Ver se está Vazia
    public boolean isEmpty(){
        return pilha.isEmpty();
    }
    //class main
    public static void main(String[] args){
        Pilha pilha = new Pilha();
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);

        System.out.println("Elemento no Topo: "+pilha.peek());
        System.out.println("Primeiro a Sair: "+pilha.pop());
        System.out.println("Está Vazia?: "+pilha.isEmpty());
    }
}
