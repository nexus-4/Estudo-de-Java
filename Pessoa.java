// Por Antonio Gleyser
// Inicio da classe Principal Pessoa
public class Pessoa {

    // Atributos privados
    private String nome;
    private String endereco;
    private String idade;

    // Construtor da classe Pessoa
    public Pessoa(String nome, String endereco, String idade) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
    }

    // Metodos para definir e obter (getters e setters)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getIdade() {
        return idade;
    }

    // Metodo para imprimir os dados da pessoa
    void ImprimeDadosPessoa(){
        System.out.println("DADOS DA PESSOA ");
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Idade: " + getIdade());
    }
    // Classe aninhada Funcionario que Herda da classe Pessoa
    public static class Funcionario extends Pessoa {

        // Atributos adicionais
        private float salario;
        private String cargo;

        // Construtor da classe Funcionario
        public Funcionario(String nome, String endereco, String idade, float salario, String cargo) {
            super(nome, endereco, idade);
            this.cargo = cargo;
            this.salario = salario;
        }

        // Metodos Getters e Setters para Cargo e Salario
        public float getSalario() {
            return salario;
        }
        public String getCargo() {
            return cargo;
        }
        public void setSalario(float salario) {
            this.salario = salario;
        }

        public void setCargo(String cargo) {
            this.cargo = cargo;
        }

        // Metodo para imprimir os dados do funcionario
        void ImprimeDadosFuncionario(){
            System.out.println("DADOS DO FUNCIONARIO ");
            System.out.println("Nome: " + getNome());
            System.out.println("Endereço: " + getEndereco());
            System.out.println("Idade: " + getIdade());
            System.out.println("Salario: " + getSalario());
            System.out.println("Cargo: " + getCargo());
        }

        // Metodo para imprimir o salario do funcionario
        void ObterSalario(){
            System.out.printf("SALARIO DO FUNCIONARIO: %.2f ", getSalario());
        }

    }

    // Metodo main
    public static void main(String[] args) {

        // Criacao de instancias de Pessoa e Funcionario
        Pessoa pessoa1 = new Pessoa("Gleyser", "Rua milton aguiar", "23 anos");
        Funcionario funcionario1 = new Funcionario(pessoa1.nome, pessoa1.endereco, pessoa1.idade, 30000,"CEO absoluto Master");

        // Impressao dos dados da pessoa e do funcionario
        pessoa1.ImprimeDadosPessoa();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
        funcionario1.ObterSalario();
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=");
        funcionario1.ImprimeDadosFuncionario();
    }

}

