package br.com.sicredi.TDDNaPratica;

public class CalcularNumero {

    public int soma( String cartas){

        int numeroCalculado = 0 ;
        if(cartas.contains("A")){
            numeroCalculado += 1;
        }
        if(cartas.contains("B")){
            numeroCalculado += 2;
        }
        if(cartas.contains("C")){
            numeroCalculado += 4;
        }

        return numeroCalculado;
    }
}
