package br.com.alura.testes;

import br.com.alura.Aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteListaDeAula {
    public static void main(String[] args) {
        Aula a1 = new Aula("Revisando Arraylist", 21);
        Aula a2 = new Aula("Lista de objetos", 19);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

        ArrayList<Aula> listAula = new ArrayList<>();
        listAula.add(a1);
        listAula.add(a2);
        listAula.add(a3);

        //Collections.sort(listAula, Comparator.comparing(Aula::getTempo));//tempo do menor pro menor
        listAula.sort(Comparator.comparing(Aula::getTempo));//msm coisa so que fica mais bonitinho

        for (Aula aula : listAula) {
            System.out.println( aula);
        }

    }
}
