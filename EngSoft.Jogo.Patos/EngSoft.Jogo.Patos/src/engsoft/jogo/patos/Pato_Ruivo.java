package engsoft.jogo.patos;

public class Pato_Ruivo extends Pato implements Padrao_Grasnar { // Herança: Pato_Ruivo herda de Pato e implementa a interface Padrao_Grasnar

    public Pato_Ruivo() {
        setComportamento(new Voaveis_Asa()); // Composição: comportamento de voo atribuído através de setComportamento, que pode ser alterado dinamicamente.
        setAcao(new Acao_Pular()); //Ativ2: Alterações para o Pato Pular
        
    }

    public String mostrar() { // Polimorfismo: cada tipo de pato pode ter um comportamento de mostrar diferente
        return "Eu sou o Pato Ruivo."; 
    }

    public String grasnar() { // A classe implementa o comportamento de grasnar
        return "Que-Que."; 
    }
}

