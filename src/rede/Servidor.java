package rede;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.swing.JOptionPane;

public class Servidor implements Runnable {
    ServerSocket ss;
    CopyOnWriteArrayList<Socket> listaConexoes;
    int numeroDeClientes;
    
    public Servidor(int porta, int numeroDeClientes) {
        try {
            ss = new ServerSocket(porta);
            listaConexoes = new CopyOnWriteArrayList<>();
            this.numeroDeClientes = numeroDeClientes;
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void gerenciarConexoes() {
        while (true) {
           int contador = 1;
            String str=JOptionPane.showInputDialog("DIGITE");
           for (Socket s: listaConexoes) {
               try {
                   String msg = "Servidor>>Cliente " + contador + " "+str+ "\n";
                   s.getOutputStream().write((msg).getBytes());
                   contador++;
               } catch (IOException ex) {
                   System.out.println("Erro: " + ex.getMessage());
               }
           }
        }
    }
    
    @Override
    public void run() {
        while (listaConexoes.size() != numeroDeClientes) {
            try {
                Socket novaConexao = ss.accept();
                listaConexoes.add(novaConexao);
                System.out.println("Conecão estabelecida =>"+listaConexoes.size() );
            } catch (IOException e) {
                System.out.println("Erro ao : " + e.getMessage());
            }
        }
    }
    
}

