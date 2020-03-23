package com.company;


import java.util.*;
import java.util.Comparator;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {

        ArrayList<String> boysName = new ArrayList();
        Scanner input = new Scanner(System.in);
        System.out.println(ANSI_BLUE +"Введите 5 имен мальчика:");
        boysName.add(input.nextLine());
        boysName.add(input.nextLine());
        boysName.add(input.nextLine());
        boysName.add(input.nextLine());
        boysName.add(input.nextLine());

        Iterator<String> iterA = boysName.iterator();
        while (iterA.hasNext()) {
            String a = iterA.next();
            System.out.println(ANSI_BLUE + a);
        }
        System.out.println("____________________________");

        ArrayList<String> girlsName = new ArrayList();
        System.out.println(ANSI_PURPLE + "Введите 5 имен девочки:");
        girlsName.add(input.nextLine());
        girlsName.add(input.nextLine());
        girlsName.add(input.nextLine());
        girlsName.add(input.nextLine());
        girlsName.add(input.nextLine());


        Iterator<String> iterB = girlsName.iterator();
        while (iterB.hasNext()) {
            String b = iterB.next();
            System.out.println(ANSI_PURPLE + b);
        }
        System.out.println("____________________________");

        Collections.reverse(girlsName);

        ArrayList<String> C = new ArrayList<>();
        for (int i = 0; i < girlsName.size(); i++) {
            C.add(boysName.get(i));
            C.add(girlsName.get(i));
        }

        Collections.sort(C, new Comparator<String>() {
            @Override
            public int compare(String boysName, String girlsName) {
                if (boysName.length() > girlsName.length()) {
                    return 1;
                } else if (boysName.length() < girlsName.length()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        for (String print: C) {
            System.out.println(ANSI_YELLOW + print);

        }
    }
}








