package TerceiroDesafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RespostaTerceiroDesafio {
    public static int getPares(int alvo, List<Integer> numeros) {
        int pares = 0;
        for(int numero : numeros){
            for(int j = 0; j < numeros.size(); j++){
                if(numero - numeros.get(j) == alvo){
                    pares++;
                }
            }
        }
        return pares;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[] nk  = scan.nextLine().split(" ");
        int tamanho = Integer.parseInt(nk[0]);
        int alvo = Integer.parseInt(nk[1]);

        String[] array = scan.nextLine().split(" ");
        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < tamanho; i++) {
            numeros.add(Integer.parseInt(array[i]));
        }
        
        System.out.println(getPares(alvo, numeros));
        scan.close();
    }
}

