package dev.ovidio;

import org.graalvm.collections.Pair;

public class Main {

    public static void main(String... args) {
        Pair<Character, Integer> letraMaisFrequente = letraComMaiorOcorrencia("BANANA");

        System.out.println(letraMaisFrequente);
    }

    public static Pair<Character, Integer> letraComMaiorOcorrencia(String palavra){
        int[] charsCount = new int[128];
        Pair<Character, Integer> letraMaisFrequente = Pair.create(palavra.charAt(0), 1);
        for(Character ch : palavra.toCharArray()) {
            charsCount[(int) ch]++;
            if(letraMaisFrequente.getRight() < charsCount[(int) ch]) {
                letraMaisFrequente = Pair.create(ch, charsCount[(int) ch]);
            }
        }
        return letraMaisFrequente;
    }

}