package br.com.alura.testes;

import br.com.alura.Aula;
import br.com.alura.Curso;

public class TesteCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as Coleções do Java", "Paulo Silveira");

        //opção 1 : codigo maior
        /*List<Aula> aulas = javaColecoes.getAulas();
        aulas.add(new Aula("Trabalhando com LinkedList", 21));*/

        //opção 2 : feito em uma linha
        javaColecoes.add(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.add(new Aula("Criando uma Aula", 19));
        javaColecoes.add(new Aula("Modelando com coleções", 15));

        javaColecoes.getAulas().forEach(aula -> {
            System.out.println(aula);
        });



    }

}
