package com.sofka.Main;

import com.sofka.Pruebas.Interseccion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args) {
        Interseccion interseccion = new Interseccion();
        List<Integer> lista1 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> lista2 = Arrays.asList(9,8,3,23,5,0);

        System.out.println(interseccion.compuesta.apply(3));
        System.out.println(interseccion.intersection.apply(lista1, lista2));
        System.out.println(interseccion.sumar3.apply(2));
        System.out.println(interseccion.multiplicar2.apply(3));
    }
}
