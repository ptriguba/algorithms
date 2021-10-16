package com.app02.factorial;

public class Main {

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int res = factorial.makeFactorial(5);
        System.out.println("5! res= "+res);
    }

}
