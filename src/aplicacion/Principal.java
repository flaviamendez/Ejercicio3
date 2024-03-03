package aplicacion;

import java.util.ArrayList;

import mates.*;

public class Principal{

    public static void main(String[] args) {
        ArrayList<Integer> listaP = new ArrayList<>();
        listaP.add(1);
        listaP.add(2);
        listaP.add(3);
        listaP.add(4);

        ArrayList<Integer> lista1 = new ArrayList<>();
        listaP.add(3);
        listaP.add(6);
        listaP.add(1);
        listaP.add(4);
        ArrayList<Integer> lista2 = new ArrayList<>();
        listaP.add(1);
        listaP.add(5);
        listaP.add(9);
        listaP.add(7);
        

        System.out.println("1. Suma: " + Funciones.suma(10));
        System.out.println("2. Factorial: " + Funciones.factorial(5));
        System.out.println("3. Potencia: " + Funciones.potencia(2, 3));
        System.out.println("4. Suma de lista: " + Funciones.sumaLista(lista1));
        System.out.println("5. Media: " + Funciones.mediaAritm(listaP));
        System.out.println("6. Desviación típica: " + Funciones.desviacionT(lista2));
        System.out.println("7. Suma de pares: " + Funciones.sumaPar(9));
        System.out.println("8. suma de los elementos pares de una lista de enteros " + Funciones.sumaParLista(lista2));
        System.out.println("9. Lista de números >= 2 obtener otra lista solo con los pares. " + Funciones.listaPares(listaP));
        System.out.println("10. lista de los primeros números pares hasta n asumiendo n ≥ 2 " + Funciones.listaDeSoloPar(10));




    }
}
