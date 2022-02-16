package br.com.alura.testes;

import br.com.alura.Aluno;
import br.com.alura.Aula;
import br.com.alura.Curso;

public class TesteCursoComAluno {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as Coleções do Java", "Paulo Silveira");

        javaColecoes.add(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.add(new Aula("Criando uma Aula", 19));
        javaColecoes.add(new Aula("Modelando com coleções", 15));

        Aluno a1 = new Aluno("Riane Olit Bergamo", 2289);
        Aluno a2 = new Aluno("Guilherme Silveira", 1641);
        Aluno a3 = new Aluno("Mariana Mott Silva", 3266);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Lista de alunos matriculados: ");
        javaColecoes.getAluno().forEach(a -> {
            System.out.println(a);
        });

        System.out.println("O aluno " + a1 + " está matriculado? ");
        System.out.println(javaColecoes.estaMatriculado(a1));

        //
        Aluno bergamo = new Aluno("Riane Olit Bergamo", 2289);
        System.out.println("Riane Olit Bergamo ta matriculado: ");
        System.out.println(javaColecoes.estaMatriculado(bergamo));

        System.out.println("a1 é igual bergamo: ");
        System.out.println(a1.equals(bergamo));

        //Se a1 igual bergamo então o seguinte é true: (eles tem o msm codigo de espalhamento, mesma "ordem")
        // obs: MUITO CUIDADO pra não serem diferentes pq o código geralmente compila mas pode dar problema depois
        System.out.println(a1.hashCode() == bergamo.hashCode());
    }
}
