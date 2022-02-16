package br.com.alura;

import java.util.*;

public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<Aula>();
    private Set<Aluno> aluno = new HashSet<>();//n posso usar Collection(no lugar d Set) pq ae o getAluno não funciona
    private Map<Integer, Aluno> matriculaParaAluno = new Hashtable<>();
    //map : k = chave, V = valor
    //LinkedHashMap : ele guardaa ordem e segue a ordem com que voce escreveu/criou
    //Hashtable : thread safe, não muito usado

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public Set<Aluno> getAluno() {
        return Collections.unmodifiableSet(aluno);
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas); // Collections.unmodifiableList() = faz com que nao funcione add ou remove no teste, mas tbm nao funciona para quando quiser mudar a order da list
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void add(Aula aula) {
        this.aulas.add(aula);
    }
    
    public int getTempoTotal() {
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();

        // Faz o mesmo
        /*int tempoTot = 0;
        for (Aula aula : aulas) {
            tempoTot += aula.getTempo();
        }
        return tempoTot;*/
    }

    @Override
    public String toString() {
        return "Curso - " + nome + ", instrutor: " + instrutor + ", Tempo total: " + getTempoTotal();
    }

    public void matricula(Aluno aluno) {
        this.aluno.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.aluno.contains(aluno);
    }

    public Aluno buscaMatriculado(int numeroMatricula) {
        //if desnecessario mas fica bonito caso de "null".
        if (matriculaParaAluno.containsKey(numeroMatricula)) {
            return matriculaParaAluno.get(numeroMatricula);//esse get meio que faz oq o for tava fazendo (mais rápido caso o número de aluno seja muito alto)
        }
        throw new NoSuchElementException("Aluno não encontrado");//em vez de usar null, lança uma exception

        //codigo antes de usar o Map<>
        /*for (Aluno aluno : this.aluno ) {
            if (aluno.getNumeroMatricula() == numeroMatricula) {
                return aluno;
            }
        }*/
    }
}
