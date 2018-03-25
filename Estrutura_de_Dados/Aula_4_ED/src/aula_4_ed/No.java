package aula_4_ed;

public class No {
    
    int dado;
    No next;
    
    public No(int dd){
        
        dado = dd;
        next = null;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getNext() {
        return next;
    }

    public void setNext(No next) {
        this.next = next;
    }
    
    
}
