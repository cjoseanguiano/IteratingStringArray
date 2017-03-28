package com.company;

public class Main {

    private String[] tops = {"A", "B", "C", "D", "E"};

    public Main() {
        int size = tops.length;
        for (int i = 0; i < size; i++) {
            System.out.println(tops[i]);
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}