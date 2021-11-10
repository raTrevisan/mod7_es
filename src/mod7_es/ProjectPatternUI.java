package mod7_es;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class ProjectPatternUI {

    private static final Map<String,Veiculo> mapa  = new HashMap<String,Veiculo>();

    ProjectPatternUI(Veiculo A, Veiculo B, Veiculo C){
		mapa.put("1",A);
		mapa.put("2",B);
		mapa.put("3",C);
    }


    @SuppressWarnings("resource")
	public void exibeInterface() throws CloneNotSupportedException{
        do
        {
            System.out.println("Qual Veiculo deve ser instânciado?\n1 - Avião\n2 - Barco\n3 - Carro\n4 - Sair");
            Scanner input = new Scanner(System.in);
            String in = input.next();
            //System.out.println(in);

            if(in.equals("4")){
                input.close();
            	break;
            }
            if(mapa.containsKey(in)){
            	Veiculo copia = mapa.get(in).clone();
                    System.out.println("Insira o preco do novo veículo");
                    int p = input.nextInt();
                copia.setPreco(p);
            }
            else {
                System.out.println("Erro");
            }
                        
        }while(true);
      
    }
}
