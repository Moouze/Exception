package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados da conta bancária: ");
        System.out.print("Numero: ");
        int numero = sc.nextInt();
        System.out.print("Titular: ");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.print("Saldo: ");
        Double saldo = sc.nextDouble();
        System.out.print("Limite de saque: ");
        Double limiteSaque = sc.nextDouble();

        Account conta = new Account(numero, titular, saldo, limiteSaque);

        System.out.println();
        System.out.println("Informe o valor do deposito: ");
        double quantia = sc.nextDouble();
        conta.deposito(quantia);
        System.out.printf("Saldo total: %.2f", conta.getSaldo());
    }
}
