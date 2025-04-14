package engsoft.jogo.patos;

/**
 * Classe de Apito que pode efetuar um grasno
 * Implementação da Interface
 */
public class Apito implements Padrao_Grasnar { // Implementação da interface Padrao_Grasnar para o comportamento de grasno

    @Override
    public String grasnar() { // Polimorfismo: o método grasnar tem um comportamento específico para a classe Apito
        return "Queeeeee"; 
    }
}
