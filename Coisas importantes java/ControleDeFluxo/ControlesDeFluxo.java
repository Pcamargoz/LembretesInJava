public class ControlesDeFluxo {
    public static void main(String[] args) {

        // IF / ELSE IF / ELSE
        int idade = 18;
        if (idade < 18) {
            System.out.println("Menor de idade");
        } else if (idade == 18) {
            System.out.println("Tem 18 anos");
        } else {
            System.out.println("Maior de idade");
        }

        // SWITCH (usado para múltiplos casos)
        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            default:
                System.out.println("Outro dia");
        }

        // WHILE (repete enquanto a condição for verdadeira)
        int contador = 0;
        while (contador < 3) {
            System.out.println("WHILE contador = " + contador);
            contador++;
        }

        // DO WHILE (executa pelo menos uma vez)
        int numero = 0;
        do {
            System.out.println("DO WHILE número = " + numero);
            numero++;
        } while (numero < 3);

        // FOR (estrutura de repetição com inicialização, condição e incremento)
        for (int i = 0; i < 3; i++) {
            System.out.println("FOR i = " + i);
        }

        // FOREACH (usado para percorrer arrays ou coleções)
        String[] frutas = {"Maçã", "Banana", "Laranja"};
        for (String fruta : frutas) {
            System.out.println("FOREACH fruta = " + fruta);
        }

        // BREAK (interrompe um laço)
        for (int i = 0; i < 10; i++) {
            if (i == 5) break; // Para quando i for igual a 5
            System.out.println("BREAK i = " + i);
        }

        // CONTINUE (pula para a próxima iteração)
        for (int i = 0; i < 5; i++) {
            if (i == 2) continue; // Pula o valor 2
            System.out.println("CONTINUE i = " + i);
        }
    }
}