package Atividade6;

public class Carro {
    
    private String marca;
    private int codigoCor;
    private double preco;
    private boolean estaEmMovimento;
    private boolean estaLigado ;

    public Carro(String marca, int codigoCor, double preco) {
        this.marca = marca;
        this.codigoCor = codigoCor;
        this.preco = preco;

    }
    
   

    public Carro(String marca, int codigoCor, double preco, boolean estaEmMovimento, boolean estaLigado) {
        this.marca = marca;
        this.codigoCor = codigoCor;
        this.preco = preco;
        this.estaLigado = estaLigado;
        this.estaEmMovimento = estaEmMovimento;
        
    }


    public String getMarca() {
        return marca;
    }

    public int getCodigoCor() {
        return codigoCor;
    }

    public double getPreco() {
        return preco;
    }   
    

    public boolean isEstaEmMovimento() {
        return estaEmMovimento;
    }

    public void setEstaEmMovimento(boolean estaEmMovimento) {
        this.estaEmMovimento = estaEmMovimento;
    }

    public boolean isEstaLigado() {
        return estaLigado;
    }

    public void setEstaLigado(boolean estaLigado) {
        this.estaLigado = estaLigado;
    }

    public void buzinar() {
        if((this.estaEmMovimento == true) && (this.estaLigado == true)){
            System.out.println("\"bi bi!\"\n");

        } else {
            System.out.println("O carro está parado, não pode buzinar.\n");
        }
        
    }

    public void ligar() {
        if(this.estaLigado == true) {
            System.out.println("O carro já está ligado.");
        } else {
            
            System.out.println("O carro esta desligado.");
        }
        
    }

    public void movimentar() {
        if ((this.estaEmMovimento == true) && (this.estaLigado == true)) {
            System.out.println("O carro já está ligado e em movimento.");
        } else {
           System.out.println("O carro esta ligado, porem ele esta parado.");
        }
        
        
    }
}
