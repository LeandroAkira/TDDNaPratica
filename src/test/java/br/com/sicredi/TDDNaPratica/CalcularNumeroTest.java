package br.com.sicredi.TDDNaPratica;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcularNumeroTest {

    @Test
    public void deveSomarCartasABC(){
        String cartasEscolhidas = "ABC";
        int numeroCalculado = 0;

        assertEquals(7, numeroCalculado);
    }
}
