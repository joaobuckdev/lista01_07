import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double medida;
        double dobro;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira a altura do quadrado: ");
        medida = teclado.nextDouble();
        teclado.close();

        System.out.println(" ");
        System.out.println("A área do quadrado é de: " + medida*medida);

        dobro = ((medida*medida)*2);
        System.out.println("O dobro da área do quadrado é: " + dobro);
    }
}
