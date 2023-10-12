package ex3;

import java.util.Scanner;
public class MainApp {
        public static void main(String[]args) {
                Scanner scanner=new Scanner(System.in);
        int d=0;
        System.out.println("introdu numarul: ");
        int nr=scanner. nextInt() ;
        for (int i=1;1<=nr; i++)
        {
        if (nr%i==0)
        {
        d++;
        System. out.print (i + " ");
        }
        }
        System.out.println("\n");
        if (d==2)

        {
                System.out.println("NR este prim");
        }
        }
}