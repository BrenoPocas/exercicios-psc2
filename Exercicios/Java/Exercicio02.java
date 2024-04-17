import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num, maior = 0;
        for (int i = 0; i < 5; i++){
            System.out.print("Digite um numero: ");
            num = sc.nextFloat();
            if(num > maior){
                maior = num;
            }
        }
        sc.close();
        System.out.println("O maior numero digitado foi: " + maior);
    }
}
