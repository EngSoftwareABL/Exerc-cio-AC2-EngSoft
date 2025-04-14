package engsoft.jogo.patos;

public class Voaveis_Asa implements Padrao_Voaveis { // Implementação da interface Padrao_Voaveis, definindo um comportamento específico de voo com asas

    private double velocidade; // Encapsulamento: a velocidade do voo está oculta dentro da classe e só pode ser acessada ou modificada por métodos

    public Voaveis_Asa() {
        velocidade = 10; 
    }

    @Override
    public String voar() { // Polimorfismo: a classe Voaveis_Asa implementa o método voar de forma específica para voo com asas
        return "Voando como um p�ssaro que voa. Velocidade: " + getVelocidade(); 
    }

    @Override
    public double getVelocidade() { // Abstração: o cálculo da velocidade está oculto dentro deste método
        return velocidade;
    }
}
