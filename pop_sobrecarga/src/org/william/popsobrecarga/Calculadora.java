package org.william.popsobrecarga;

public class Calculadora  {
    public int sumar(int a , int b){
        return a + b;
    }

    public int sumar(int... argumentos){
        int total = 0;
        for (int i = 0; i < argumentos.length; i++) {
            total += i;
        }
         return total;
    }

    public float sumar(float a , float b){
        return a + b;
    }
    public float sumar(int i,float j){
        return i + j;
    }
    public float sumar(float i,int j){
        return i + j;
    }
}
