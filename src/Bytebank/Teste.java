package Bytebank;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Conta conta = new Conta(2501,0125);
        Conta conta2 = new Conta(1711,1117);

        System.out.println("""
                Selecione as Opções
                1- Saldo
                2- Transferir
                3- Depositar
                4- Sacar
                5- Sair""");
        scanner.nextLine();

    }
}
