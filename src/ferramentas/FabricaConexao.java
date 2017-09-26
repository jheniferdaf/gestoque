package ferramentas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FabricaConexao {
    
    private static int quantidadeConexoes;
    
    public static Connection criaConexao(){
        
        //tratando problema relacionado ao limite de conexoes simultaneas
        while(quantidadeConexoes >= 200){
            JOptionPane.showMessageDialog(null, "Estamos no limite de nossas conexões. Tentaremos após 1 minuto.", "Limite de conexões atingido", JOptionPane.WARNING_MESSAGE);
            try {
                Thread.sleep(60000);
            } catch (InterruptedException ex) {
                Logger.getLogger(FabricaConexao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        Connection con = null;
        boolean conectado = false;
        int tentativas = 0;
        while(conectado == false && tentativas <= 4){
            try {
                con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GEstoque", "postgres", "8888");
                conectado = true;
            } catch (SQLException ex) {
                tentativas++;
                
                System.err.println("Conexao falhou - problema rede ou senha");
                ex.printStackTrace();
                try {
                    JOptionPane.showMessageDialog(null, "Tentaremos restabelecer em 30 segundos. Estamos na tentativa " + tentativas + ".", "Problema na conexão", JOptionPane.WARNING_MESSAGE);
                    Thread.sleep(30000);
                } catch (InterruptedException ex1) {
                    JOptionPane.showMessageDialog(null, ex1.getMessage());
                }

            }
        }
        quantidadeConexoes++;
        
        return con;
    }
    
    public void encerraConexao(){
        quantidadeConexoes--;
    }
    
    
}
