import java.util.Scanner;
import java.util.Locale;

public class Escreva {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in).useLocale(Locale.US); 
        System.out.println("Digite o seu nome ");
        String nome = scanner.next();
        System.out.println("Informe o seu sobrenome ");
        String sobrenome = scanner.next();
        System.out.println("Qual é a sua idade? ");
        int idade = scanner.nextInt();
        System.out.println("Informe a sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Meu nome é "+ nome +" "+sobrenome+ " tenho "+ idade+" anos "+ "e minha altura é "+ altura);


    }
}
