import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade, idadeMaiorQue50 = 0, somaAlturasEntre10e20 = 0, quantidadeIdadesEntre10e20 = 0, quantidadePesoMenorQue40 = 0;
        float altura, peso, mediaAlturasEntre10e20, porcentagemPesoMenorQue40;
        for(int i = 0; i < 25; i++){
            System.out.print("Digite a idade da pessoa: ");
            idade = sc.nextInt();
            System.out.print("Digite a altura da pessoa: ");
            altura = sc.nextFloat();
            System.out.print("Digite o peso da pessoa: ");
            peso = sc.nextFloat();
            if(idade >= 50){
                idadeMaiorQue50++;
            }
            if(idade >= 10 && idade < 20){
                somaAlturasEntre10e20 += altura;
                quantidadeIdadesEntre10e20++;
            }
            if(peso < 40){
                quantidadePesoMenorQue40++;
            }
        }
        sc.close();
        porcentagemPesoMenorQue40 = (quantidadePesoMenorQue40 / 25f) * 100f;
        mediaAlturasEntre10e20 = somaAlturasEntre10e20 / quantidadeIdadesEntre10e20;
        System.out.println("A) " + idadeMaiorQue50 + " pessoas possuem idade superior a 50 anos.");
        System.out.println("B) A media das alturas das pessoas com idade entre 10 e 20 anos é: " + mediaAlturasEntre10e20);
        System.out.println("C) " + porcentagemPesoMenorQue40 + "% das pessoas possuem peso abaixo de 40 quilos.");
    }
}
