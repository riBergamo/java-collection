package br.com.alura.testes;

import br.com.alura.Aula;
import br.com.alura.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteCurso2 {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as Coleções do Java", "Paulo Silveira");

        javaColecoes.add(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.add(new Aula("Criando uma Aula", 19));
        javaColecoes.add(new Aula("Modelando com coleções", 15));

        //transformando as aulas Imutaveis em mutaveis para conseguir ordenar em ordem alfabética
        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulasMutaveis = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulasMutaveis);
        //

        for (Aula aula : aulasMutaveis) {
            System.out.println(aula);
        }

        System.out.println("Tempo total de aulas: " + javaColecoes.getTempoTotal());

        System.out.println(javaColecoes);
    }
}
