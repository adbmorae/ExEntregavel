package br.digitalhouse.Exercicio;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManeger {
    private List<Aluno> alunos = new ArrayList<>();
    private List<Professor> professores = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();
    private List<Matricula> matriculas = new ArrayList<>();

    public void registrarCurso(String nome, String codCurso, Integer quantidadeDeAlunos){

    }
    public void excluirCurso ( Integer codCurso ){

    }
    public void registrarProfessorAdjunto(String nome, String sobreNome, Integer cod, Integer quantidadeDeHoras ){

    }
    public void registrarProfessorTitular( String nome, String sobreNome, Integer cod, String especialidade){

    }
    public void excluirProfessor(Integer cod){

    }
    public void matricularAluno( String nome, String sobreNome, Integer codAluno){

    }
    public void matricularAlunoCurso(Integer codAluno, Integer codCurso){

    }
    public void alocarProfessor( Integer codCurso, Integer codProf){

    }

    public DigitalHouseManeger(List<Aluno> alunos, List<Professor> professores, List<Curso> cursos, List<Matricula> matriculas) {
        this.alunos = alunos;
        this.professores = professores;
        this.cursos = cursos;
        this.matriculas = matriculas;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
}
