package br.digitalhouse.Exercicio;

public class ProfessorAdjunto extends Professor {
    private Integer horasDeMentoria;


    public ProfessorAdjunto(String nome, String sobreNome, Integer tempoDeCasa, Integer codProf, Integer horasDeMentoria) {
        super(nome, sobreNome, tempoDeCasa, codProf);
        this.horasDeMentoria = horasDeMentoria;
    }

    public Integer getHorasDeMentoria() {
        return horasDeMentoria;
    }

    public void setHorasDeMentoria(Integer horasDeMentoria) {
        this.horasDeMentoria = horasDeMentoria;
    }
}
