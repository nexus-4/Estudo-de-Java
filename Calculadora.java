import java.util.Scanner;
public class Calculadora {
    double numero1;
    double numero2;
    char operacao;
    double resultado;
    public Calculadora(){
        //metodo para iniciar a calculadora
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void setOperacao(char operacao) {
        this.operacao = operacao;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    public void Calcular(){
        if ('+' == operacao){
            resultado = numero1 + numero2;
        }else if ('-' == operacao){
            resultado = numero1 - numero2;
        } else if ('*' == operacao) {
            resultado = numero1 * numero2;
        } else if ('/' == operacao) {
            if (numero2 != 0){
                resultado = numero1 / numero2;
            }else{
                System.out.println("ERRO! DIVISAO POR ZERO.");
            }

        }
    }
    public void Limpar(){
        numero1 = 0;
        numero2 = 0;
        operacao = '=';
        resultado = 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculadora minhaCalculadora = new Calculadora();

        while (true) {
            System.out.print("--> ");
            double numero1 = input.nextDouble();
            minhaCalculadora.setNumero1(numero1);

            System.out.println("Digite o operador (+, -, *, /) ou 'c' para limpar:");
            char operacao = input.next().charAt(0);

            if (operacao == 'c') {
                minhaCalculadora.Limpar();
                continue;
            }

            minhaCalculadora.setOperacao(operacao);

            System.out.print("-->");
            double numero2 = input.nextDouble();
            minhaCalculadora.setNumero2(numero2);

            minhaCalculadora.Calcular();

            System.out.println("Resultado: " + minhaCalculadora.resultado);
        }


    }
}
