package Exercicios;

import java.util.Scanner;

public class Exercicio_2 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Scanner ler = new Scanner(System.in);
        
        int qtdpessoas = 0,qtdpessoas90 = 0,qtdpessoas190=0,qtdpessoas10e30=0, acmidades = 0;
         
        
        Pessoa_EX2 pessoas[] = new Pessoa_EX2[2];
        
        
        for(int i=0; i<pessoas.length; i++){
            
            System.out.println("Digite o nome da pessoa: ");
            String nome = entrada.nextLine();
            
            System.out.println("Digite a idade de "+nome+": ");
            int idade = ler.nextInt();
            
            acmidades = acmidades+idade;
            
            System.out.println("Digite o peso de "+nome+": ");
            double peso = ler.nextDouble();
            
            System.out.println("Digite a altura de "+nome+": ");
            double altura = ler.nextDouble();
            
            
            if(peso > 90  &&  altura < 1.50){
                
                qtdpessoas90++;
            }
            
            if(altura > 1.90){
                
                if(idade >= 10  && idade <= 30){
                    
                    qtdpessoas10e30 ++;
                }
                
                qtdpessoas190 ++;
            }
            
            pessoas[i] = new Pessoa_EX2(idade,peso,altura);
            
            qtdpessoas ++;
        }
        
        
        
        System.out.println("Média das Idades: "+(acmidades/qtdpessoas));
        System.out.println("Quantidade de pessoas com peso superior a 90 e altura inferior a 1.50: "+qtdpessoas90);
        
        try{
            int porcentagem = ((qtdpessoas10e30*100)/qtdpessoas190);
            
            System.out.println("Porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas com mais de 1,90 de altura: "+porcentagem+"%");
        }catch(ArithmeticException ex){
            System.out.println("Não há pessoas com mais de 1,90m!");
        }
        
        
        
        
        
    }
    
}
