public class App {
    static int maiorMenor(int a, int b){
        if(a > b){
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) throws Exception {
        int maior = maiorMenor(40,30);
        System.out.println("O maior valor é: " + maior);
    }
}
