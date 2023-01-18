public class Gerente extends Autenticavel, Funcionario{//Gerente é um funcionrio esta herdando a class funcionario


    public double  getBonificacao(){
        return super.getSalario();

    }


}
