package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static ArrayList<Integer> lr = new ArrayList<>();
    static ArrayList<Integer> l = new ArrayList<>();
    static int n;

    public static void main(String[] args) {
        // write your code here
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 50; i++) {
            int x = rand.nextInt(49) + 1;
            lr.add(x);
        }
        System.out.println("Lista generata aleator este: ");
        lr.forEach(i -> System.out.print(i+" "));
        System.out.println("\n"+"Introduceti nr de elemente pe care doriti sa il contina setul:");
        n = scanner.nextInt();
        System.out.println("Introduceti elementele:");
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            l.add(x);
        }
        for (int i = 0; i < l.size(); i++)
            if (!(lr.contains(l.get(i))))
            {l.remove(i);
                i--;}
        System.out.println("Elementele setului care se gasesc in lista generata aleator sunt: ");
        l.forEach(i -> System.out.print(i+" "));
    }
}