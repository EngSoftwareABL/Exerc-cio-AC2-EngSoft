package engsoft.jogo.patos;

public abstract class Pato { // Classe abstrata, não pode ser instanciada diretamente, serve como base para outras classes

    protected Padrao_Voaveis comportamento_pato; // Composição: o comportamento de voo é representado pela interface Padrao_Voaveis

    abstract String mostrar(); // Polimorfismo: cada tipo de pato terá uma implementação diferente para mostrar a sua identidade

    public String nadar() { // Encapsulamento: o comportamento de nadar é padronizado aqui, e não precisa ser redefinido em subclasses
        return "Pato Nadando."; 
    }

    public void setComportamento(Padrao_Voaveis padrao) { // Composição: o pato pode mudar seu comportamento de voo dinamicamente
        comportamento_pato = padrao;
    }

    public String comportamento_pato() { // Polimorfismo: o comportamento de voo será diferente dependendo do comportamento definido
        return comportamento_pato.voar(); 
    }
}

