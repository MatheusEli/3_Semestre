package revisao_ed;
public class Pilha_Estatica {
    
    int elementos[];
    int topo;
    
    
    public Pilha_Estatica(){
        
        elementos = new int[10];
        topo = -1;
    }
    public void push(int elemento){
        
        if(isFull()){
            throw new RuntimeException("Stack OverFlow!");
        } 
        topo++;
        elementos[topo] = elemento;
    }
    
    public int pop(){
    
        if(isEmpty()){
            throw new RuntimeException("Empty Stack!");
        }
        int e;
        e = elementos[topo];
        
        topo --;
        return e;
        
    }
    
    public boolean isEmpty(){
        
        return (topo == -1);
    }
    
    public boolean isFull(){
    
       return(topo == 9);
    }
    
    public int top(){
    
        
        if(isEmpty()){
            throw new RuntimeException("Empty Stack!");
        }
        return elementos[topo];
    }
}
