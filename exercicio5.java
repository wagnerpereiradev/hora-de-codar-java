//Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou zero.
import java.util.Scanner;

public class exercicio5{
    public static void main(String[] args){
        System.out.println("Digite um número");
        Scanner numIn = new Scanner(System.in);
        double num = numIn.nextDouble();

        if(num > 0){
            System.out.println("O número é positivo");
        } else if(num < 0){
            System.out.println("O número é negativo");
        } else {
            System.out.println("O número é 0");
        }
    }
}