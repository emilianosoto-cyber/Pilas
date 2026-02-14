package org.example;
import java.util.ArrayList;

public class Pila {
    private ArrayList<Object> datos = new ArrayList<>();

    public void push(Object valor) {
        datos.add(valor);
    }

    public Object pop() {
        if (isEmpty()) {
            return null;
        }
        return datos.remove(datos.size() - 1);
    }

    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return datos.get(datos.size() - 1);
    }

    public boolean isEmpty() {
        return datos.isEmpty();
    }

    public int size() {
        return datos.size();
    }
}