import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Thaís";
        String tipoDeConta = "Corrente";
        double saldo = 2500.00;
        Scanner ler = new Scanner(System.in);
        Conta conta = new Conta();
        boolean mostrarMenu = true;

        System.out.println("Nome do cliente:" + nome);
        System.out.println("Tipo de conta:" + tipoDeConta);
        System.out.println("Saldo atual:" + saldo);
        System.out.println("********************");

        String menu = """
                Operações
                                
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                                
                Digite a opção desejada:
                """;


        while (mostrarMenu) {
            System.out.println(menu);
            int opcaoSelecionada = ler.nextInt();

            switch (opcaoSelecionada) {
                case 1:
                    conta.consutarSaldo();
                    break;
                case 2:
                    conta.receberValor();
                    break;
                case 3:
                    conta.transferirValor();
                    break;
                case 4:
                    mostrarMenu = false;
                    break;
            }
        }

    }
}