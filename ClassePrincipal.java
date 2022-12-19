public class ClassePrincipal {
    /**
     *
     * @param args
     */
//Método principal
    public static void main(String args[]) {
        System.out.println("Olá João Batista!");
        Cliente cliente = new Cliente();
        cliente.inserirEndereço("Rua Mário Antônio, 22");
        cliente.setCodigo(2);
        System.out.println(cliente.getCodigo());
        System.out.println(cliente.getEndereço());

    }

}
