public class Exercicio07 {
    public static void main(String[] args) {
        System.out.print("Numeros que produzem resto 3 quando divididos por 5: ");
        for(int i = 1000; i < 2000; i++){
            if(i%5==3){
                System.out.print(i + " ");
            }
        }
    }
}
