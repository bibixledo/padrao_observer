package rede;

public class MainCliente {
    public static void main(String[] args) {
        try {
            Cliente c = new Cliente("127.0.0.1", 7777);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    } 
}
