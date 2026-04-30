package Atividade7;

/**
 * @author Orestes Pereira - Academia Java Accenture 29-05-2026
 *         E-mail: orestes.pereira@gmail.com
 *
 */

public class Programa {

    public static void main(String[] args) {
    
        Carro carro = new Carro(true, true, false);
        Arvore arvore = new Arvore(true, true, true);
        Casa casa = new Casa();
        Pessoa pessoa = new Pessoa("João", true, false);

        carro.isEstaAbastecido();
        carro.isEstaEmMovimento();
        carro.isEstacionado();
        carro.isEstaReseva();

        arvore.isTemFruto();
        arvore.isTemFolhaNoChao();
        arvore.isTemSombra();

        casa.isHaGente();

        pessoa.isDirigir();
        pessoa.isEstaEmCasa();

    }
    
}
