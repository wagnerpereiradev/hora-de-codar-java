import java.util.Scanner;

public class Quadrado{
    public static void main(String[] args){
        System.out.println("Calcular a área de um quadrado");

        System.out.println("Digite o lado do quadrado(m)");
        Scanner ladoIn = new Scanner(System.in);
        double lado = ladoIn.nextDouble();

        double area = lado * lado;
        System.out.println("A área deste quadrado é: " + area + "m");
    }
}