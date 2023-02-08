package AlunosAbstract;



import java.util.Objects;

public abstract class Matricula {
    private Integer numeroMatricula;
    private String cargo;
    private String nome;
    private Integer idade;
    private String email;


    //constructor
    public Matricula(Integer numeroMatricula, String cargo, String nome, Integer idade, String email) {
        this.numeroMatricula = numeroMatricula;
        this.cargo = cargo;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    //set
    public Integer getNumeroMatricula() {
        return this.numeroMatricula;
    }

    public void setNumeroMatricula(Integer numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

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

    //overzin2

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Matricula)) {
            return false;
        }
        Matricula matricula = (Matricula) o;
        return Objects.equals(numeroMatricula, matricula.numeroMatricula) && Objects.equals(cargo, matricula.cargo) && Objects.equals(nome, matricula.nome) && Objects.equals(idade, matricula.idade) && Objects.equals(email, matricula.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroMatricula, cargo, nome, idade, email);
    }

    @Override
    public String toString() {
        return this.cargo+": "+this.nome+
        ", Idade: "+this.idade+
        ", Email: "+this.email+
        ", Numero da Matricula: "+this.numeroMatricula;
    }

}