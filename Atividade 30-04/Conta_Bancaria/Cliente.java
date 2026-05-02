package Conta_Bancaria;



public class Cliente  {

    private String nome;
    private String sobrenome;
    private String cpf;  





    public Cliente(String nome, String sobrenome, String cpf) {
        
      
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }
    public String getNome() {

        return nome + " " + sobrenome ;
       
    }

    public void setNome(String nome) {

        this.nome = nome+ " " +sobrenome;
    }

    public String getCpf() {

        return cpf;
    }

    public void setCpf(String cpf) {

        this.cpf = cpf;
    }






}
