import com.company.Ficha1;
import java.util.Scanner;


public class TestePrograma {
    public static void main(String[] args) {
        //inicialização de um scanner para leitura
        Scanner sc = new Scanner(System.in);
        Ficha1 f = new Ficha1();

        //exercicio 1
        System.out.println("Insira uma temperatura em graus celsius: ");
        double degree = sc.nextDouble();
        System.out.printf("A temperatura em farenheit é: %f\n", f.celsiusParaFarenheit(degree));

        //exercicio 2
        System.out.println("Insira dois números: \n");
        int x = sc.nextInt(), y = sc.nextInt();
        int max = f.maximoNumeros(x,y);
        System.out.printf("O maior é: %d\n", max);

        //exercicio 3
        System.out.println("Insira um nome de conta e o saldo da mesma: \n");
        String nome = sc.next();
        int saldo = sc.nextInt();
        System.out.println(f.criaDescricaoConta(nome,saldo));

        //Exercício 4
        System.out.println("Insira uma valor em euros e uma taxa de conversão para libras:");
        double value = sc.nextDouble();
        double convert = sc.nextDouble();
        System.out.printf("O valor em libras é %f\n", f.eurosParaLibras(value,convert));

        //exercicio 5
        System.out.println("Insira dois números: ");
        int maior = sc.nextInt();
        int menor = sc.nextInt();
        if(maior < menor) System.out.printf("%d %d  media: %d\n", menor, maior, (menor + maior)/2);
        else System.out.printf("%d %d  media: %d\n",maior, menor, (menor + maior)/2);

        //exercicio 6
        System.out.println("Insira um numero para calcular o seu fatorial: ");
        int factorial = sc.nextInt();
        System.out.printf("Factorial is %d\n", f.factorial(factorial));

        //exercicio 7
        System.out.printf("Esta máquina demora %d ns a calcular o factorial de 5000", f.tempoGasto());
    }
}