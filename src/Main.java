package com.company;

public class Main {

    public static void main(String[] args)  {
        int a = 77;
        int b = 33;
        int c = 55;

        int valor = suma(a,b,c);
        System.out.println(valor);
    }

    public static int suma(int a, int b, int c)   {
        int i = a + b + c;
        return i;
    }

}
