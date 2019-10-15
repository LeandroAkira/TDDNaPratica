package br.com.sicredi.TDDNaPratica;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CartasTest {

    @Test
    public void deveRetornarCartasSelecionadas() {
        final List<String> cartasDesejadas = Arrays.asList("A", "B", "C");
        final List<Cartas> cartasSelecionadas = Cartas.getCartasSelecionadas(cartasDesejadas);
        assertEquals(Cartas.A ,cartasSelecionadas.get(0));
        assertEquals(Cartas.B ,cartasSelecionadas.get(1));
        assertEquals(Cartas.C ,cartasSelecionadas.get(2));
    }
}