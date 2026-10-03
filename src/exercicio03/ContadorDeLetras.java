package exercicio03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContadorDeLetras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        Map<Character, Integer> mapa = new HashMap<>();
        char letra;
        int i, quantidade;

        System.out.print("Frase: ");
        frase = sc.nextLine().toLowerCase();

        for (i = 0; i < frase.length(); i++) {
            letra = frase.charAt(i);

            if (Character.isLetter(letra)) {
                if (mapa.containsKey(letra)) {
                    quantidade = mapa.get(letra);
                    mapa.put(letra, quantidade + 1);
                } else {
                    mapa.put(letra, 1);
                }
            }
        }

        for (Character chave : mapa.keySet()) {
            System.out.println(chave + ": " + mapa.get(chave));
        }
    }
}
