import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        int idAluno = 1;
        int idTurma = 1;
        int qtde;
        ArrayList<Turma> turmas = new ArrayList<>();
        ArrayList<Aluno> alunos = new ArrayList<>();
        Aluno aluno = new Aluno();
        Turma turma = new Turma();

        while (opcao != 6) {
            System.out.println("-------SECRETARIA-------");
            System.out.println("1- Cadastrar Alunos");
            System.out.println("2- Cadastrar Turma");
            System.out.println("3- Preencher Turma");
            System.out.println("4- Cadastrar Notas");
            System.out.println("5- Gerar Relatorio");
            System.out.println("6- Sair");
            System.out.println("ESCOLHA OPÇÃO");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    aluno = new Aluno();
                    System.out.println("CADASTRO ALUNO");
                    aluno.setIdAluno(idAluno);
                    idAluno++;
                    System.out.println("NOME DO ALUNO: ");
                    aluno.setNomeAluno(scan.next());
                    alunos.add(aluno);
                    break;

                case 2:
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum Aluno cadastrado");
                        break;
                    }
                    System.out.println("CADASTRO TURMA");
                    turma.setIdTurma(idTurma);
                    idTurma++;
                    System.out.print("NOME DA TURMA: ");
                    turma.setNomeTurma(scan.next());
                    turmas.add(turma);
                    break;

                case 3:
                    System.out.println("TURMAS CADASTRADAS");
                    for (int i = 0; i < turmas.size(); i++) {
                        System.out.println((i + 1) + " - " + "id: " + turmas.get(i).getIdTurma() + " Nome: " + turmas.get(i).getNomeTurma());
                    }
                    System.out.println("SELECIONE UMA TURMA");
                    int opcaoTurma = scan.nextInt();

                    for (int i = 0; i < alunos.size(); i++) {
                        if (alunos.get(i).getTurma() == 0) {
                            System.out.println((i + 1) + " - " + "id: " + alunos.get(i).getIdAluno() + " Nome: " + alunos.get(i).getNomeAluno());
                        }
                    }

                    System.out.println("SELECIONE UM ALUNO");
                    int opcaoAluno = scan.nextInt();

                    turmas.get(opcaoTurma-1).setAlunos(alunos.get(opcaoTurma-1));
                    alunos.get(opcaoAluno-1).setTurma(turmas.get(opcaoTurma-1).getIdTurma());

                    //System.out.println("teste " + turmas.get(opcaoTurma-1).getAlunosTeste());
                    System.out.println(turmas.get(opcaoTurma-1).getAlunos(0).getNomeAluno());
                    System.out.println(turmas.get(opcaoTurma-1).getAlunos(1).getNomeAluno());

            }
        }
    }
}