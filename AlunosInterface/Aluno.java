package AlunosInterface;

import java.util.Objects;

public class Aluno implements Matricula{
    private String nome;
    private Integer idade;
    private String email;
    private Integer periodo;
    private String curso;

    private Integer matricula;
    private String cargo;

    //constructor
    public Aluno(String nome, Integer idade, String email,Integer periodo, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.periodo = periodo;
        this.curso = curso;
        gerarMatricula();
        definirCargo();
    }

    //overzin3
    @Override
    public void gerarMatricula() {
        Integer num;
        num = (int) (1);

        this.matricula = num;
    }

    @Override
    public void definirCargo() {
        this.cargo = "Aluno";
    }

    //set
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getMatricula() {
        return this.matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Integer getPeriodo() {
        return this.periodo;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    //OVerzin44

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Aluno)) {
            return false;
        }
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome) && Objects.equals(idade, aluno.idade) && Objects.equals(email, aluno.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, email);
    }

    @Override
    public String toString() {
        return "Aluno: "+ this.nome+
        ", Idade: "+this.idade+
        ", Email: "+this.email+
        ", Curso: "+this.curso+
        ", "+ this.periodo +"º Periodo"+
        ", Numero da Matricula: "+this.matricula +".";
    }

}