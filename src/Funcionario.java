public class Funcionario {

    private String nome;

    private String CPF;

    private double salario;

//protected e depois public.
//private - apenas visível dentro da classe
//protected - visível dentro da classe e também para as filhas
//public - visível em todo lugar
//Repare também que protected é relacionado com a herança.

    public double  getBonificacao(){
            return  this.salario * 0.05;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
