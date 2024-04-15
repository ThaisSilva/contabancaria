import java.util.Scanner;

public class Conta {

    double saldo = 2500.00;
    Scanner ler = new Scanner(System.in);
    public int consutarSaldo()
    {
        System.out.println("Seu saldo é: R$" + saldo);
        return (int) saldo;
    }

    public int receberValor ()
    {
        System.out.println("Digite o valor a ser recebido");
        double valorRecebido = ler.nextDouble();
        saldo = saldo + valorRecebido;
        System.out.println("Valor recebido! Saldo atualizado: R$" + saldo);
        return (int) saldo;
    }
    public int transferirValor()
    {
        System.out.println("Digite o valor a ser transferido");
        double valorTransferido = ler.nextDouble();
        if (valorTransferido < saldo) {
            saldo = saldo - valorTransferido;
            System.out.println("Valor transferido! Saldo atual: R$" + saldo);
        } else {
            System.out.println("Não há saldo suficiente para essa operação");
        }
        return (int) saldo;
    }

}

