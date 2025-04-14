package engsoft.jogo.patos;

public class Pato_Bravo extends Pato implements Padrao_Grasnar { // Herança: Pato_Bravo herda de Pato e implementa a interface Padrao_Grasnar

    public Pato_Bravo() {
        setComportamento(new Voaveis_Asa()); // Composição: comportamento de voo atribuído através de setComportamento, que pode ser alterado dinamicamente.
    }

    public String mostrar() { // Polimorfismo: cada tipo de pato pode ter um comportamento de mostrar diferente
        return "Eu sou o Pato Bravo.";
    }

    public String grasnar() { 
        return "Que-Que. Grrrrrrrrr.";
    }
}
