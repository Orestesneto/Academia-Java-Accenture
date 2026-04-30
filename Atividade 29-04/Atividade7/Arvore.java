package Atividade7;

public class Arvore {

    private boolean temFruto;
    private boolean temFolhaNoChao;
    private boolean temSombra;


    public Arvore(boolean temFruto, boolean temFolhaNoChao, boolean temSombra  ) {
        this.temFruto = temFruto;
        this.temFolhaNoChao = temFolhaNoChao;
        this.temSombra = temSombra; 
    }


    public boolean isTemFruto() {
        if(this.temFruto == true){
            System.out.println("A árvore tem frutos, precisa ser colhida.");
        } else {
            System.out.println("A árvore não tem frutos.");
        }
        return temFruto;
    }

        
    public void setTemFruto(boolean temFruto) {
        this.temFruto = temFruto;
    }


    public boolean isTemFolhaNoChao() {
        if(this.temFolhaNoChao == true){
            System.out.println("A árvore tem folhas no chão, precisa ser varrida.");
        } else {
            System.out.println("A árvore não tem folhas no chão.");
        }
        return temFolhaNoChao;
    }


    public void setTemFolhaNoChao(boolean temFolhaNoChao) {
        this.temFolhaNoChao = temFolhaNoChao;
    }


    public boolean isTemSombra() {
        if(this.temSombra == true){
            System.out.println("A árvore tem sombra, é um ótimo lugar para estacionar.");
        } else {
            System.out.println("A árvore não tem sombra, não é um bom lugar para estacionar.");
        }
        return temSombra;
        
    }


    public void setTemSombra(boolean temSombra) {
        this.temSombra = temSombra;
    }  

    
}
