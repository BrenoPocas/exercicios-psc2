import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean primo = true;

        System.out.print("Digite um numero: ");
        num = sc.nextInt();
        sc.close();
        
        for(int i = 2; i < num; i++){
            if(num%i==0){
                primo = false;
                break;
            }
        }

        if(primo){
            System.out.println("O numero " + num + " é primo.");
        } else {
            System.out.println("O numero " + num + " não é primo.");
        }
    }
}
