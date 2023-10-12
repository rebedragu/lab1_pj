package ex2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.lang.Object;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args){

        String numeFisierIn="src/ex2/in.txt";
        String numeFisierOut = "src/ex2/out.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader((numeFisierIn)))){
            String linie;

            List<Integer> numere = new ArrayList<>();

            while((linie=reader.readLine())!=null){
                int numar = Integer.parseInt(linie);
                numere.add(numar);
            }


            int suma = 0;

            for ( int numar : numere)
            {
                suma=suma+numar;
            }

            float media= (float)suma/numere.size();

            int valMin= (int) numere.get(0);

            for( int numar : numere){
                if(numar<valMin)
                    valMin=numar;
            }


            int valMax= (int) numere.get(0);

            for( int numar : numere){
                if(numar>valMax)

                    valMax = numar;
            }


            System.out.println("Suma numerelor : " +suma);
            System.out.println("Media aritmetica : " +media);
            System.out.println("Valoarea minima : " +valMin);
            System.out.println("Valoarea maxima : " +valMax);

            PrintStream flux_out= new PrintStream(numeFisierOut);

            for(int numar:numere)
            {
                flux_out.println(numar);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
}}
