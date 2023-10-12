//Să se scrie un program care generează aleatoriu un număr întreg cuprins între 0 și 20.
//Programul va determina dacă numărul aparține șirului lui Fobonacci.
package ex5;
import java.util.Random;
import java.util.Scanner;
public class MainApp {
    public static void main(String[] args)
    {
        Random random=new Random();
        int nr=random.nextInt( 21);
        int a=0,b=1;
        while(a<nr)
        {
            int aux=a;
            a += b;
            b=aux-a;
        }
        if(a==nr)
        {
            System.out.println("Numarul apartine sirulul Fibonacci "+nr);
        }
        else {System.out.println("Numarul NU apartine sirulul Fibonacci");}


    }
}
