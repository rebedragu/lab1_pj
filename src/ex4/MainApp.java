package ex4;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {


    Random random=new Random();
    int x,y;

    x=random.nextInt(31);
    y = random.nextInt(31);

    System.out.println("x="+x);
    System.out.println("y="+y);

    if(x!=0&&y!=0)
    {
        while(x!=y)
        {
            if(x>y)
                x=x-y;
            else
                y=y-x;
        }
        System.out.println("CMMDC="+x);
    }
    else
        System.out.println("nu au divizor comun!");

}}

