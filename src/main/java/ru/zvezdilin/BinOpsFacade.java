package ru.zvezdilin;

public class BinOpsFacade {
    public static void main(String[] args) {
        System.out.println("Start");
    }

    public String sum(String a, String b) {
        int first = Integer.parseInt(a, 2);
        int second = Integer.parseInt(b, 2);
        return Integer.toBinaryString(first + second);
    }

    public String mult(String a, String b) {
        int first = Integer.parseInt(a, 2);
        int second = Integer.parseInt(b, 2);
        return Integer.toBinaryString(first * second);
    }
}

