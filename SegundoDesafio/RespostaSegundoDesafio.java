package SegundoDesafio;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class RespostaSegundoDesafio {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigDecimal valor = scan.nextBigDecimal().setScale(2, RoundingMode.HALF_EVEN);
        Double[] notas = {100.00, 50.00, 20.00, 10.00, 5.00, 2.00};
        Double[] moedas = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
        
        System.out.println("NOTAS:");
        for(int i = 0; i < notas.length; i++) {
            BigDecimal nota = new BigDecimal(notas[i]);
            BigDecimal[] resultadoResto = valor.divideAndRemainder(nota);
            BigDecimal quantNotas = resultadoResto[0];
            System.out.printf("%.0f nota(s) de R$ %.2f\n", quantNotas, nota);
            valor = resultadoResto[1];
        }

        System.out.println("MOEDAS:");
        for(int i = 0; i < moedas.length; i++) {
            BigDecimal moeda = new BigDecimal(moedas[i]).setScale(2, RoundingMode.HALF_EVEN);
            BigDecimal[] resultadoResto = valor.divideAndRemainder(moeda);
            BigDecimal quantMoedas = resultadoResto[0];
            System.out.printf("%.0f moeda(s) de R$ %.2f\n", quantMoedas, moeda);
            valor = resultadoResto[1];
        }
    
        scan.close();
    }

}
