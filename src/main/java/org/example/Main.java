package org.example;

public class Main {
    public static void main(String[] args) {

        Pila pilaStrings = new Pila();
        pilaStrings.push("uno");
        pilaStrings.push("dos");
        pilaStrings.push("tres");
        System.out.println("Tamaño: " + pilaStrings.size());
        System.out.println("Cima: " + pilaStrings.peek());
        System.out.println("Pop: " + pilaStrings.pop());
        System.out.println("Cima ahora: " + pilaStrings.peek());

        String original = "Hola mundo";
        String invertida = EjerciciosPila.invierteCadena(original);
        System.out.println("Original: " + original);
        System.out.println("Invertida: " + invertida);

        String s1 = "{[()]}";
        String s2 = "{[(]}]";
        String s3 = "{ [ ( ] } ]";
        System.out.println("revisarSintaxis(s1) = " + EjerciciosPila.revisarSintaxis(s1));
        System.out.println("revisarSintaxis(s2) = " + EjerciciosPila.revisarSintaxis(s2));
        System.out.println("revisarSintaxis(s3) = " + EjerciciosPila.revisarSintaxis(s3));

        int[] datos = {5, 1, 4, 2, 9, 3};
        Pila pilaOrdenada = EjerciciosPila.ordenarAscendente(datos);

        System.out.println("Sacar elementos en orden (menor a mayor):");
        while (!pilaOrdenada.isEmpty()) {
            System.out.print(pilaOrdenada.pop() + " ");
        }
        System.out.println();
    }
}