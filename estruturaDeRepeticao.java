import javax.swing.JOptionPane;
public class Main {
    public static void main (String[] args) {

        //Declaracao de variavel e array
        int initialNumber = 0;
        int sumNumber = 0;
        boolean loop = true;

        //Em loop ate o usuario colocar o valor correto
        while (loop) {
            initialNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha um numero positivo: "));
            if (initialNumber > 0) {
                break;
            }
        }
        //percorrer os numeros positivos ate o valor do usuario
        for (int i = 1; i <= initialNumber; i++) {
            sumNumber += i; //soma dos numeros
        }
        String formattedResults = String.format("A soma dos numeros de 1 ate %d é igual a %d", initialNumber, sumNumber);
        JOptionPane.showMessageDialog(null, formattedResults);
    }
}
