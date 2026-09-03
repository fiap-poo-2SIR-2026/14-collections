package exercicio03;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main() {
        Map<Integer, Aluno> mapa = new HashMap<>();

        mapa.put(10, new Aluno(10, "Carlos"));
        mapa.put(20, new Aluno(20, "Beatriz"));
        mapa.put(10, new Aluno(10, "Carlos"));

        mapa.forEach((rm, aluno) -> {
            System.out.println(aluno);
        });

        System.out.println(mapa.containsKey(10));
        System.out.println(mapa.get(10));
    }
}
