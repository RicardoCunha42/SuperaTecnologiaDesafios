package PrimeiroDesafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RespostaPrimeiroDesafio{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int linhas = scan.nextInt();

        List<Integer> par = new ArrayList<>();
        List<Integer> impar = new ArrayList<>();

        for(int i = 0; i < linhas; i++){
            int num = scan.nextInt();
            if(num % 2 == 0){
                par.add(num);

            } else {
                impar.add(num);

            }
        }

        Collections.sort(par);
        Collections.sort(impar);
        Collections.reverse(impar);
        
        par.forEach(System.out::println);
        impar.forEach(System.out::println);

        scan.close();
    }
}