package br.com.sicredi.TDDNaPratica;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Cartas {

    A("A",1),
    B("B",2),
    C("C",4),
    D("D",8),
    E("E",16),
    F("F",32),
    G("G",64);

    private final String carta;
    private final int valor;

    Cartas(String carta, int valor) {
        this.carta = carta;
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public static List<Cartas> getCartasSelecionadas(List<String> cartasSelecionadas) {
        return Stream.of(Cartas.values()).filter(c -> cartasSelecionadas.contains(c.carta)).collect(Collectors.toList());
    }
}
