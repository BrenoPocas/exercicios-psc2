import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        for (int i = 0; i < 10; i++){
            System.out.print("Digite um numero: ");
            soma += sc.nextInt();
        }
        sc.close();
        System.out.println("A soma dos numeros digitados é: " + soma);
    }
}