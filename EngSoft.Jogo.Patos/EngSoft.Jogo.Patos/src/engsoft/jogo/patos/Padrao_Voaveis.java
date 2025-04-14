package engsoft.jogo.patos;

public interface Padrao_Voaveis { // Abstração: define um contrato para o comportamento de voar

	String voar(); // Polimorfismo: classes que implementarem essa interface podem definir diferentes formas de voar

	double getVelocidade(); // Abstração: qualquer classe que implementa a interface deve retornar a velocidade, mas sem precisar se preocupar com a implementação dos detalhes
}
