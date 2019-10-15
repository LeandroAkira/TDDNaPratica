package br.com.sicredi.TDDNaPratica;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcularNumeroTest {

    @Test
    public void deveSomarCartasABC() {
        String cartasEscolhidas = "ABC";
        CalcularNumero calcularNumero = new CalcularNumero();
        int numeroCalculado = calcularNumero.soma(cartasEscolhidas);

        assertEquals(7, numeroCalculado);
    }

    @Test
    public void deveSomarCartasABCDEF() {
        String cartasEscolhidas = "ABCDEF";
        CalcularNumero calcularNumero = new CalcularNumero();
        int numeroCalculado = calcularNumero.soma(cartasEscolhidas);

        assertEquals(63, numeroCalculado);
    }

    @Test
    public void deveSomarCartasA() {
        String cartasEscolhidas = "A";
        CalcularNumero calcularNumero = new CalcularNumero();
        int numeroCalculado = calcularNumero.soma(cartasEscolhidas);

        assertEquals(1, numeroCalculado);
    }

    @Test
    public void deveSomarCartasB() {
        String cartasEscolhidas = "B";
        CalcularNumero calcularNumero = new CalcularNumero();
        int numeroCalculado = calcularNumero.soma(cartasEscolhidas);

        assertEquals(2, numeroCalculado);
    }

    @Test
    public void deveSomarCartasAB() {
        String cartasEscolhidas = "AB";
        CalcularNumero calcularNumero = new CalcularNumero();
        int numeroCalculado = calcularNumero.soma(cartasEscolhidas);

        assertEquals(3, numeroCalculado);
    }
}
