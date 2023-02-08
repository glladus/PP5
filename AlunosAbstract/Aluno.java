package AlunosAbstract;

import java.util.ArrayList;
import java.util.Objects;

public class Aluno extends Matricula {
    private ArrayList<String> disciplinas = new ArrayList<>();
    private Integer periodo;
    private String curso;

    //constructor
    public Aluno(String nome, Integer idade, String email, Integer periodo, String curso, Integer numeroMatricula) {
        super(numeroMatricula, "Aluno", nome, idade, email);
        this.periodo = periodo;
        this.curso = curso;
    }
    
    //methods
    public void adicionarDisciplina(String disciplina){
        this.disciplinas.add(disciplina);
    }
    //sets
    public ArrayList<String> getDisciplinas() {
        return this.disciplinas;
    }

    public void setDisciplinas(ArrayList<String> disciplinas) {
        this.disciplinas = disciplinas;
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

    //overzin

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Aluno)) {
            return false;
        }
        Aluno aluno = (Aluno) o;
        return Objects.equals(disciplinas, aluno.disciplinas) && Objects.equals(periodo, aluno.periodo) && Objects.equals(curso, aluno.curso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disciplinas, periodo, curso);
    }

    @Override
    public String toString() {
        return super.toString()+
        ", Curso: "+this.curso+
        ", "+this.periodo+"º Periodo.";
    }

}