package day01;

import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        int n;
        int total=0;
        Scanner scan = new Scanner(System.in);

        do {System.out.println("sayı giriniz:");
            n= scan.nextInt();
            if ((n%2==0)&&(n%4==0)){
                total+=n;


            }
        } while ((n!=1)&&(n%2==0));
        System.out.println("toplam:" +total);
    }
}
