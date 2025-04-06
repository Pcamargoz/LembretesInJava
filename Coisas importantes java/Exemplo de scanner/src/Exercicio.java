import java.util.Scanner;
public class Exercicio {
    public static void main(String[] args) {
        // abrindo o scanner 
        Scanner Ler = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = Ler.nextInt();
        // chamando o método para ver a variavel e fazer o trabalho 
        VerificadorIdade(idade);
        // fechando o scanner 
        Ler.close();
        
    }
    // criando o metodo , o int idade e um parametro criado apenas de exemplo; 
    static void VerificadorIdade(int idade) {
        // fazendo o if 
        if(idade >= 18){
            System.out.println("Você e maior de idade!!!");
            // Usando o for, ele nao para enquanto for menor que a idade
            for(int i = 0; i < idade; i++){
                // somando mais um para a conta dar certo no final e bater com o numero
                System.out.println(i + 1);  
            }
        }else{
            System.out.println("Você e menor de idade");
        }
    }
}


