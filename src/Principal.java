import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		BDSimulado bd = new BDSimulado();
		
		//Imprimir
		System.out.println(bd.getInfoONG("Life"));
		System.out.println(bd.getNumONGPorEstado("DF"));
		/*System.out.println(bd.getPostosPorCapacidade(100));*/
		System.out.println(bd.getPostosVegetarianos());
		System.out.println(bd.getONGQueAtende(500));
		System.out.println(bd.getONGQuePorSexo(100, 100, 50));
		
		
		//Imprimi capacidade com o codigo so
		ArrayList<Posto> postoPorCapacidade = bd.getPostosPorCapacidade(191615);
		for (int i = 0; i < postoPorCapacidade.size(); i++) {
			System.out.println(postoPorCapacidade.get(i).getCodigo());
		}
		

	}

}
