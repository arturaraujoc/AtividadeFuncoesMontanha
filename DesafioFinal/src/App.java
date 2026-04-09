import java.util.Scanner;

public class App {
    static double calcularIMC(double peso, double altura){
        return peso/(altura*altura);
    }
    static String classificarIMC(double imc){
        if(imc<17){
            return "Muito abaixo do ideal";
        }
        if(imc>=17 && imc<=18.49){
            return "Abaixo do peso ideal";
        }
        if(imc>=18.5 && imc<=24.99){
            return "Peso normal";
        }
        if(imc>=25 && imc<=29.99){
            return "Acima do peso ideal";
        }
        if(imc>=30 && imc<=34.99){
            return "Obesidade grau 1";
        }
        if(imc>=35 && imc<=39.99){
            return "Obesidade grau 2";
        }
        if(imc>=40){
            return "Obesidade grau 3 (mórbida)";
        }

        return "Valor invalido!";
    }
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("iNFORME PESO(KG): ");
        double kg = entrada.nextDouble();
        System.out.print("INFORME ALTURA(M): ");
        double metros = entrada.nextDouble();

        double imcbase = calcularIMC(kg, metros);
        
        String resultado = classificarIMC(imcbase);

        System.out.println(resultado);
    }
}
