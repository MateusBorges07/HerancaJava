public class Gerente extends Funcionario implements Autenticavel {//Gerente é um funcionrio esta herdando a class funcionario
    private AutenticacaoUtil autenticador;
    public Gerente(){
        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public double getBonificacao() {
        System.out.println("chamando o metodo bonificacao do gerente");
        return super.getSalario();

    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);

    }
}
