package triangulo;
import java.util.Scanner;
public class Triangulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Primeiro lado: ");
        double a = sc.nextDouble();
        System.out.print("Segundo lado: ");
        double b = sc.nextDouble();
        System.out.print("Terceiro lado: ");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero");
            } 
            else if (a == b || a == c || b == c) {
                System.out.println("Triângulo Isósceles");
            } 
            else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Os valores não formam um triângulo.");
        }
    }
}