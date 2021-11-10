package mod7_es;

abstract public class Veiculo implements Cloneable {

    public String IDVeiculo;
    public int precoConstrucao;

    public String getNomeVeiculo(){
        return this.IDVeiculo;
    }

    public int getPrecoConstrucao(){
        return this.precoConstrucao;
    }

    public void setPreco(int preco){
       this.precoConstrucao = preco;
    }

    public Veiculo clone() throws CloneNotSupportedException{
        return (Veiculo)super.clone();
    }

}
