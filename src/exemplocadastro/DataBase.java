package exemplocadastro;

import javax.swing.JOptionPane;

public class DataBase {
    private String host;
    private String user;
    private String password;

    public DataBase(String host, String user, String password) {
        this.host = host;
        this.user = user;
        this.password = password;
    }

    public boolean conectar(){
      // faz a conexão com o banco de dados
      // criaria a String de conexão baseado nos dados dos atributos da classe
      // faria a conexão invocando um método de uma classe do java que realizad a conexão;
      return true;
    }
    
    public boolean salvarCliente(Cliente cliente){
        boolean conectado = conectar();
        
        if(conectado == true){
          // invocar método de save de dado no DB passando os dados do cliente
          String dadosSalvos = "cpf: " + cliente.getCpf() + " nome: " + cliente.getNome() + "endereço: " + cliente.getEndereco().getPais();
            JOptionPane.showMessageDialog(null, dadosSalvos);
        }
        return true;
    }
    
}
