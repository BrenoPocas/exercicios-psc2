import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, somaPares = 0, somaImpares = 0, somaDiv3 = 0;

        for(int i = 0; i < 10; i++){
            System.out.print("Digite um numero: ");
            num = sc.nextInt();
            if(num%2 == 0){
                somaPares += num;
            } else {
                somaImpares += num;
            }
            if(num%3 == 0){
                somaDiv3 += num;
            }
        }
        sc.close();
        System.out.println("A soma dos numeros pares é: " + somaPares);
        System.out.println("A soma dos numeros impares é: " + somaImpares);
        System.out.println("A soma dos numeros divisiveis por três é: " + somaDiv3);
    }
}
