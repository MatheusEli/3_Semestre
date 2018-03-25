package aula_3;

public class Pilha {
    
    private long[]vetorpilha;
    private int topo;
    
    public Pilha(int maxSize){
        
        vetorpilha = new long[maxSize];
        topo = -1;
    }
    
    public boolean isEmpty(){
        
        return(topo == -1);
    }
    
    public boolean isFull(){
        
        return(topo == this.vetorpilha.length-1);
    }
    
    public void push(long elemento){
        
        if(!isFull())
            topo ++;
            vetorpilha[topo] = elemento;
    }
    
    public long pop(){
        
        if(!isEmpty())
            return vetorpilha[topo--];
        else
            return -1;
    }
    
    public long peek(){
        
        if(!isEmpty())
            return vetorpilha[topo];
        else
            return -1;
    }
}
