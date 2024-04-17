import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int tam = 25;
        int[] idade = new int[tam];
        float[] altura = new float[tam];
        float[] peso = new float[tam];
        int idadeMaiorQue50 = 0, idadeEntre10e20 = 0, pesoMenorQue40 = 0;
        float somaAlturas = 0, mediaAlturas, porcentagemPesoMenorQue40;

        for(int i = 0; i < tam; i++){
            System.out.print("Informe a idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Informe a altura: ");
            altura[i] = sc.nextFloat();
            System.out.print("Informe o peso: ");
            peso[i] = sc.nextFloat();
            
            if(idade[i] >= 50){
                idadeMaiorQue50++;
            }
            if(idade[i] >= 10 && idade[i] < 20){
                somaAlturas += altura[i];
                idadeEntre10e20++;
            }
            if(peso[i] < 40){
                pesoMenorQue40++;
            }
        }

        sc.close();

        System.out.println(idadeMaiorQue50 + " pessoas possuem mais de 50 anos.");

        if(idadeEntre10e20!=0){
            mediaAlturas = (float)somaAlturas / (float)idadeEntre10e20;
            System.out.println("A média das alturas das pessoas entre 10 e 20 anos é: " + mediaAlturas);
        } else {
            System.out.println("Não possui pessoas entre 10 e 20 anos.");
        }
            
        porcentagemPesoMenorQue40 = (float)pesoMenorQue40 / (float)peso.length * 100f;
        System.out.println(porcentagemPesoMenorQue40 + "% das pessoas possuem peso inferior a 40 quilos.");
    }
}
