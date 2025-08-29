import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Calculadora Simples ===");
        System.out.print("Digite o primeiro número: ");
        double a = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double b = sc.nextDouble();

        System.out.println("Escolha a operação (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double resultado;
        switch (op) {1
            case '+': resultado = a + b; break;
            case '-': resultado = a - b; break;
            case '*': resultado = a * b; break;
            case '/': resultado = (b != 0) ? a / b : Double.NaN; break;
            default: System.out.println("Operação inválida."); return;
        }

        System.out.println("Resultado: " + resultado);
        sc.close();
    }
}
