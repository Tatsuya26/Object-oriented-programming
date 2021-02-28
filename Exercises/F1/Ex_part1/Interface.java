package com.company.Ex_part1;
import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Data data  = new Data();

        System.out.println("Insira um dia:");
        int day = sc.nextInt();

        System.out.println("Insira um mẽs:");
        int month = sc.nextInt();

        System.out.println("Insira um ano:");
        int year = sc.nextInt();

        System.out.println(data.Final_dayofweak(day,month,year));
    }
}
