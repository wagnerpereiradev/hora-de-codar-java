import java.util.Scanner;

public class Circulo{
    public static void main(String[] args){
        System.out.println("Calcular área de um círuclo");

        System.out.println("Qual a medida do raio(m)?");
        Scanner raioIn = new Scanner(System.in);
        double raio = raioIn.nextDouble();

        double area = 3.14 * (raio * raio);
        System.out.println("A área deste círculo é: " + area + "m");
    }
}