package rede;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Cliente {
    Socket s;
    public Cliente(String ipServidor, int portaServidor) throws Exception {
        try {
            s = new Socket(ipServidor, portaServidor);
            if (s==null) throw new Exception("Conexão não estabelecida");
            BufferedReader bfr = new BufferedReader(new InputStreamReader (s.getInputStream()));
            while (true) {
                String dados = bfr.readLine();
                System.out.println("Cliente >> " + new String(dados));
            }
        } catch (IOException ex) {
            System.out.println("Erro: " + ex.getMessage());;
        }
    }
}
