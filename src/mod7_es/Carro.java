package mod7_es;

public class Carro extends Veiculo{

    public Carro(String id)
       {
             IDVeiculo = id;
       }

       @Override
       public Veiculo clone() throws CloneNotSupportedException
       {
             return (Carro)super.clone();
       }

}
