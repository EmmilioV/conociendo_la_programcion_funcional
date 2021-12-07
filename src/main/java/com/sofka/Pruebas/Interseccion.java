package com.sofka.Pruebas;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Interseccion {

    public BiFunction<List<Integer>,List<Integer>, List<Integer>> intersection = (lista1, lista2) ->
        lista1.stream()
                .filter(value -> lista2.contains(value))
                //.filter(lista2::contains)
                .collect(Collectors.toList());

    public Function<Integer,Integer> sumar3 = (a) -> a+3;
    public Function<Integer,Integer> multiplicar2 = (a) -> a*2;

    public Function<Integer, Integer> compuesta = sumar3.compose(multiplicar2);
}
