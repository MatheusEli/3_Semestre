package aula_3;

public class AppPilha {
    public static void main(String[] args) {
        
        Pilha pilha = new Pilha(3);
        
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        
        System.out.println("Elemento do topo: "+pilha.peek());
        
        pilha.pop();
        
        System.out.println("Novo elemento do topo: "+pilha.peek());
    }
    
}
