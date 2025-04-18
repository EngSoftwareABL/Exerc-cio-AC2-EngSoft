package engsoft.jogo.patos;

public class Main {

	public static void main(String[] args) {
		Pato pt = new Pato_Ruivo();		
		
		System.out.println(pt.mostrar());
		System.out.println(pt.nadar());
		System.out.println(pt.acao_pato()); //Ativ2: Execução da Ação
		System.out.println(pt.comportamento_pato());
				
		pt.setComportamento(new Voar_Foguete());
		
		System.out.println(pt.comportamento_pato());
		
		pt.setComportamento(new Voar_Raso());
		
		System.out.println(pt.comportamento_pato());

		pt.setAcao(new Acao_Dancar());
		System.out.println(pt.acao_pato()); //Ativ2 : Execução da ação dançar
		
		
	}

}
