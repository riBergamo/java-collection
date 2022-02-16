package br.com.alura.mapas;

import br.com.alura.Aluno;
import br.com.alura.Aula;
import br.com.alura.Curso;

import java.util.Scanner;

public class TesteBuscaAlunosNoCurso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Curso javaColecoes = new Curso("Dominando as Coleções do Java", "Paulo Silveira");

        javaColecoes.add(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.add(new Aula("Criando uma Aula", 19));
        javaColecoes.add(new Aula("Modelando com coleções", 15));

        Aluno a1 = new Aluno("Rodrigo Turini", 2289);
        Aluno a2 = new Aluno("Guilherme Silveira", 1641);
        Aluno a3 = new Aluno("Mauricio Aniche", 3266);
        Aluno a4 = new Aluno("Paulo Silveira", 3266);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        javaColecoes.matricula(a4);

        System.out.println("Número da matricula: ");
        int numeroMatricula = scanner.nextInt();

        //Fazer um método para saber se o aluno esta matriculado usando o código de mátricula(buscaMatricula())
        //Foi criado um mapa pra guardar um numero(numero da matricula) para um Aluno correspondente (relacionando um Intenger para um Aluno)
        System.out.println("Quem é o aluno com matricula " + numeroMatricula + "? ");
        Aluno aluno  = javaColecoes.buscaMatriculado(numeroMatricula);
        System.out.println("Aluno : " + aluno);


    }
}
