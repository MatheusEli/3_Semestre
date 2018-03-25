package revisao_ed;

public class Pilha_Dinamica {
    
    private No topo;
    
    public Pilha_Dinamica(){
        
        this.topo = null;
        //Pilha Vazia
    }
    
    public boolean isEmpty(){
        
        //true se a lista estiver vazia
        return(topo == null);
    }
    
    //Não há método isFull!
    
    public void push(int dado){
        
            No newNo = new No(dado);
            
            newNo.setNext(this.topo);
            this.topo = newNo;
    }
    
    public int pop(){
    
        if(!isEmpty()){
            
            No temp = topo;
            topo = topo.getNext();
            return temp.getDado();
            
        }else{
            
            return -1;
        }
    }
    
    public String display(){
        String retorno = "";
        
        if(isEmpty()){
            
            retorno += "Pilha Vazia!!";
        }else{
            
            No atual = this.topo;
            
            while(atual!=null){
                
                retorno += atual.getDado() + " ";
                atual = atual.getNext();
            }
        }
        return retorno;
    }
}
