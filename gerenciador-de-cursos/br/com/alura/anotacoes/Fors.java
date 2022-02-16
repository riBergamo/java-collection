package br.com.alura.anotacoes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fors {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);

        //01 - a forma mais nova de for : (que o prof usava)
        lista.forEach(n -> {
            System.out.println(n);
        });

        //02 - for que eu gosto :
        //para cada String aula DENTRO de aulas faça {}
        for (int l : lista) {
            System.out.println(l);
        }

        //03 - antes do for : (bem velho)
        Iterator<Integer> iterator = lista.iterator();
        while (iterator.hasNext()) {
            int prox = iterator.next();
            System.out.println(prox);
        }
        //como seria feito na classe TesteCursoComAluno :
        /*
        Set<Aluno> alunos = javaColecoes.getAluno();
        Iterator<Aluno> iterator = alunos.iterator();
        while (iterator.hasNext()) {
            Aluno prox = iterator.next();
            System.out.println(prox);
        }
        */





    }
}
