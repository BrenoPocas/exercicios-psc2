import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, fat = 1;

        System.out.print("Digite um numero: ");
        num = sc.nextInt();
        sc.close();

        for(int i = 0; i < num; i++){
            fat *= (num-i);
        }

        System.out.println("O fatorial de " + num + " é " + fat);
    }
}
