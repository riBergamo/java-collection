package br.com.alura.testes;

import java.util.*;

public class TesteAlunos {
    public static void main(String[] args) {
        //List<> listAluno = new ArrayList();

        Collection<String> alunos = new HashSet<>();

        alunos.add("Robrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sérgio Lopez");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");

        //Stuação que ele tem mais velocidade, mais que uma List
        boolean matriculado = alunos.contains("Paulo Silveira");//contains : ve se o elemento ja existe e foi add
        alunos.remove("Sérgio Lopez");
        System.out.println("Veririfcando se já contém o elemento: " + matriculado);
        //

        System.out.println("Tamanho do Set: " + alunos.size());

        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });

        System.out.println(alunos);

        //Com isso pode se ordenar o set : (passando ele para uma ArrayList)
        List<String> alunosEmLista = new ArrayList<>(alunos); //recebe a Coleção(collection) alunos, que é um Set.

        Collections.sort(alunosEmLista);

        int i = 0;
        for (String alunoEL : alunosEmLista) {
            i++;
            System.out.println(i + "." + alunoEL);
        }
    }
}
