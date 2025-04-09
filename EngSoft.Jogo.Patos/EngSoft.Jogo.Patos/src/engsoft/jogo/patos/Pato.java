package engsoft.jogo.patos;

public abstract class Pato {
	
	protected Padrao_Voaveis comportamento_pato;

	abstract String mostrar(); 
	//atividade 1 - explicações: (inexperiente comente e experiente revisa)
	
	//atividade 2: fazer o pato pular (ainda em java) - eu faço   

	//atividade 3: fazer o pato dançar - eles fazem

	//atividade 4: trocar a linguagem em 100min
	
	public String nadar()
	{
		return "Pato Nadando.";		
	}	
	
	public void setComportamento(Padrao_Voaveis padrao )
	{
		comportamento_pato = padrao;		
	}
	
	public String comportamento_pato()
	{		
		return comportamento_pato.voar();		
	}
}
