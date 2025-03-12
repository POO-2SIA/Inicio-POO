package exercicio04;

public class Funcionario {
    String nome;
    String cargo;
    double salario;

    //Método construtor para inicializar os atributos do objeto
    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void aumentarSalario(double percentual) {
        percentual /= 100;
        salario += salario * percentual;

    }

    //Os métodos podem ter o mesmo nome, só não podem ser IDÊNTICOS
    // -> Para não serem idênticos, os parâmetros devem ser diferentes
    public void aumentarSalario(String cargo, double percentual){
        if (cargo.equalsIgnoreCase(this.cargo)) {
            aumentarSalario(percentual);
        }
    }

    //Usamos o this para distinguir variáveis com o mesmo nome (a variável local cargo que usamos no parâmetro)
    //O this vai indicar que estamos nos referindo ao atributo DESTE objeto
    public void promoverCargo(String cargo) {
        this.cargo = cargo;
    }


}
