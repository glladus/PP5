package AlunosAbstract;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean continuar = true;
        Integer escolha;

        Integer escolherMatricula;

        //Matricula
        String nome;
        Integer idade;
        String email;
        Integer numeroMatricula = 1; 


        //Aluno
        String curso;
        Integer periodo;
        String disciplina;


        //""""""""""""VECTOR A É""""""""""""
        ArrayList<Aluno> alunos = new ArrayList<>();

        while(continuar){

            System.out.println("*************(_-_)*************");
            System.out.println("1: Adicionar um Aluno");
            System.out.println("2: Remover Aluno");
            System.out.println("3: Adicionar disciplinas ao Aluno");
            System.out.println("4: Mostrar todos Alunos");
            System.out.println("0: Sair");
            System.out.println("************(_-_)************");

            escolha = scan.nextInt();

            switch (escolha) {
                case 1://Adicionar Aluno
                    scan.nextLine();
                    System.out.println("Digite o nome do Aluno:");
                    nome = scan.nextLine();
                    System.out.println("Digite o email do Aluno");
                    email = scan.nextLine();
                    System.out.println("Digite o Curso do ALuno");
                    curso = scan.nextLine();
                    System.out.println("Digite a idade do Aluno:");
                    idade = scan.nextInt();
                    System.out.println("Digite o Periodo do Aluno");
                    periodo = scan.nextInt();

                    Aluno novoAluno = new Aluno(nome,idade,email,periodo,curso,numeroMatricula);
                    alunos.add(novoAluno);

                    numeroMatricula++;

                    System.out.println("Aluno Registrado: "+novoAluno.toString());
                    break;
                    
                case 2://Remover Aluno
                    if(alunos.size() > 0){
                        scan.nextLine();
                        System.out.println("Digite o Numero da Matricula do Aluno para Remover:");
                        escolherMatricula = scan.nextInt();
                        for(int i = 0; i < alunos.size(); i++){
                            if(alunos.get(i).getNumeroMatricula().equals(escolherMatricula)){
                                System.out.println("Removido: "+alunos.get(i).toString());
                                alunos.remove(i);
                                break;
                            }else{
                                System.out.println("Matricula não encontrada");
                            }
                        }
                    }else{
                        System.out.println("Nenhum Aluno Registrado");
                    }
                    break;
                case 3://Adicionar Disciplina
                    if(alunos.size() > 0){
                        scan.nextLine();
                        System.out.println("Digite o Numero da Matricula para adicionar disciplina");
                        escolherMatricula = scan.nextInt();

                        for(int i = 0; i < alunos.size(); i++){
                            if(alunos.get(i).getNumeroMatricula().equals(escolherMatricula)){
                                System.out.println("Digite o nome da Disciplina");
                                disciplina = scan.nextLine();
                                alunos.get(i).adicionarDisciplina(disciplina);
                                break;
                            }else{
                                System.out.println("Matricula não encontrada");
                            }
                        }
                    }else{
                        System.out.println("Nenhum Aluno Registrado");
                    }

                    break;
                    
                case 4://Mostrar Alunos
                    if(alunos.size() > 0){
                        for(int i = 0; i < alunos.size(); i++){
                            System.out.println(alunos.get(i).toString());
                        }
                    }else{
                        System.out.println("Nenhum Aluno Registrado");
                    }
                    break;
                }
        }
        scan.close();
    }
}