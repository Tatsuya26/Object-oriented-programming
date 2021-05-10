package com.company.F2;
import java.util.Scanner;
import java.util.Arrays;

public class Interface {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira qual exercício quer testar: ");
        int exercise = sc.nextInt();
        if(exercise == 1) {
            System.out.println("Quantos numeros quer inserir?\n");
            int n = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            Controller f = new Controller();


            System.out.println("Array a");
            for(int i = 0; i < n; i++) {
                System.out.println("Introduza um valor para a["+ i +"]");
                a[i] = sc.nextInt();
            }

            System.out.println("Array b");
            for(int i = 0; i < n; i++) {
                System.out.println("Introduza um valor para b["+ i +"]");
                b[i] = sc.nextInt();
            }

            System.out.println("Array: "+ Arrays.toString(a));
            System.out.println("Array: "+ Arrays.toString(b));

            System.out.println("Minimum is :" + f.minimum(a));
            System.out.println("Sub array is: " + Arrays.toString(f.betweenIndex(a,2,5)));
            System.out.println("Equal elements are: " + Arrays.toString(f.comuns(a,b)));
        }
        else if(exercise == 2) {
            int[][] matrix = new int[5][5];
            notasTurma turma = new notasTurma(matrix);

        }
    }
}
