package org;


public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();

        System.out.println(bins.sum("11111010", "00000001"));
        System.out.println(bins.mult("11111010", "00010001"));
    }
}