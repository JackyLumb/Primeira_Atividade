package lpatv1;

import java.util.Scanner;

public class LpAtv1 {

    public static void main(String[] args) {

        double valor_pao, valor_broa, total_vendas, valor_poupanca, quant_broa, quant_pao;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de pães vendidos: ");
        quant_pao = entrada.nextDouble();

        System.out.print("Digite a quantidade de broas vendidas: ");
        quant_broa = entrada.nextDouble();

        valor_pao = quant_pao * 0.12;

        valor_broa = quant_broa * 1.50;

        total_vendas = valor_pao + valor_broa;

        valor_poupanca = ((total_vendas * 10) / 100);

        System.out.println("Total de vendas de Pão: " + valor_pao);

        System.out.println("Total de vendas de Broa: " + valor_broa);

        System.out.println("Total de vendas: " + total_vendas);

        System.out.println("Valor para a poupança: " + valor_poupanca);
    }
}