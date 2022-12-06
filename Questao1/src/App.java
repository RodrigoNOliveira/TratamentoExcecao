import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[2];
        try {
            System.out.println("Insira os valores para serem dividos: ");
            for (int i = 0; i < valores.length; i++) {
                valores[i] = scanner.nextInt();
            }
            int divisao = valores[0] / valores[1];
            System.out.println("A divisão é: " + divisao);
        } catch (ArithmeticException e) {
            System.out.println("ERRO: Não é possivel fazer a divisão por zero!");
        } catch (InputMismatchException e) {
            System.out.println("ERRO: Valor informado não é numerico!");
        }

        scanner.close();
    }
}
