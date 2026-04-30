package Atividade7;

public class Pessoa {
    private String nome;
    private boolean dirigir;
    private boolean estaEmCasa;

    public Pessoa(String nome, boolean dirigir, boolean estaEmCasa) {
        this.nome = nome;
        this.dirigir = dirigir;
        this.estaEmCasa = estaEmCasa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isDirigir() {
        return dirigir;
    }

    public void setDirigir(boolean dirigir) {
        this.dirigir = dirigir;
    }

    public boolean isEstaEmCasa() {
        return estaEmCasa;
    }

    public void setEstaEmCasa(boolean estaEmCasa) {

        if((this.estaEmCasa == true) && (this.dirigir == true)){
            System.out.println("A pessoa está em casa, não pode dirigir.");
        } else if((this.estaEmCasa == false) && (this.dirigir == true)){
            System.out.println("A pessoa está dirigindo, não pode estar em casa.");
        } else if((this.estaEmCasa == false) && (this.dirigir == false)){
            System.out.println("A pessoa não está em casa e nem dirigindo, onde ela está?");
        } else if((this.estaEmCasa == true) && (this.dirigir == false)){
            System.out.println("A pessoa está em casa, não pode dirigir.");
        }
        
    }

}
