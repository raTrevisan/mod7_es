package mod7_es;

public class Barco extends Veiculo{

    public Barco(String id)
       {
             IDVeiculo = id;
       }

       @Override
       public Veiculo clone() throws CloneNotSupportedException
       {
             return (Barco)super.clone();
       }

}
