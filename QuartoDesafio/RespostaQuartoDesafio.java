package QuartoDesafio;

import java.util.Scanner;

public class RespostaQuartoDesafio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantTestes = scan.nextInt();
        scan.nextLine();
        String[] frases = new String[quantTestes];
        
        for(int i = 0; i < quantTestes; i++){ 
            String frase = scan.nextLine();
            frases[i] = frase;
            
        }

        for (String fraseEmb : frases) {
            StringBuilder builder = new StringBuilder();
            StringBuilder builder2 = new StringBuilder();

            int index = fraseEmb.length()/2;

            String metade1 = fraseEmb.substring(0, index);
            builder.append(metade1);
            builder.reverse();
            String metadeFrase1 = builder.toString();


            String metade2 = fraseEmb.substring(index);
            builder2.append(metade2);
            builder2.reverse();
            String metadeFrase2 = builder2.toString();

            
            String fraseDesemb = metadeFrase1 + metadeFrase2;
            System.out.println(fraseDesemb);
        };

        scan.close();
    }
}
