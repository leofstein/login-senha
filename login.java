import java.util.Scanner;
public class login {


    //Login e senha.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 1 - Informe o seu login.
        System.out.println("Login: ");
        String login = in.nextLine();
        // 2 - Informe a sua senha.
        System.out.println("Senha: ");
        String senha = in.nextLine();
        // 3 - Armazenar em variáveis o login e senha.
        // 4 - Verificar se o login e senha estão corretos.

        // Comparando uma instância (objeto) com uma string.
        if (login.equals  ("Leonardo") && senha.equals ("123456")) {
            System.out.println("Usuário %s logado com sucesso.");
        } else {
            System.out.println("Login ou senha inválidos!");
        }
    }
}
