package PrimeiroDesafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RespostaPrimeiroDesafio{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer linhas = scan.nextInt();

        List<Integer> par = new ArrayList<>();
        List<Integer> impar = new ArrayList<>();

        for(int i = 0; i < linhas; i++){
            Integer num = scan.nextInt();
            if(num % 2 == 0){
                par.add(num);

            } else {
                impar.add(num);

            }
        }

        par.sort((num1, num2) -> Integer.compare(num1, num2));
        impar.sort((num1, num2) -> Integer.compare(num1, num2));
        Collections.reverse(impar);
        
        par.forEach(System.out::println);
        impar.forEach(System.out::println);

        scan.close();
    }
}