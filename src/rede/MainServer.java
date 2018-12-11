package rede;

public class MainServer {
    public static void main(String[] args) {
        Servidor servidor = new Servidor(7777,4);
        
        Thread threadServer = new Thread (servidor);
        threadServer.start();
        
        servidor.gerenciarConexoes();
    }
    
}
