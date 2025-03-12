package exercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario f1 = new Funcionario("Lucas", "Analista", 1000);
        Funcionario f2 = new Funcionario("Juliana", "Cientista", 1300);

        System.out.println(f1);
        System.out.println(f1.nome);
        System.out.println(f1.cargo);
        System.out.println(f1.salario);

        f1.aumentarSalario(500);
        System.out.println("Novo salário: " + f1.salario);

        f1.promoverCargo("Gestor");
        System.out.println("Novo cargo: " + f1.cargo);
        /*
        int percentual;
        String novoCargo;
        System.out.print("Insira o nome do funcionário: ");
        f1.nome = sc.nextLine();


        System.out.print("Insira o cargo de " + f1.nome + ": ");
        f1.cargo = sc.nextLine();

        System.out.print("Insira o salário de " + f1.nome + ": ");
        f1.salario = sc.nextDouble();

        System.out.println("-------DADOS-------");
        System.out.println("Nome: " + f1.nome);
        System.out.println("Cargo: " + f1.cargo);
        System.out.println("Salário: " + f1.salario);
        System.out.println("----------------------");

        System.out.print("Insira o valor de percentual de aumento: ");
        percentual = sc.nextInt();
        f1.aumentarSalario(percentual);
        System.out.print("Novo salário: " + f1.salario);

        sc.nextLine();
        System.out.print("Insira o novo cargo: ");
        novoCargo = sc.nextLine();
        f1.promoverCargo(novoCargo);
        System.out.println("Novo cargo: " + f1.cargo);
        */
    }
}
