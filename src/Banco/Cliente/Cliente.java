package Banco.Cliente;

public class Cliente {

   private String nome;
    private int cpf;
    private String endereco;

    public Cliente(){
        nome = "Pedro";
        endereco = "Minha Casa";
        cpf = 1212;
    }

    public void insereNome(String novoNome){
        if (!novoNome.isEmpty()){
            nome = novoNome;
        }
    }

    public String retornaNome(){
        return nome;
    }


   public void insereCpf (int novoCpf){

       if (novoCpf > 0) {
           cpf = novoCpf;
       }
   }

   public int retornaCpf(){
        return cpf;
   }

   public void isereEndereco(String novoEndereço){
        if (endereco.isEmpty()){
            endereco = novoEndereço;
        }
   }

   public String retornaEndereco(){
        return endereco;
   }


}

