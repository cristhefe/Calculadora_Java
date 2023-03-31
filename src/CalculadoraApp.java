import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        double valorUm;
        double valorDois;
        String operacao;
        boolean continuar;
try {
    do {
    System.out.println("Digite o valor um:");
    valorUm = input.nextDouble();

    System.out.println("Digite a operação (+, -, /, *):");
    operacao = input.next();

    System.out.println("Digite o valor dois:");
    valorDois = input.nextDouble();

    System.out.println("RESULTADO:" + realizarCalculo(valorUm, valorDois, operacao));

    continuar = VerificarNovaOperacao();
       } while (continuar);

    }catch (InputMismatchException ex) {
    System.out.println("Os valores para o calculo devem ser númericos =) ");
}




    }
    public static boolean VerificarNovaOperacao(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Deseja realizar uma nova operação ? (s ou N):");
        return !sc.next().toUpperCase(Locale.ROOT).equals("N");

    }
public static double realizarCalculo(double valorUm, double valorDois, String operacao) {
    double respostaCalculo = 0.0;

    switch (operacao) {
        case "+":
            respostaCalculo = valorUm + valorDois;
            break;

        case "-":
            respostaCalculo = valorUm - valorDois;
            break;

        case "/":
            respostaCalculo = valorUm / valorDois;
            break;

        case "*":
            respostaCalculo = valorUm * valorDois;
            break;

        default:
            System.out.println("Operação inválida!");
    }
return respostaCalculo;
}
}

