package PrimeirosPassosPOO.exercicio04;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Funcionario[] funcionarios = new Funcionario[5];

    public static void main(String[] args) {

        inicializarMenu();
    }

    public static void inicializarMenu() {
        int op = 0, cont = 0;
        while (op != 5) {

            op = 0;
            System.out.println("Escolha uma opção: ");
            System.out.println("1. Cadastrar");
            System.out.println("2. Pesquisar");
            System.out.println("3. Listar");
            System.out.println("4. Promover");
            System.out.println("5. Finalizar");
            op = sc.nextInt();

            if (op == 1) {
                if (cont < funcionarios.length) {
                    cadastrarFuncionario(funcionarios, cont);
                    System.out.println("\nFuncionário cadastrado!");
                    cont++;
                } else {
                    System.out.println("Número de funcionários excedido!");
                }

            } else if (op == 2) {
                sc.nextLine();
                String nome;
                System.out.println("Insira o nome do funcionário que deseja buscar: ");
                nome = sc.nextLine();
                pesquisarFuncionario(nome, funcionarios, cont);
            } else if (op == 3) {
                listarFuncionarios(cont);
            } else if (op == 4) {
                sc.nextLine();
                String nome, cargo;
                System.out.println("Insira o nome do funcionário que deseja buscar: ");
                nome = sc.nextLine();
                if (pesquisarFuncionario(nome, funcionarios, cont)) {
                    System.out.println("Insira o cargo que deseja atribuir a esse funcionário: ");
                    cargo = sc.nextLine();

                    promoverFuncionario(nome, funcionarios, cont, cargo);
                }
            } else if (op == 5) {
                System.out.println("\nFim do programa!");
            } else if (op < 1 || op > 5) {
                System.out.println("Opção inválida!!!");
            }
        }
    }

    public static void cadastrarFuncionario(Funcionario[] funcionarios, int cont) {
        String nome, cargo;
        double salario;

        sc.nextLine();
        System.out.println("Insira o nome do funcionário: ");
        nome = sc.nextLine();
        System.out.println("Insira o cargo do funcionário: ");
        cargo = sc.nextLine();
        System.out.println("Insira o salário do funcionário: ");
        salario = sc.nextDouble();
        funcionarios[cont] = new Funcionario(nome, cargo, salario);

    }

    public static void promoverFuncionario(String nome, Funcionario[] funcionarios, int cont, String cargo) {
        for (int i = 0; i < cont; i++) {
            if (funcionarios[i].nome.equalsIgnoreCase(nome)) {
                funcionarios[i].cargo = cargo;
                System.out.println("Funcionário promovido");
            }
        }

    }

    public static boolean pesquisarFuncionario(String nome, Funcionario[] funcionarios, int cont) {
        boolean check = false;
        int aux = 0;
        for (int i = 0; i < cont; i++) {
            if (funcionarios[i].nome.equalsIgnoreCase(nome)) {
                check = true;
                aux = i;
                break;
            }
        }
        if (check) {
            System.out.println("O funcionário está cadastrado!");
            System.out.println(funcionarios[aux].nome);
            System.out.println(funcionarios[aux].cargo);
            System.out.println("R$" + String.format("%.2f", funcionarios[aux].salario));
        } else {
            System.out.println("O funcionário não está cadastrado!");
        }
        return check;
    }

    public static void listarFuncionarios(int cont) {
        System.out.println("LISTA DE FUNCIONÁRIOS: ");
        for (int i = 0; i < cont; i++) {
            System.out.println("-------------------------");
            System.out.println(funcionarios[i].nome);
            System.out.println(funcionarios[i].cargo);
            System.out.println("R$" + String.format("%.2f", funcionarios[i].salario));

        }
    }
}
