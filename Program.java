import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean verification = false;

        while (verification == false) {
            System.out.print("Digite um número: ");
            double a = in.nextDouble();
            System.out.print("Digite outro número: ");
            double b = in.nextDouble();

            System.out.println("ESCOLHA A OPERAÇÃO: \n1 - SOMA\n2 - SUBTRAÇÃO\n3 - MULTIPLICAÇÃO\n4 - DIVISÃO");
            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("%.2f", sum(a, b));
                    break;
                case 2:
                    System.out.printf("%.2f", subtraction(a, b));
                    break;
                case 3:
                    System.out.printf("%.2f", multiplication(a, b));
                    break;
                case 4:
                    System.out.printf("%.2f", division(a, b));
                    break;
                default:
                    System.out.println("Ocorrência não encontrada");
                    break;
            }

            char name = 'a';
            while (name != 's' && name != 'n') {
                System.out.println("Deseja continuar? (s/n)");
                name = in.next().charAt(0);
            }
            verification = name == 'n';


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
