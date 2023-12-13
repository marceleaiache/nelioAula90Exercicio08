package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        while (true) {
            System.out.println("Quantos elementos vai ter o vetor? ");
            if(sc.hasNext()) {
                n = sc.nextInt();
                break;
            }
            else {
                System.out.println("A quantidade de elementos precisa ser um número inteiro.");
                System.out.println("Por favor, digite quantos elementos vai ter o vetor: ");
                n = sc.nextInt();;
            }
        }

        int[] vect = new int[n];
        double sum = 0;
        int countNumber = 0;

        for (int i=0; i<vect.length; i++) {
            while (true) {
                System.out.println("Digite um número: ");

                if (sc.hasNext()) {
                    vect[i] = sc.nextInt();
                    if (vect[i] % 2 == 0 && (vect[i] * 10) % 1 == 0) {
                        sum += vect[i];
                        countNumber++;
                    }
                    break;
                }
                else {
                    System.out.println("O número precisar ser inteiro.");
                    System.out.println("Por favor, digite um número inteiro: ");
                    sc.nextInt();
                }
            }
        }

        if (sum == 0) {
            System.out.println("NENHUM NÚMERO PAR");
        }
        else {
            double average = sum / countNumber;
            System.out.printf("MEDIA DOS PARES = %.2f", average);
        }

        sc.close();
    }
}
