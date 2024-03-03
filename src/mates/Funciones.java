package mates;
import java.util.ArrayList;
import java.util.function.DoubleSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Funciones {

    // Ejercicio 1 suma
    public static int suma(int n) {
        return IntStream.rangeClosed(1, n)
        .sum();
    }

    // Ejercicio 2 Factorial
    public static int factorial(int n) {
        return IntStream.rangeClosed(1, n)
        .reduce(1, (a, b) -> a * b);
    }

    // Ejercicio 3 exponente
    public static int potencia(int base, int exponente) {
        return IntStream.range(0, exponente)
        .reduce(1, (a, b) -> a * base);
    }

    // Ejercicio 4 suma lista
    public static int sumaLista(ArrayList<Integer> lista) {
        return lista.stream().mapToInt(Integer::intValue)
        .sum();
    }

    // Ejercicio 5 media aritmética de una lista de enteros
    public static double mediaAritm(ArrayList<Integer> lista) {
        return lista.stream().mapToInt(Integer::intValue)
        .average().orElse(0.0);
    }

    // Ejercicio 6 desviación típica de una lista
    public static double desviacionT(ArrayList<Integer> lista) {
        double media = mediaAritm(lista);
        return Math.sqrt(lista.stream()
        .mapToDouble(num -> Math.pow(num - media, 2)).sum() / lista.size());
    }

    // Ejercicio 7 La suma de los primeros números pares hasta n asumiendo n ≥ 2
    public static int sumaPar(int n) {
        return IntStream.rangeClosed(0, n)
        .filter(x -> x % 2 == 0).sum();
    }

    // Ejercicio 8 suma de los elementos pares de una lista de enteros
    public static int sumaParLista(ArrayList<Integer> lista) {
        return lista.stream()
        .filter(num -> num % 2 == 0)
        .mapToInt(Integer::intValue).sum();
    }

    // EJERCICIO 9 Lista de números >= 2 obtener otra lista solo con los pares.
    public static ArrayList<Integer> listaPares(ArrayList<Integer> lista) {
        return lista.stream()
        .filter(num -> num % 2 == 0)
        .collect(Collectors.toCollection(ArrayList::new));
    }

    // Ejercicio 10 lista de los primeros números pares hasta n asumiendo n ≥ 2.
    public static ArrayList<Integer> listaDeSoloPar(int n) {
        return IntStream.rangeClosed(2, n)
        .filter(i-> i %2 == 0)
        .boxed()
        .collect(Collectors.toCollection(ArrayList::new));
    }

    // Ejercicio 11  Producto escalar de dos listas de números no vacías y del mismo tamaño.
    public static int productoEscalar(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
        return IntStream.range(0, lista1.size())
        .map(i -> lista1.get(i) * lista2.get(i)).sum();
    }

    //EJERCICIO 12 Elemento n-ésimo de la sucesión fibinacci.
    public static int fibo(int n) {
        return IntStream.range(0, n)
        .reduce(0, (a, b) -> a + b);
    }
   // Ejercicio 13 Calcule el cociente entre el decimo tercer y el decimo segundo elementode la sucesión de Fibonacci,
    // y compare el resultado con 1+√52 .
    public static DoubleSupplier cociente = () -> {
        int fibonacciNMinus1 = fibo(13);
        int fibonacciNMinus2 = fibo(12);
        return (double) fibonacciNMinus1 / fibonacciNMinus2;
    };

    // Ejercicio 14 Averigüe la relación entre la sucesión de Fibonacci y la razón áurea.
    public static DoubleSupplier razonAurea = () -> (1 + Math.sqrt(5)) / 2;
}


