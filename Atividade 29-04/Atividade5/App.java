package Atividade5;

/**
 * @author Orestes Pereira - Academia Java Accenture 29-05-2026
 *         E-mail: orestes.pereira@gmail.com
 *
 */

    public class App {

        public static void main(String[] args) {
            Dog dog1 = new Dog("Pitty", 5);
            Gato gato1 = new Gato("Lunna", 3);

            System.out.println("Nome do cachorro: " + dog1.getNome());
            System.out.println("Idade do cachorro: " + dog1.getIdade());
            dog1.emitirSom();

            System.out.println("Nome do gato: " + gato1.getNome());
            System.out.println("Idade do gato: " + gato1.getIdade());
            gato1.emitirSom();
        }

    }