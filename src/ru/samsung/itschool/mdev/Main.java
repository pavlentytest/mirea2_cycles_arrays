package ru.samsung.itschool.mdev;

import java.util.ArrayList;
import java.util.Scanner;

/*
Степанов Павел
Иванов Иван
Правдин Александр
Мазурова Варвара
Кадыров Амир
Гусаров Андрей
Байдак Данила
Бураменская Яна
Кузнецов Андрей
Исаев Александр
Иванова Надежда
Понкратов Николай
Юдов Станислав
Деревянко Иван
Федосеев Ярослав
*/

public class Main {

    public static void main(String[] args) {

        int x = 0;
        while(x > 0 || x != 3 && x==5) {

        }

        do {

        } while(x < 0);

        for(int i=0; i<10; i++) {
            if(i == 5) {
                // continue; // переход к след. итерации ++
                break; // выход из цикла
            }
            // здесь какой-то код
        }

        int[] a = new int[5]; // 0 0 0 0 0
        int b[]; // null
        b = new int[10];

        for(int i=0;i<b.length;i++) {
            //System.out.print(b[i] + " ");
        }
     //   for(int i: b)
       //     System.out.print(i + " "); // foreach

        int[] c = {6,4,2,900,-9333};
        c[2] = 45;

        int[][] y = new int[4][5];
        for(int i=0;i<y.length;i++) {
            for(int j=0;j<y[i].length;j++) {
                System.out.print(y[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int[][] p = {{1,5,4},{5},{5,7,1,9,10,-6}};

        int[][] pp = new int[4][];

        for(int i=0;i<p.length;i++) {
            for(int j=0;j<p[i].length;j++) {
                System.out.print(p[i][j] + " ");
            }
            System.out.println();
        }

        ArrayList al = new ArrayList<>(); // 20
        al.add(0);
        al.add(1000);
        al.add("dfgadfgasdfg");
        al.add(new Object());

       // int v = (int)al.get(2);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(890);
        list.add(333);
      //  list.add("adfgadfg");


        int g;
        if(x == 100){
             g = 900;
        }
        g = 1000;

        Scanner scan = new Scanner(System.in);
        for(int i=0;i<10;i++) {
            b[i] = scan.nextInt();
        }
        for(int i: b)
            System.out.print(i + " "); // foreach


    }
}
