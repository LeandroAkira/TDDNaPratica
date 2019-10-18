package br.com.sicredi.TDDNaPratica;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CalcularNumeroTest {

    @Test
    public void deveSomarCartasABC() {
        List<Cartas> cartasEscolhidas = Cartas.getCartasSelecionadas(Arrays.asList("A", "B", "C"));
        CalcularNumero calcularNumero = new CalcularNumero();
        int numeroCalculado = calcularNumero.soma(cartasEscolhidas);

        assertEquals(7, numeroCalculado);
    }

    @Test
    public void deveSomarCartasDE() {
        List<Cartas> cartasEscolhidas = Cartas.getCartasSelecionadas(Arrays.asList("D", "E"));
        CalcularNumero calcularNumero = new CalcularNumero();
        int numeroCalculado = calcularNumero.soma(cartasEscolhidas);

        assertEquals(24, numeroCalculado);
    }

    @Test
    public void deveSomarCartasA() {
        List<Cartas> cartasEscolhidas = Cartas.getCartasSelecionadas(Arrays.asList("A"));
        CalcularNumero calcularNumero = new CalcularNumero();
        int numeroCalculado = calcularNumero.soma(cartasEscolhidas);

        assertEquals(1, numeroCalculado);
    }

    @Test
    public void deveSomarCartasB() {
        List<Cartas> cartasEscolhidas = Cartas.getCartasSelecionadas(Arrays.asList("B"));
        CalcularNumero calcularNumero = new CalcularNumero();
        int numeroCalculado = calcularNumero.soma(cartasEscolhidas);

        assertEquals(2, numeroCalculado);
    }

    @Test
    public void deveSomarCartasAB() {
        List<Cartas> cartasEscolhidas = Cartas.getCartasSelecionadas(Arrays.asList("A","B"));
        CalcularNumero calcularNumero = new CalcularNumero();
        int numeroCalculado = calcularNumero.soma(cartasEscolhidas);

        assertEquals(3, numeroCalculado);
    }

    @Test
    public void deveSomarCartasFG() {
        List<Cartas> cartasEscolhidas = Cartas.getCartasSelecionadas(Arrays.asList("F","G"));
        CalcularNumero calcularNumero = new CalcularNumero();
        int numeroCalculado = calcularNumero.soma(cartasEscolhidas);

        assertEquals(96, numeroCalculado);
    }

    @Test
    public void deveSomarCartasABCDEFG() {
        List<Cartas> cartasEscolhidas = Cartas.getCartasSelecionadas(Arrays.asList("A","B","C","D","E","F","G"));
        CalcularNumero calcularNumero = new CalcularNumero();
        int numeroCalculado = calcularNumero.soma(cartasEscolhidas);

        assertEquals(127, numeroCalculado);
    }
}
