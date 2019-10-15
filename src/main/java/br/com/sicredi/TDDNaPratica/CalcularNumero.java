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
        if(cartas.contains("D")){
            numeroCalculado += 8;
        }
        if(cartas.contains("E")){
            numeroCalculado += 16;
        }
        if(cartas.contains("F")){
            numeroCalculado += 32;
        }

        return numeroCalculado;
    }
}
