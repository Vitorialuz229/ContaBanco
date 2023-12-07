package com.github.vitorialuz229.ContaBanco;

import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira informações da conta
        System.out.print("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.print("Por favor, digite a agência: ");
        String agencia = scanner.next();

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.print("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        // Cria a mensagem formatada
        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);

        // Exibe a mensagem
        System.out.println(mensagem);
        
        // Fecha o scanner
        scanner.close();
    }
}
