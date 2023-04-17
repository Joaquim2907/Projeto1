package atividade.pkg1;
import java.util.Scanner;
public class Atividade1 {
    public static void main(String[] args) {
        int a;
        int b;
        int soma;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
         a = input.nextInt();
        System.out.println("Digite o segundo número:");
        b = input.nextInt();
        soma = a+b;
        System.out.println("O resultado da soma é:"+soma);
        
      
    }
    
}
