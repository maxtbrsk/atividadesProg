package AlunosExemploUm;

import java.util.Random;
import java.util.Scanner;

    public class Teste {
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            Aluno[] turma = new Aluno[10];
            int contAluno = 0;
            char resp;
            do {
                System.out.println("c - cadastro ");
                System.out.println("l - listar os alunos ");
                System.out.println("p - pesquisar um aluno");
                System.out.println("s - sair");
                resp = ler.next().toLowerCase().charAt(0);
                if(resp=='c') {
                    if (contAluno < turma.length) {
                        System.out.println("Informe o nome do aluno: ");
                        String nome = ler.next();
                        System.out.println("Informe o sobrenome do aluno: ");
                        String sobrenome = ler.next();
                        System.out.println("Informe o em-mail do aluno: ");
                        String email = ler.next();
                        int codigo = new Random().nextInt(1000, 10000);

                        turma[contAluno] = new Aluno();
                        turma[contAluno].nome = nome;
                        turma[contAluno].sobrenome = sobrenome;
                        turma[contAluno].email = email;
                        turma[contAluno].codigo = codigo;

                        System.out.println("Aluno " + nome + " " + sobrenome + " cadastro obteve código " + codigo);
                        System.out.println("Qual a primeira nota de " + nome + ": ");
                        turma[contAluno].notaUm = ler.nextFloat();
                        System.out.println("Qual a segunda nota de " + nome + ": ");
                        turma[contAluno].notaDois = ler.nextFloat();
                        contAluno++;
                    }
                }
                else if (resp=='l'){
                    for (int i=0; i<contAluno; i++){
                        System.out.println("Nome"+ turma[i].nome+" "+turma[i].sobrenome);
                        System.out.println("Código: "+turma[i].codigo);
                        System.out.println("Média: "+turma[i].obterMedia());
                        System.out.println("Está "+turma[i].obterStatus());
                        System.out.println("________________________________________________________________________");
                    }
                }
                else if(resp=='p'){
                    System.out.println("Qual o código de matrícula: ");
                    int matricula = ler.nextInt();
                }
            }
            while(resp!='s');
        }
    }
