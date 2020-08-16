import java.util.Scanner;

public class Sistema_cadastro_login {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean nomeV = false;

        boolean sobrenomeV = false;

        boolean senhaV = false;


        String nome = null;
        String sobrenome = null;
        String senha = null;


        while (nomeV ==false) {

    System.out.println("digite um nome");
    nome = scanner.nextLine();
    nomeV = true;

}
while (sobrenomeV ==false) {

    System.out.println("digite um sobrenome");
    sobrenome = scanner.nextLine();
    sobrenomeV = true;

}
while (senhaV ==false){
    System.out.println("digite a senha");
    senha = scanner.nextLine();

    if(senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-, !, @])(?=.*[A-Z])(?=.*\\d).+") && senha.length() > 7){

        System.out.println("cadastrado com sucesso");
        senhaV =true;
    }else {

        System.out.println("Requer 1 letra maiuscula, 1 numero, e 1 desses caracteres - ! @, e ter mais que 7 caracteres!");

    }

    }

        System.out.println("username:" + nome.charAt(0)+ "_"+ sobrenome);

        System.out.println("senha:" + senha);

        String username  =nome.charAt(0)+ "_" + sobrenome;

    //parte do login
        boolean validar = false;

        while (validar ==false){

            System.out.println("Digite o username");
            String loginV = scanner.nextLine();

            System.out.println ("Insira sua senha");
            String senhaB = scanner.nextLine();

            if (loginV.equals(username)&& senhaB.equals(senha)) {
                System.out.println("login realizado com sucesso");

                validar =true;

            }else {
                System.out.println("login e senha errados");

            }


        }




    }}
