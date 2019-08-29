package br.digitalhouse.Exercicio;

public abstract class Professor {
    private String nome;
    private String sobreNome;
    private Integer tempoDeCasa;
    private Integer codProf;

    public Professor(String nome, String sobreNome, Integer tempoDeCasa, Integer cod) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.tempoDeCasa = tempoDeCasa;
        this.codProf = cod;

    }
    public Professor(Integer cod){
        this.codProf = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public Integer getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(Integer tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public Integer getCod() {
        return codProf;
    }

    public void setCod(Integer cod) {
        this.codProf = cod;
    }

}
