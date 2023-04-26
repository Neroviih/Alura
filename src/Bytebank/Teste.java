package Bytebank;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Conta conta = new Conta(2501, 0125);
        Conta conta2 = new Conta(1711, 1117);

        conta.deposita(2500);
        String menu = String.format("""
                Selecione as Opções
                1- Saldo
                2- Transferir
                3- Depositar
                4- Sacar
                5- Sair""");

        int numero = 0;
        while (numero != 5) {
            System.out.println(menu);
            numero = scanner.nextInt();

            switch (numero) {
                case 1:
                    System.out.println("O seu saldo atual é de:" + conta.saldo);
                    break;

                case 2:
                    System.out.println("Digite o valor que deseja transferir");
                    int numero2 = scanner.nextInt();
                    conta.transferir(numero2, conta2);
                    System.out.println("Transferencia de " + numero2 + " realizada com sucesso");
                    break;

                case 3:
                    System.out.println("Digite o valor que deseja depositar");
                    int numero3 = scanner.nextInt();
                    conta.deposita(numero3);
                    System.out.println("Deposito de " + numero3 + " realizado com sucesso");
                    break;

                case 4:
                    System.out.println("Digite o valor que deseja sacar");
                    int numero4 = scanner.nextInt();
                    conta.saca(numero4);
                    System.out.println("Saque de " + numero4 + " realizado com sucesso");
                    break;

                case 5:
                    System.out.println("Obrigado por utilizar os nossos serviços");
                    break;

                default:
                    System.out.println("Opção invalida tente novamente");
                    break;
            }
        }


    }
}
