import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declaração de variáveis
        String name;        // Armazena o nome inserido pelo usuário
        int countVowels;    // Conta o número de vogais diferentes no nome
        char[] vowels = {'a', 'e', 'i', 'o', 'u'}; // Array com as vogais

        // Solicitação do nome ao usuário
        System.out.print("Por favor, digite o seu nome: ");
        name = input.nextLine();

        // Converte o nome para letras minúsculas para facilitar a comparação
        name = name.toLowerCase();

        // Inicializa a contagem de vogais
        countVowels = 0;

        // Percorre as vogais para verificar se estão presentes no nome
        for (char c : vowels) {
            // Verifica se a vogal atual está no nome
            if (name.indexOf(c) != -1) {
                countVowels++; // Incrementa a contagem se a vogal estiver presente
            }
        }

        // Exibe a mensagem com o resultado
        System.out.printf("%s possui %d vogais diferentes!%n", name, countVowels);
    }
}
