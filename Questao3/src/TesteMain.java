import java.util.Scanner;

public class TesteMain {
    public static void main(String[] args) throws Exception {
        Login login = new Login();
        Scanner scanner =new Scanner(System.in);

        System.out.print("Insira o Usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Insira a Senha: ");
        String senha = scanner.nextLine();
        login.fazerLogin(usuario, senha);
        scanner.close();
    }
}
