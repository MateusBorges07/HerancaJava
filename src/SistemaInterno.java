public class SistemaInterno {


     private int senha= 2222;
    public void autentica(AutenticacaoUtil fa){
        boolean auteticou = fa.autentica(this.senha);
        if (auteticou){
            System.out.println("pode entrar no sistema");
        } else{
            System.out.println("nao pode entrar o sistema");
        }

    }


}
