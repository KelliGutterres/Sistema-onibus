/* Onibus: 
- int passageiro (quantidade de passageiros atuais)
- double valorPassagem (valor fixo para o dia)
- double caixaTotal (final do dia o valor total de passagens)
- int totalPassageiros (quantos passageiros passaram pelo onibus)*/

package br.univates.l04_onibus;

/* @author kelli.gutterres */

public class L04_Onibus {

    public static void main(String[] args) {
        
        String menu = "Digite a operação que deseja realizar:\n\n"+       
                 "[E] para EMBARCAR Passageiro\n" +
                 "[D] para DESEMBARCAR Passageiro\n"+
                 "[C] para CONSULTAR DADOS\n"+
                 "[R] para REINICIALIZAR\n"+
                 "[X] para SAIR";
        
       int capacMax = Entrada.leiaInt("Digite a Capacidade Máxima de passageiros no Ônibus: ");
       double vPass = Entrada.leiaDouble("Informe qual o valor da Passagem: ");
       char opcao = 'V';
        
       Onibus onib = new Onibus(capacMax,vPass);
       
       while(opcao != 'X' || opcao != 'x'){
           
           opcao = Entrada.leiaChar(menu);
           
           if(opcao == 'E'|| opcao != 'e'){

               if(onib.embarcar()){
               
                   System.out.println("Passageiro Embarcado com sucesso!");
               }
               else{
                   System.out.println("Erro ao Embarcar o Passageiro! :( ");
               }
               System.out.println("Há "+onib.getPasEmbarcados()+ " passageiros embarcados!");
           }
           if(opcao == 'D'|| opcao != 'd'){
               
               if(onib.desembarcar()){
               
                   System.out.println("Passageiro Desembarcado com sucesso!");
               }
               else{
                   System.out.println("Erro ao Desembarcar o Passageiro! :( ");
               }
               System.out.println("Restam "+(capacMax-onib.getPasEmbarcados())+ " lugares no Ônibus!");
           }
           if(opcao == 'C' || opcao != 'c'){
               
               System.out.println("/n DADOS DO ÔNIBUS: ");
               System.out.println("Total de Passageiros durante o dia: "+onib.passageiroDia());
               System.out.println("Valor Total do Caixa do dia: "+onib.getValorTotal());
           }
           if(opcao == 'R' || opcao != 'r'){
               
               if(onib.reinicializar()){
                   
                   System.out.println("Sistema Reinicializado com sucesso!");
               }
               else{
                   System.out.println("Erro ao Reinicializar o sistema!");
               }
           }
       }
    }
}