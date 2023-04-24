import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
    public static void main(String[] args) {
        Random numeroAleatorio = new Random();
        Scanner scanner = new Scanner(System.in);

        int numero =numeroAleatorio.nextInt(100);
        int tentativas = 0;
        int sugestao;

        while(tentativas <= 4){
            System.out.println("Digite um numero no console");
            sugestao = scanner.nextInt();
            System.out.println(numero);
            if(sugestao == numero){
                System.out.println("Parabens você acertou!!!");
                break;
            } else if (sugestao > numero) {
                System.out.println("Você chutou muito alto");
            } else {
                System.out.println("Você chutou muito baixo");
            }

            tentativas++;
        }



    }
}
