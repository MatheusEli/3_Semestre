package Exercicios;

public class Exercicio_1 {

    public static void main(String[] args) {
      
    int vetor[] = new int[1001];    
    int termos = 0;
    for(int i = 1; i <= 1000; i++){    
        
        int num = i;
        termos = 0;
        while(num > 1   ||  num == 1){
            
            termos ++;
            System.out.print(num+" > ");
            
            if(num%2 == 0){
            
                num = num/2;
            }else{
            
                if(num == 1){
                    
                    break;
                }else{
                
                    num = 3*num+1;
                }
            }
            
        }
        vetor[i] = termos;
        System.out.println("--- "+termos+" TERMOS");
        
    }
    
    int maior = 0;
    int posicao = 0;
    for(int i=0; i<vetor.length; i++){
        
        if(vetor[i] > maior){
        
            maior = vetor[i];
            posicao = i;
        }
    }
    
        System.out.println("\n O numero que produz a maior sequencia é: "+(posicao+1)+" tendo "+maior+" sequencias!");
    }
    
}
