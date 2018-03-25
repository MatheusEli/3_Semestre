package revisao_ed;

public class Revisao_ED {
    public static void main(String[] args) {
        
        Pilha_Dinamica pilhaDin = new Pilha_Dinamica();
        
        for(int i=100; i >= 0; i--){
            
            pilhaDin.push(i);
        }
        
        System.out.println(pilhaDin.display());
        
        
        for(int i=0; i <= 100; i++){
            
            pilhaDin.pop();
        }
        
        System.out.println(pilhaDin.display());
    }
    
}
