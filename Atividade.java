package AtividadeAvaliacao;

import java.util.Scanner;

public class Atividade {
    Scanner sc= new Scanner(System.in);
    public void atividade1() {
        System.out.println("Digite 1 Adição, 2 Subtração,3 Multiplicação,4 Divisão");
        int valor1= sc.nextInt();
        System.out.println("Informe o primeiro Numero Inteiro");
        int numero1=sc.nextInt();
        System.out.println("Informe o Segundo Numero Inteiro");
        int numero2=sc.nextInt();
       

       
      
       
      
        
       
       
        if (valor1==1) {
           int ResultadoFinal=sc.nextInt();
           ResultadoFinal= numero1+numero2;
           System.out.println("Resultado Final"+ResultadoFinal);

            
        }
        else if (valor1==2){
            int ResultadoFinal=sc.nextInt();
            ResultadoFinal= numero1-numero2;
            System.out.println("Resultado Final"+ResultadoFinal);
            
            

        }
        else if (valor1==3){
            int ResultadoFinal=sc.nextInt();
            ResultadoFinal= numero1*numero2;
            System.out.println("Resultado Final"+ResultadoFinal);
            
            

        }
        else if (valor1==4){
            int ResultadoFinal=sc.nextInt();
            ResultadoFinal= numero1/numero2;
            System.out.println("Resultado Final"+ResultadoFinal);
            
            

        }
     

        
       
        
    }
    public void atividade2() {
        System.out.println("Digite Número da Matrícula de 1-1000");
        int matricula1=1;
        int matricula2=2;
        int matricula3=3;
        int matricula4=4;
        int Aluno=sc.nextInt();
       
        if (Aluno==matricula1) {
            System.out.println("Aluno 1 Vai ser do Time do Chris");
            
        }
        else if(Aluno==matricula2){
            System.out.println("Aluno 2 Vai ser do Time do Greg");

        }
        else if(Aluno==matricula3){
            System.out.println("Aluno 3 Vai ser do Time do Caruso");

        }
        else if(Aluno==matricula4){
            System.out.println("Aluno 4 Vai ser do Time do Jerome");

        }
        else if(matricula4<=1001){
            System.out.println("Número invalido");
        }
        



        
    }
    public void atividade3() {
        System.out.println("Digite a Quantidade em Kg Morangos");
        int pesoMorango=sc.nextInt();
        System.out.println("Digite a Quantidade em Kg Maçãs");
        int pesoMacas=sc.nextInt();
        System.out.println("Digite a Quantidade em Kg Bananas");
        int pesoBanana=sc.nextInt();
        double MacasValor=1.8;
        double morangoValor=2.5;
        double bananaValor=1.3;
        double desconto=0.0;
        double precoTotal=(pesoMorango*morangoValor)+(pesoMacas*MacasValor)+(pesoBanana*bananaValor);
        double valorFinalMorangos=morangoValor*pesoMorango;
        double valorFinalMacas=MacasValor*pesoMacas;
        double valorFinalBananas=bananaValor*bananaValor;
        if (pesoMorango>=8||valorFinalMorangos<=25) {
            desconto=valorFinalMorangos+(valorFinalMorangos*10/100);

            
            
        }
        else if (pesoMacas<=8||valorFinalMacas<=25) {
            desconto=valorFinalMacas+(valorFinalMacas*10/100);
           
            
         
            
        }
        else if (pesoBanana<=8||valorFinalBananas<=25) {
            desconto=valorFinalBananas+(valorFinalBananas*10/100);
          
            
        }
        
        System.out.println("Valor Total"+precoTotal+"R$");
        






        
    }
    
}
