package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> flowers = new ArrayList();
        ArrayList<String> name = new ArrayList();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите 5 названий цветка:");
        String n = input.nextLine();
        String a[] = new String[5];
        for (int k = 0; k < 4; k++) {
            a[k] = input.next();
            flowers.add(a[k]);
        }
        Collections.sort(flowers);
        System.out.println("Сортированный список A-Z: ");
        for (String f : flowers) {
            System.out.println(f);
        }

        System.out.println("Введите 5 имен:");
        String m = input.nextLine();
        String b[] = new String[5];
        for (int j = 0; j < 4; j++) {
            b[j] = input.next();
            name.add(b[j]);
        }

        Collections.reverse(name);
        System.out.println("Сортированный список Z-A: ");
        for (int i = 0; i < name.size(); i++) {
            System.out.println(" " + name.get(i));

        }

        ArrayList<String> newList = new ArrayList<String>();
        newList.addAll(flowers);
        newList.addAll(name);
        System.out.println(" " + newList);

    }
}








