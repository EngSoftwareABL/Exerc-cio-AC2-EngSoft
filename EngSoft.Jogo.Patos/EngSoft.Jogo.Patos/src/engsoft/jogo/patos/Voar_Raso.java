package engsoft.jogo.patos;

public class Voar_Raso implements Padrao_Voaveis { // Implementação da interface Padrao_Voaveis, definindo um comportamento específico de voo baixo

    private double velocidade; // Encapsulamento: a velocidade é mantida interna à classe e só pode ser acessada ou modificada por métodos

    public Voar_Raso() {
        velocidade = 100; // Atribui um valor fixo de 100 para a velocidade do voo raso
    }

    @Override
    public String voar() { // Polimorfismo: a classe Voar_Raso implementa o método voar de forma específica para voo baixo
        return "Voando perto do ch�o. Velocidade: " + getVelocidade(); 
    }

    @Override
    public double getVelocidade() { // Abstração: o cálculo da velocidade está oculto dentro deste método
        return velocidade; 
    }
}

