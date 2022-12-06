import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[10];
        try {
            int i = 0;
            System.out.println("Insira valores:");

            do {
                valores[i] = scanner.nextInt();
                i++;
            } while (valores[i - 1] != 0);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERRO: Quantidade de valores inseridos superior a 10!");
        } catch (InputMismatchException e) {
            System.out.println("ERRO: Valor informado não é numerico!");
        }

        scanner.close();
    }
}
