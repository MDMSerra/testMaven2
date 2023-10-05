package org.egg.entities;

public class Calculadora {

    private float a;
    private float b;

    public Calculadora(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float sumar(){
        return a+b;
    }
}
