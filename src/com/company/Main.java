package com.company;

public class Main {

    public static void main(String[] args) {

    }

    public static String tA(int age, int temp) {
        if (age >= 45 && temp >= 30) {
            System.out.println("age:" + age + "temp:" + temp);
            return "Можно идти гулять";
        } else if (age <= 20 || temp <= 28) {
            return "Можно идти гулять";
        } else if (age <= 45 || temp <= 28) {
            return "можно идти гулять";
        } else if (age == 56 && temp == -10) {
            System.out.println("остовайтесь дома ");
        } else {
            System.out.println("можно идти гулять");
        }
        return "остовайтесь дома";
    }{
    }
}





