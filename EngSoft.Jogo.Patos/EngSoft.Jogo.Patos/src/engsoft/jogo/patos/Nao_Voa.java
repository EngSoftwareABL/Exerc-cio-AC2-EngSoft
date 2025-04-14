package engsoft.jogo.patos;

public class Nao_Voa implements Padrao_Voaveis { // Herança por interface

	public Nao_Voa() { // Encapsulamento: toda lógica de inicialização da classe fica aqui
	}
	
	public String voar() { // Polimorfismo: essa é uma forma de implementar o método voar
		return "Esse pato não Voa. Velocidade: " + getVelocidade(); 
	}

	public double getVelocidade() { // Encapsulamento: o valor da velocidade é controlado pela própria classe
		return 0; // Abstração: o usuário só sabe o resultado, não como é calculado
	}
}

