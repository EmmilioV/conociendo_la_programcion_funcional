package com.sofka.taller_practica_de_mentoria;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CalculadoraFuncional {
    public static void main(String[] args) {


        BiFunction<Integer, Integer, Integer> sumar = (a, b) -> a + b;
        BiFunction<Integer, Integer, Integer> restar = (a, b) -> a - b;

        //multiplicacion
        IntBinaryOperator multiplicar = (a,b)->
                IntStream.range(0,b+1)
                        .reduce((acumulador,numero)-> sumar.apply(acumulador,a))
                        .getAsInt();

        //Division
        IntBinaryOperator dividir = (numerador, denominador) ->
            IntStream.range(0,denominador+1)
                    .reduce((acumulador, numero) -> {
                        if(multiplicar.applyAsInt(numero,denominador)<=numerador){
                            return acumulador += 1;
                        }
                        return acumulador;
                    })                    .getAsInt();

        System.out.println(sumar.apply(1, 2));
        System.out.println(restar.apply(1, 2));
        System.out.println(multiplicar.applyAsInt(2, 3));
        System.out.println(dividir.applyAsInt(24, 4));
    }
}
