public class Gerente extends Funcionario{//Gerente é um funcionrio esta herdando a class funcionario
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        }else {
            return false;
        }
    }

    public double  getBonificacao(){
        return super.getBonificacao() + super.getSalario();

    }


}
