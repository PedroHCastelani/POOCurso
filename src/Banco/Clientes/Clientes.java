package Banco.Clientes;

public class Clientes {

    String nome;
    String CPF;
    String endereco;
    String rua;
    String numero;
    String bairro;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {

        return "\n Rua: " + rua + "\n Numero: " + numero + "\n Bairro: " + bairro;
    }

    public void setEndereco(String rua, String numero, String bairro) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;


    }


}

