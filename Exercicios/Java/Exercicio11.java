import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalIdades = 0, pesoMaiorQueNoventa = 0;
        float peso, mediaIdades;
        for(int i = 0; i < 7; i++){
            System.out.print("Digite a idade de uma pessoa: ");
            totalIdades += sc.nextInt();
            System.out.print("Digite o peso dessa pessoa: ");
            peso = sc.nextFloat();
            if(peso > 90){
                pesoMaiorQueNoventa++;
            }            
        }
        sc.close();
        mediaIdades = totalIdades / 7;
        System.out.println("A media das idades das sete pessoas é: " + mediaIdades + " e " + pesoMaiorQueNoventa + " pessoas pesam mais que 90kg.");
    }
}