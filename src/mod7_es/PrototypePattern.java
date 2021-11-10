package mod7_es;

public class PrototypePattern {

    public static void main(String args[]) throws CloneNotSupportedException{

        System.out.println("Exemplo do padrão Prototipo");
        Veiculo aviao = new Aviao("A1");
        Veiculo barco = new Barco("B2");
        Veiculo carro = new Carro("C3");

        ProjectPatternUI ui = new ProjectPatternUI(aviao,barco,carro);
        ui.exibeInterface();
    }

}