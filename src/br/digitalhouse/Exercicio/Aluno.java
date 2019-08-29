package br.digitalhouse.Exercicio;

public class Aluno {

    public String nome;
    public String SobreNome;
    public Integer codAluno;

    public String getNome() {
        return nome;
    }

    public String getSobreNome() {
        return SobreNome;
    }

    public Integer getCodAluno() {
        return codAluno;
    }

    public Aluno(String nome, String sobreNome, Integer codAluno) {
        this.nome = nome;
        SobreNome = sobreNome;
        this.codAluno = codAluno;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobreNome(String sobreNome) {
        SobreNome = sobreNome;
    }

    public void setCodAluno(Integer codAluno) {
        this.codAluno = codAluno;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", SobreNome='" + SobreNome + '\'' +
                ", codAluno=" + codAluno +
                '}';
    }

}
