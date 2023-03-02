import java.util.Scanner;

//Espero conseguir a oportunidade :)
public class ExercicioDois {

    public static void main(String[] args) {

        int num1 = 0, num2 = 1, proximoNum = 0;
        boolean pertence = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = input.nextInt();

        if (numero == num1 || numero == num2) {
            pertence = true;
        } else {
            while (proximoNum <= numero) {
                proximoNum = num1 + num2;
                if (proximoNum == numero) {
                    pertence = true;
                    break;
                }
                num1 = num2;
                num2 = proximoNum;
            }
        }

        if (pertence) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }
}