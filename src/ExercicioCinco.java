import java.util.Scanner;
public class ExercicioCinco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String str = sc.nextLine();
        sc.close();

        char[] caracteres = str.toCharArray();
        int tamanho = caracteres.length;

        for (int i = 0; i < tamanho / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[tamanho - 1 - i];
            caracteres[tamanho - 1 - i] = temp;
        }

        System.out.print("String invertida: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(caracteres[i]);
        }
    }
}
