package Atividade7;

public class Carro {

    private boolean estaAbastecido;
    private boolean estaReseva;
    private boolean estaEmMovimento;
    private boolean estacionado;

    public Carro(boolean estaAbastecido, boolean estaEmMovimento, boolean estacionado) {
        this.estaAbastecido = estaAbastecido;
        this.estaEmMovimento = estaEmMovimento;
        this.estacionado = estacionado;
        this.estaReseva = false;
    }

    public boolean isEstaAbastecido() {
        return estaAbastecido;
    }

    public void setEstaAbastecido(boolean estaAbastecido) {
        if((this.estaEmMovimento == true)&&(this.estaAbastecido == true)){
            System.out.println("Não é possível abastecer o carro enquanto ele estiver em movimento.");

        } else if((this.estaEmMovimento == false)&&(this.estaReseva == true)){
            System.out.println("Precisa URGENTIMENTE abastecer o carro para que ele possa se mover.");

        }else if((this.estaReseva == false)&&(this.estaAbastecido == false)){
            System.out.println("Acionar o Guincho. Automovel sem combustivel.");
        }

    }



    public boolean isEstaEmMovimento() {
        if((this.estaAbastecido == true) && (this.estaEmMovimento == true)){
            System.out.println("O carro está em movimento.");
        } else {

            System.out.println("O carro está estacionado, não pode se mover.");
            
        }
        return estaAbastecido;
        
    }

    public void setEstaEmMovimento(boolean estaEmMovimento) {
        this.estaEmMovimento = estaEmMovimento;
    }

    public boolean isEstacionado() {
        return estacionado;
    }

    public void setEstacionado(boolean estacionado) {
        this.estacionado = estacionado;  
    }

    public boolean isEstaReseva() {
    return estaReseva;
    }

    public void setEstaReseva(boolean estaReseva) {
    this.estaReseva = estaReseva;
    }
 }



    

