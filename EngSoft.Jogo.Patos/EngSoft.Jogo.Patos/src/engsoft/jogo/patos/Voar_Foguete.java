package engsoft.jogo.patos;

public class Voar_Foguete implements Padrao_Voaveis { // Implementação da interface Padrao_Voaveis para definir um comportamento de voo específico

    private double velocidade; // Encapsulamento: a velocidade está escondida dentro da classe e só pode ser acessada por métodos

    public Voar_Foguete() {
        velocidade = 1000; 
    }

    public String voar() { // Polimorfismo: define uma implementação específica de voar para o foguete
        return "Voando como um foguete. Velocidade: " + getVelocidade();
    }

    public double getVelocidade() { // Abstração: o cálculo da velocidade está encapsulado neste método
        return velocidade; 
    }
}

