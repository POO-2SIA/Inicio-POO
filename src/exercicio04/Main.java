package exercicio04;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Funcionario[] funcionarios = new Funcionario[5];
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        Funcionario[] funcionarios = new Funcionario[3];
        String nome, cargo;
        double salario;

        for(int i = 0; i < funcionarios.length; i++) {
            System.out.println("Insira o nome do funcionário " + (i + 1) + ": ");
            nome = sc.nextLine();
            System.out.println("Insira o cargo do funcionário " + (i + 1) + ": ");
            cargo = sc.nextLine();
            System.out.println("Insira o salário do funcionário " + (i + 1) + ": ");
            salario = sc.nextDouble();
            sc.nextLine();
            funcionarios[i] = new Funcionario(nome, cargo, salario);
        }

        for(Funcionario i : funcionarios) {
            System.out.println(i.nome);
            System.out.println(i.cargo);
            System.out.println(i.salario);
        }
        */

        inicializarMenu();
    }

    public static void inicializarMenu() {
        int op = 0, cont = 0;
        while(op != 4) {
            op = 0;
            System.out.println("Escolha uma opção: ");
            System.out.println("1. Cadastrar");
            System.out.println("2. Pesquisar");
            System.out.println("3. Listar");
            System.out.println("4. Finalizar");
            op = sc.nextInt();


            if(op == 1) {
                cadastrarFuncionario(funcionarios, cont);
                System.out.println("\nFuncionário cadastrado!");
                cont++;
            } else if (op == 2) {
                sc.nextLine();
                String nome;
                System.out.println("Insira o nome do funcionário que deseja buscar: ");
                nome = sc.nextLine();
                pesquisarFuncionario(nome, funcionarios, cont);
            } else if (op < 1 || op > 4) {
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

    public static void pesquisarFuncionario(String nome, Funcionario[] funcionarios, int cont) {
        boolean check = false;
        for(int i = 0; i < cont; i++) {
            if(funcionarios[i].nome.equalsIgnoreCase(nome)){
                check = true;
            }
        }

        if(check) {
            System.out.println("O funcionário está cadastrado!");
        } else {
            System.out.println("O funcionário não está cadastrado!");

        }
    }
}
