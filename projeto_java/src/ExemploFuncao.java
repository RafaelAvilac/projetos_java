
import  java.util.Scanner;
public class ExemploFuncao {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int maior;
        System.out.println("Digíte três números: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        maior = max(a,b,c);
        mostrarResultado(maior);
    sc.close();
    }
    public static int max(int a, int b, int c){
        int auxiliar;
        if(a>=b && a>=c){
            auxiliar = a;
        } else if(b>=a && b>=c){
            auxiliar = b;
        } else{
            auxiliar = c;
        }
        return auxiliar;
    }
    public static void mostrarResultado(int resultado){
        System.out.println("Resultado: " + resultado);
    }
}
