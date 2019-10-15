package br.com.sicredi.TDDNaPratica;

import java.util.List;

public class CalcularNumero {

    public int soma( List<Cartas> cartas){
        return cartas.stream().mapToInt(Cartas::getValor).sum();
    }
}
