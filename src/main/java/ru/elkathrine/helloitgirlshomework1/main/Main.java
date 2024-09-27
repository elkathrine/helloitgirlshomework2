package ru.elkathrine.helloitgirlshomework1.main;

public class Main {

    public static void main(String[] args) {
        String x;
        x = "Katya";
        sayMerhaba(x);

        String y;
        y = "Nikita";
       sayMerhaba(y);

        System.out.println("Iyi geceler");
    }

    public static void sayMerhaba(String name) {
        System.out.println("Merhaba, " + name);
    }
}