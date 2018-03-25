package aula_5_ed;

public class Fila {
    
    
    private int[] valores;
    private int primeiro;
    private int ultimo;
    private int total;
    
    public Fila(){
    
        valores = new int[10];
        primeiro = 0;
        ultimo = 0;
        total = 0;
    }
    
    public void inserir(int elemento){
        
        if(isFull()){
            
            throw new RuntimeException("Fila Cheia!");
        }
            valores[ultimo] = elemento;
            ultimo = (ultimo + 1) % valores.length;
            total ++;
        
    }
    
    public int retirar(){
        if(isEmpty()){
            
            throw new RuntimeException("Fila Vazia!");
        }
        int elemento = valores[primeiro];
        primeiro = (primeiro + 1)%valores.length;
        total --;
        return elemento;
    }
    
    public boolean isEmpty(){
        return total == 0;
    }
    
    public boolean isFull(){
        return total == valores.length;
    }
}
