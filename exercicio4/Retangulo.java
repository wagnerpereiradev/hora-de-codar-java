import java.util.Scanner;

public class Retangulo{
    public static void main(String[] args){
        System.out.println("Calcular a área do retângulo");

        System.out.println("Digite a base do retângulo(m)");
        Scanner baseIn = new Scanner(System.in);
        double base = baseIn.nextDouble();

        System.out.println("Digite a altura do retângulo(m)");
        Scanner alturaIn = new Scanner(System.in);
        double altura = alturaIn.nextDouble();

        double area = base * altura;
        System.out.println("A área deste retângulo é: " + area + "m");
    }
}