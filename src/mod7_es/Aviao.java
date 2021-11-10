package mod7_es;

public class Aviao extends Veiculo{

    public Aviao(String id)
       {
             IDVeiculo = id;
       }

       @Override
       public Veiculo clone() throws CloneNotSupportedException
       {
             return (Aviao)super.clone();
       }

}
