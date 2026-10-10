import java.util.Random;
import java.util.Scanner;

// Some code
public class Main {
    static Scanner teclado = new Scanner(System.in);
    static Random numeroAleatorio = new Random();
    public static void main(String[] args) {
        Algoritmo8();
    }
    private static void Algoritmo1(){
        System.out.println("Algoritmo 1");
    }
    private static void Algoritmo2(){
        int [] vetorA = new int[10];
        int [] vetorB = new int[10];

        int [] vetorC = new int[20];

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe um número: ");
            vetorA[i] = teclado.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe um número: ");
            vetorB[i] = teclado.nextInt();
        }


        for (int i = 0; i < 10; i++) {
            vetorC[i * 2] = vetorA[i];
            vetorC[i * 2 + 1] = vetorB[i];
        }

        for (int i = 0; i < 20; i++) {
            System.out.print(vetorC[i]);
        }


    }

    private static void Algoritmo3(){
        int [] vetor = new int[10];
        double media = 0;


        for (int i = 0; i < 10; i++) {
            vetor[i] = numeroAleatorio.nextInt(1, 100);
            media = media + vetor[i];
            System.out.print(vetor[i] + "; ");

        }

        media = media / 10;
        System.out.println();
        System.out.println("A media é: " + media);

    }

    private static void Algoritmo4(){
        int [] vetor = new int[20];

        for (int i = 0; i < 20; i++) {
            vetor[i] = numeroAleatorio.nextInt(1, 30);
            if (vetor[i] == 25){
                System.out.println("Existe o número 25 no vetor");
            }
        }

    }

    private static void Algoritmo5(){
        int [] vetor = new int[15];

        for (int i = 0; i < 15; i++) {
            vetor[i] = numeroAleatorio.nextInt(1, 50);
            if (vetor[i] == 20){
                System.out.println("Existe o número 20 no vetor, e está na posição " + i);
            }
        }

    }

    private static void Algoritmo6(){
        int [] vetor = new int[30];

        System.out.println("Informe um valor: ");
        int numeroVetor = teclado.nextInt();

        for (int i = 0; i < 30; i++) {
            vetor[i] = numeroAleatorio.nextInt(1, 100);
            if (vetor[i] == numeroVetor){
                System.out.println("Existe o número " + numeroVetor + "no vetor");
                vetor[i] = 0;
            }

        }
    }

    private static void Algoritmo7(){
        double [] vetor = new double[5];
        double maiorValor = 0;
        double menorValor = Double.MAX_VALUE;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = teclado.nextDouble();

            if (vetor[i] > maiorValor){
                maiorValor = vetor[i];
            } else if (vetor[i] < menorValor){
                menorValor = vetor[i];
            }

        }

        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Menor valor: " + menorValor);
    }

    private static void Algoritmo8(){
        int [] vetorA = new int[15];
        int [] vetorB = new int[15];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetorA[i] = teclado.nextInt();
        }

        int j = 0;

        for (int i = vetorA.length - 1; i >= 0; i--) {
            vetorB[j] = vetorA[i];

            j++;
        }
        System.out.println("Vetor A: " + java.util.Arrays.toString(vetorA));
        System.out.println("Vetor B: " + java.util.Arrays.toString(vetorB));
    }

}