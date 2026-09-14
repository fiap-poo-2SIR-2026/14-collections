package exercicio2;

import java.util.*;

public class GerenciadorDeMatricula {
    static void main() {
        Set<Aluno> banco = new HashSet<>();
        banco.add(new Aluno(10, "A"));
        banco.add(new Aluno(20, "B"));
        banco.add(new Aluno(10, "A"));
        banco.add(new Aluno(30, "C"));

        Set<Aluno> estrutura = new HashSet<>();
        estrutura.add(new Aluno(40, "D"));
        estrutura.add(new Aluno(50, "E"));
        estrutura.add(new Aluno(10, "A"));

        // alunos matriculados em banco ou estrutura
        System.out.println("Alunos matriculados em banco ou estrutura");
        Set<Aluno> todosAlunos = new HashSet<>(banco);
        todosAlunos.addAll(estrutura);
        todosAlunos.forEach(aluno -> {
            System.out.println(aluno);
        });

        // alunos matriculados em banco E estrutura
        System.out.println("\nAlunos matriculados em banco e estrutura");
        Set<Aluno> emComum = new HashSet<>(banco);
        emComum.retainAll(estrutura);
        emComum.forEach(System.out::println);

        // alunos matriculados somente em estrutura
        System.out.println("\nAlunos matriculados somente em estrutura");
        Set<Aluno> sohEstrutura = new HashSet<>(estrutura);
        sohEstrutura.removeAll(banco);
        List<Aluno> lista = new ArrayList<>(sohEstrutura);
        lista.sort(Comparator.comparing(Aluno::getNome));
        lista.forEach(System.out::println);




    }
}
