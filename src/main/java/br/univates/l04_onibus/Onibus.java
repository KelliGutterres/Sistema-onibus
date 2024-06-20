/*- int passageiro (quantidade de passageiros atuais)
        - double valorPassagem (valor fixo para o dia)
        - double caixaTotal (final do dia o valor total de passagens)
        - int totalPassageiros (quantos passageiros passaram pelo onibus)*/

package br.univates.l04_onibus;

/**
 * @author kelli.gutterres
 */
public class Onibus {

    private int pasEmbarcados;
    private int capacMax;
    private double valorPassag;
    private double valorTotal;

    public Onibus(int capacMax, double valorPassag) {
        this.pasEmbarcados = 0;
        this.capacMax = capacMax;
        this.valorPassag = valorPassag;
        this.valorTotal = 0;
    }
    
    public boolean embarcar(){
        
        boolean ok = false;
    
        if(pasEmbarcados < capacMax){
            
            pasEmbarcados++;
            valorTotal += valorPassag;
            
            ok = true;
        }
        return ok;
    }
    
    public boolean desembarcar(){
        
        boolean ok = false;
    
        if(pasEmbarcados > 0){
            
            pasEmbarcados--;
            ok = true;
        }
        return ok;
    }
    
    public double passageiroDia(){
        
        double dia = (valorTotal/valorPassag);
        return dia;
    }
    
    public boolean reinicializar(){
        
        pasEmbarcados = 0;
        capacMax = 0;
        valorPassag = 0;
        valorTotal = 0;
        
        return true;
    }

    public int getPasEmbarcados() {
        return pasEmbarcados;
    }

    public int getCapacMax() {
        return capacMax;
    }

    public void setCapacMax(int capacMax) {
        
        this.capacMax = capacMax;
    }

    public double getValorPassag() {
        return valorPassag;
    }

    public void setValorPassag(double valorPassag) {
        this.valorPassag = valorPassag;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}