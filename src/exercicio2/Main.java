package exercicio2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    static void main() {
        Set<Aluno> lista = new HashSet<>();
        lista.add(new Aluno(10, "Carlos"));
        lista.add(new Aluno(20, "Selmini"));
        lista.add(new Aluno(10, "Carlos"));
        lista.add(new Aluno(30, "Patrícia"));

        lista.forEach(aluno -> {
            System.out.println(aluno);
        });
    }
}
