public class Animal { //inicio da classe Animal
    //atributos
    private String nome;
    private float comprimento;
    private int numero_de_patas;
    private String cor;

    public Animal(String nome, float comprimento, int numero_de_patas, String cor) { //
        this.nome = nome;
        this.comprimento = comprimento;
        this.numero_de_patas = numero_de_patas;
        this.cor = cor;
    }

    // setters e getters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public void setNumero_de_patas(int numero_de_patas) {
        this.numero_de_patas = numero_de_patas;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public float getComprimento() {
        return comprimento;
    }

    public int getNumero_de_patas() {
        return numero_de_patas;
    }

    public String getCor() {
        return cor;
    }
}

class Peixe extends Animal {
    private String caracteristica;

    public Peixe(String nome, float comprimento, int numero_de_patas, String cor, String caracteristica) {
        super(nome, comprimento, numero_de_patas, cor);
        this.caracteristica = caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return caracteristica;
    }
}

class TestarAnimais {
    public static void main(String[] args) {
        Peixe Tubarao = new Peixe("Tubarão", 300, 0, "Cinzento", "Barbatanas e cauda");
        //printando
        System.out.println("Nome ---> " + Tubarao.getNome());
        System.out.println("Cor  ---> " + Tubarao.getCor());
        System.out.println("Caracteristicas ---> " + Tubarao.getCaracteristica());
    }
}
