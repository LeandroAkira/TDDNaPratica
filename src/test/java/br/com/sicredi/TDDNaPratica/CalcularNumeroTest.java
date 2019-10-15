package br.com.sicredi.TDDNaPratica;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcularNumeroTest {

    @Test
    public void deveSomarCartasABC(){
        String cartasEscolhidas = "ABC";
        CalcularNumero calcularNumero = new CalcularNumero();
        int numeroCalculado = calcularNumero.soma(cartasEscolhidas);

        assertEquals(7, numeroCalculado);
    }
}
