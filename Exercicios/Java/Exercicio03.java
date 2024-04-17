import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, pares = 0;
        for (int i = 0; i < 10; i++){
            System.out.print("Digite um numero: ");
            num = sc.nextInt();
            if (num % 2 == 0){
                pares++;
            }
        }
        sc.close();
        System.out.println(pares + " dos números digitados são pares.");
    }
}
