package aula_5_ed;
public class Fila_Estatica {
    
    long[]valores;
    int primeiro;
    int ultimo;
    int total;
    
    
    
    public Fila_Estatica(int maxSize){
        
        valores = new long[maxSize];
        primeiro = 0;
        ultimo = 0;
        total = 0;
    }
}
