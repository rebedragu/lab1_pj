package ex1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int aria,perimetru,lungime,latime;

        System.out.println("dati lungime: ");
        lungime= scanner.nextInt();

        System.out.println("dati latimea: ");
        latime= scanner.nextInt();

        aria=lungime*latime;
        perimetru=2*(latime+lungime);

        System.out.println();
        System.out.println("Aria: "+aria);
        System.out.println("Perimetru: "+perimetru);

    }
}
