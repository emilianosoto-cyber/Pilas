package org.example;

public class EjerciciosPila {

    public static String invierteCadena(String cadena) {
        if (cadena == null) {
            return "";
        }
        Pila pila = new Pila();
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            pila.push(c);
        }
        String resultado = "";
        while (!pila.isEmpty()) {
            Character c = (Character) pila.pop();
            resultado = resultado + c;
        }
        return resultado;
    }

    public static boolean revisarSintaxis(String cadena) {
        if (cadena == null) {
            return false;
        }

        Pila pila = new Pila();

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                pila.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pila.isEmpty()) {
                    return false;
                }
                char arriba = (Character) pila.pop();

                if (arriba == '(' && c != ')') return false;
                if (arriba == '[' && c != ']') return false;
                if (arriba == '{' && c != '}') return false;
            }
        }

        return pila.isEmpty();
    }
}