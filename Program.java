import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double a = in.nextDouble();
        System.out.print("Digite outro número: ");
        double b = in.nextDouble();

        System.out.println("ESCOLHA A OPERAÇÃO: \n1 - SOMA\n2 - SUBTRAÇÃO\n3 - MULTIPLICAÇÃO\n4 - DIVISÃO");
        int escolha = in.nextInt();

        switch (escolha) {
            case 1:
                System.out.println(sum(a,b));
                break;
            case 2:
                System.out.println(subtraction(a, b));
                break;
            case 3:
                System.out.println(multiplication(a,b));
                break;
            case 4:
                System.out.println(division(a,b));
                break;
            default:
                System.out.println("Ocorrência não encontrada");
                break;
        }

        in.close();
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double subtraction(double a, double b) {
        return a - b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static double average(double a, double b) {
        return (a + b) / 2;
    }
}
