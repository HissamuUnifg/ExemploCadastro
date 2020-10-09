package exemplocadastro;

public class Cliente {
    private String cpf;    
    private String nome;
    private String sobrenome;
    private Endereco endereco;

    public Cliente(String cpf, String nome, String sobrenome, Endereco endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        // Algoritmo de validação do cpf
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        // Verificar se não veio vazio
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }    
    
}
