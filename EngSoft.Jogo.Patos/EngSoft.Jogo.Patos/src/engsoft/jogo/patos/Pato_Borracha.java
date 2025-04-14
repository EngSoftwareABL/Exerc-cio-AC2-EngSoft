package engsoft.jogo.patos;

public class Pato_Borracha extends Pato { // Herança: Pato_Borracha herda de Pato
    public Pato_Borracha() {
        setComportamento(new Nao_Voa());
    }

    public String mostrar() { // Polimorfismo: cada tipo de pato pode ter seu próprio comportamento
        return "Ol�, eu sou de Borracha.";
    }
}
