package br.digitalhouse.Exercicio;

public class ProfessorTitular extends Professor {
    private String especialialidade;

    public ProfessorTitular(String nome, String sobreNome, Integer tempoDeCasa, Integer codProf, String especialialidade) {
        super(nome, sobreNome, tempoDeCasa, codProf);
        this.especialialidade = especialialidade;
    }

    public String getEspecialialidade() {
        return especialialidade;
    }

    public void setEspecialialidade(String especialialidade) {
        this.especialialidade = especialialidade;
    }
}
