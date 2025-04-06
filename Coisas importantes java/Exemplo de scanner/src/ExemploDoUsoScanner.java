import java.util.Scanner;

public class ExemploDoUsoScanner {
    public static void main(String[] args) {
        
         // Aqui usamos "entradadedados" como nome pra indentifcar o scanner em qualquer lugar do codigo
        Scanner entradaDeDados = new Scanner(System.in);
        
        // Lê um número inteiro com o nextint
        System.out.print("Digite um número: ");
        int numero = entradaDeDados.nextInt();
        
        // Lê uma string apenas com next
        System.out.print("Digite seu nome: ");
        String nome = entradaDeDados.next();
        
        // Exibe os dados lidos
        System.out.println("Você digitou o número: " + numero);
        System.out.println("Seu nome é: " + nome);
        
        entradaDeDados.close(); // Fechar o scanner ao final, sempre fechar ao final do codigo.
    }
}
    

