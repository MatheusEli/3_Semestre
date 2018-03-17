package Exercicios;

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Quantas lampadas existem no corredor?");
        int lampadas = entrada.nextInt();
        
        
        String vetor[] = new String[lampadas];
        
        for(int i = 0; i < vetor.length; i++){
            
            vetor[i] = "OFF";
            System.out.print(vetor[i]+" \n");
        }
        
        for(int i=0; i < vetor.length; i++){
            
            if(i != lampadas){
                
                for(int j = 0; j < vetor.length; j++){
                    
                    if(vetor[j].equalsIgnoreCase("ON")){
                        
                        vetor[j] = "OFF";
                    }else{
                        vetor[j] = "ON";
                    }
                }
            }
            
            if(i == lampadas){
                
                for(int k=0; k < vetor.length; k++){
                    
                    if(k%lampadas == 0){
                    
                        if(vetor[k].equalsIgnoreCase("ON")){

                            vetor[k] = "OFF";
                        }else{
                            vetor[k] = "ON";
                        }
                    }

                    }
                }
            }
        System.out.println("\n");
        
        System.out.println("Entrada: "+lampadas);
        
        String saida = "";
        
        for(int i=0; i < vetor.length; i++){
            
            saida += vetor[i]+"  ";
        }
        
        System.out.println("Saida: ["+saida+"]");
        }
    }
    

