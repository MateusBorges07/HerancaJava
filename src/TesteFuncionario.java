public class TesteFuncionario {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();


        Gerente Mateus = new Gerente();
        Mateus.setNome("Mateus Borges");
        Mateus.setCPF("49755456830");
        Mateus.setSalario(2600.00);

        System.out.println(Mateus.getNome());
        System.out.println(Mateus.getBonificacao());

        //Mateus.getSalario() = 225;
    }
}
