
import java.util.Scanner;

public class CalculadorDeMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // CRIANDO UMA LISTA DE ALUNOS 
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};
        // CHAMANDO O MÉTODO PARA CALCULAR A MEDIA 
        int media = calculaMediaDaTurma(alunos, scan);

        System.out.println("Média da turma %d " + media);
    }
    public static int calculaMediaDaTurma(String[] alunos, Scanner scanner){
        int soma = 0;
        // criando uma variavel aluno para rodar todos os alunos da lista
        for(String aluno : alunos){
            System.out.println("Nota do aluno %5: " + aluno);
            int nota = scanner.nextInt();
            soma += nota;
        }
        return soma / alunos.length;

    }
}