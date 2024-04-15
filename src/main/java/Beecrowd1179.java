import java.util.Scanner;

public class Beecrowd1179 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] vetorPar = new int[5];
        int[] vetorImpar = new int[5];
        int x, ContPar = 0, ContImpar = 0;

        for (int i = 0; i < 15; i++) {
            x = sc.nextInt();
            if (x % 2 == 0) {
                vetorPar[ContPar] = x;
                ContPar++;
            } else {
                vetorImpar[ContImpar] = x;
                ContImpar++;
            }
            if (ContPar == 5) {
                ContPar = 0;
                for (int j = 0; j < vetorPar.length; j++) {
                    System.out.println("par[" + j + "] = " + vetorPar[j]);
                }
            } else if (ContImpar == 5) {
                ContImpar = 0;
                for (int j = 0; j < vetorImpar.length; j++) {
                    System.out.println("impar[" + j + "] = " + vetorImpar[j]);
                }
            }
        }
        for (int i = 0; i < ContImpar; i++) {
            System.out.println("impar[" + i + "] = " + vetorImpar[i]);
        }
        for (int i = 0; i < ContPar; i++) {
            System.out.println("par[" + i + "] = " + vetorPar[i]);
        }
    }
}
