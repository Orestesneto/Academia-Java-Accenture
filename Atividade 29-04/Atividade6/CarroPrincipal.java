package Atividade6;

/**
 * @author Orestes Pereira - Academia Java Accenture 29-05-2026
 *         E-mail: orestes.pereira@gmail.com
 *
 */

public class CarroPrincipal {

    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", 123, 50000.0, false, false);
        Carro carro2 = new Carro("Honda", 456, 60000.0, false, true);
        Carro carro3 = new Carro("Ford", 789, 55000.0, true, false);
        Carro carro4 = new Carro("Chevrolet", 321, 45000.0, true, true);

        System.out.println("Marca do carro 1: " + carro1.getMarca());
        System.out.println("Código da cor do carro 1: " + carro1.getCodigoCor());
        System.out.println("Preço do carro 1: " + carro1.getPreco());

        System.out.println("Marca do carro 2: " + carro2.getMarca());
        System.out.println("Código da cor do carro 2: " + carro2.getCodigoCor());
        System.out.println("Preço do carro 2: " + carro2.getPreco());

        System.out.println("Marca do carro 3: " + carro3.getMarca());
        System.out.println("Código da cor do carro 3: " + carro3.getCodigoCor());
        System.out.println("Preço do carro 3: " + carro3.getPreco());

        System.out.println("Marca do carro 4: " + carro4.getMarca());
        System.out.println("Código da cor do carro 4: " + carro4.getCodigoCor());
        System.out.println("Preço do carro 4: " + carro4.getPreco());

        carro1.ligar();
        carro1.movimentar();
        carro1.buzinar();

        carro2.ligar();
        carro2.movimentar();
        carro2.buzinar();

        carro3.ligar();
        carro3.movimentar();
        carro3.buzinar();

        carro4.ligar();
        carro4.movimentar();
        carro4.buzinar();
    }
    
}
