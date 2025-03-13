import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitorEntrada = new Scanner(System.in);

        float valorSalario, valorBeneficio, saida;
        float valorImposto = 0;

        System.out.print("Digite o valor do salário: R$");
        valorSalario = leitorEntrada.nextFloat();

        System.out.print("Digite o valor do benefício: R$");
        valorBeneficio = leitorEntrada.nextFloat();

        if (valorSalario >= 0 && valorSalario <= 1100){
            valorImposto = 0.05F * valorSalario;
        }
        if (valorSalario >= 1100.01 && valorSalario <=2500) {
            valorImposto = 0.10F * valorSalario;
        }
        if (valorSalario > 2500) {
            valorImposto = 0.15F * valorSalario;
        }

        saida = valorSalario + valorBeneficio - valorImposto;
        System.out.println("O valor do salário com desconto é: " + String.format("%.2f", saida));

    }
}