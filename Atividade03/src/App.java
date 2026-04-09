import java.util.Scanner;

public class App {
    static boolean parOuImpar(int a){
        if(a % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int valor = entrada.nextInt();

        if (parOuImpar(valor) == true) {
            System.out.println(valor + " é par!");
        } else {
            System.out.println(valor + " é impar!");
        }
    }
}
