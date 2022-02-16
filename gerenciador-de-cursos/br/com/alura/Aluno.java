package br.com.alura;

import java.util.Objects;

public class Aluno {
    private String nome;
    private int numeroMatricula;

    public Aluno(String nome, int numeroMatricula) {
        if (nome == null) {
            throw new NullPointerException("Nome não inserido");
        }
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public String toString() {
        return getNome() + ", nº" + getNumeroMatricula();
    }

    @Override
    public boolean equals(Object o) {
        Aluno a = (Aluno) o;
        /*if (a.nome.equals(this.nome) && a.numeroMatricula == this.numeroMatricula) {
            return true;
        }*/
        return a.nome.equals(this.nome) && a.numeroMatricula == this.numeroMatricula;
    }

    //método para que o nome seja sempre atrelado ao número da matricula
    @Override
    public int hashCode() {
        //return this.nome.charAt(0);//pega o caractere(char) da posiçao 0 e devolve como argumento
        //return Object.hash(nome, numeroMatricula);
        return this.nome.hashCode();
    }


}
