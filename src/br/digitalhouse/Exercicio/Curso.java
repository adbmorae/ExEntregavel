package br.digitalhouse.Exercicio;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nome;
    private Integer codCurso;
    private Professor professor;
    private Integer quantidadeMaxDeAlunos;
    private List<Aluno> listaDeAlunos = new ArrayList<>();

    public void adicionarAluno(){
    }
    public void excluirAluno(){

    }

    public Curso(String nome, Integer codCurso, Professor professor, Integer quantidadeMaxDeAlunos, List<Aluno> listaDeAlunos) {
        this.nome = nome;
        this.codCurso = codCurso;
        this.professor = professor;
        this.quantidadeMaxDeAlunos = quantidadeMaxDeAlunos;
        this.listaDeAlunos = listaDeAlunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(Integer codCurso) {
        this.codCurso = codCurso;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Integer getQuantidadeMaxDeAlunos() {
        return quantidadeMaxDeAlunos;
    }

    public void setQuantidadeMaxDeAlunos(Integer quantidadeMaxDeAlunos) {
        this.quantidadeMaxDeAlunos = quantidadeMaxDeAlunos;
    }

    public List<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(List<Aluno> listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", codCurso=" + codCurso +
                ", professor=" + professor +
                ", quantidadeMaxDeAlunos=" + quantidadeMaxDeAlunos +
                ", listaDeAlunos=" + listaDeAlunos +
                '}';
    }
}



