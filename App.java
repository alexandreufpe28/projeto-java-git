import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();
        System.out.println("Digite sua idade:");
        String idade = sc.nextInt();


        sc.close();

        System.out.println("Olá, " + nome + "!");
        System.out.println("Sua idade é" + idade);
    }
    
}
