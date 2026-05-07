public class Paciente {
    String nome;
    int idade;

    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
}