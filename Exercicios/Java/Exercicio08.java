import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Digite um numero: ");
        num = sc.nextInt();
        sc.close();

        for(int i = 0; i <= 100; i++){
            System.out.println(num + " * " + i + " = " + (num*i));
        }
    }
}
