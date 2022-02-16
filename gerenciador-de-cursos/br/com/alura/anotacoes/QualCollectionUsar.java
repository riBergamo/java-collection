package br.com.alura.anotacoes;

import br.com.alura.Aluno;

import java.util.*;

public class QualCollectionUsar {
    public static void main(String[] args) {
        Collection<Aluno> list = new ArrayList<>();
        //List :
        // - Elementos ordenados(achar elemntos pela posição e tals);
        // - Elementos repetidos.

        Collection<Aluno> set = new HashSet<>();
        // Set : (não é uma lista, é mais como uma sacola que você nunca sabe a ordem que fica)
        // - Não precisar de ordem;
        // - Maior velocidade para achar os elementos;
        // - Não puder ter elementos repetidos.

        //obs: ficar com dúvida de qual utilizar usa o Collection e depois se decide.

        Set<Aluno> set2 = new LinkedHashSet<>();
        // LinkedHashSet :
        // - Faz com que ele fique ordenado
        // - Mas ainda não da para pedir posiçao(método get())

        Set<Aluno> set3 = new TreeSet<Aluno>();
        //TreeSet :
        // - só funciona para classes que implementam comparable(no caso teria que implementar Comparable na classe Aluno)
        // - Ordenados
    }
}
