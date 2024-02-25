import java.util.Scanner;
//Card 8
public class CabecalhoDinamico {
    public static void main(String[] args) {

        System.out.println("Digite um número para criar o cabeçalho dinâmico: ");
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();


        for (int i = 0; i < tamanho; i++) {
            System.out.print("*");
        }
        System.out.println("\nBem vindo ao Comex");

        for (int i = 0; i < tamanho; i++) {
            System.out.print("*");
        }
    }

}
