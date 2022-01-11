package com.ega;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        {
            int[] a = {1, 2, 3, 4, 5, 6};
            int[] b = {1, 2, 3, 4, 5, 6};

            //a
            Random n = new Random();
            int randName = n.nextInt(a.length);
            System.out.println(a[randName]);
            //b
            Random m = new Random();
            int randName1 = m.nextInt(b.length);
            System.out.println(b[randName1]);

            //Lielāks>mazāks=vienāds.
            if (randName > randName1) {
                System.out.println("Lielāks");}
            else if (randName == randName1) {
                    System.out.println("Vienāds");}
                else
                    System.out.println("Mazāks");



        }




    }
}

