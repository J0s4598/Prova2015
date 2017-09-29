
import java.util.ArrayList;

public class BDSimulado {

	//atributo
	private ArrayList<ONG> ongs;
	private ArrayList<Posto> posto;
	
	//metodo construtor	
	public BDSimulado(){
		
		//criar a lista de ONGs
		this.ongs = new ArrayList<ONG>();
		
		//Preencher a lista de ONGs
		ONG o1 = new ONG("Life", "Josué", "GO");
		ONG o2 = new ONG("Hack", "Marcos", "DF");
		ONG o3 = new ONG("Good", "Alberto", "MG");
		ONG o4 = new ONG("Vida", "Gabriel", "SP");
		ONG o5 = new ONG("Mars", "Caio", "DF");
		
		this.ongs.add(o1);
		this.ongs.add(o2);
		this.ongs.add(o3);
		this.ongs.add(o4);
		this.ongs.add(o5);
		
		//criar a lista Posto
		this.posto = new ArrayList<Posto>();
		
		//Preencher a lista de Postos
		Posto p1 = new Posto(1, 100, false, false, false);
		Posto p2 = new Posto(234, 2345.76, true, true, true);
		Posto p3 = new Posto(678, 2378, false, false, true);
		Posto p4 = new Posto(122, 123, true, true, false);
		Posto p5 = new Posto(987, 987, false, true, true);
		Posto p6 = new Posto(456, 785452, false, false, false);
		
		//Informar a ONG dos Postos
		p1.setOng(o1);
		p2.setOng(o2);
		p3.setOng(o3);
		p4.setOng(o4);
		p5.setOng(o5);
		p6.setOng(o1);
		
		this.posto.add(p1);
		this.posto.add(p2);
		this.posto.add(p3);
		this.posto.add(p4);
		this.posto.add(p5);
		this.posto.add(p6);				
	}
	
    //Get e Set
	public ArrayList<ONG> getOngs() {
		return ongs;
	}
	public ArrayList<Posto> getPosto() {
		return posto;
	}
	
	/*//Nome
	public ArrayList<ONG> getInfoONG(String nomeONG){
		ArrayList<ONG> resultado = new ArrayList<ONG>();
		
		for (int i = 0; i < this.ongs.size(); i++) {
			if (this.ongs.get(i).getNome() == nomeONG) {
				resultado.add(this.ongs.get(i));
				
			}
			
		}
		return resultado;
	}*/
	
	//Metodo que retorna info da ONG de acordo co o nome
	 public String getInfoONG(String nomeONG){
		 String resultado = "";
		 
		 //percorrer a lista de ONGs buscando pelo nome
		 for (int i = 0; i < this.ongs.size(); i++) {
			 if (this.ongs.get(i).getNome().equals(nomeONG)) {
				 resultado = "Nome: " + this.ongs.get(i).getNome() + "\n" + 
						 	"Responsavel: " + this.ongs.get(i).getResponsavel() + "\n" + 
						 	"Estado: " + this.ongs.get(i).getEstado();
				
			}
			
		}
		 return resultado;
	 }
	
	//metodo que retorna o num de ongs por estado
	 public int getNumONGPorEstado(String estado){
		 int resultado = 0;
		 
		 //percorrer a lista de ONGs
		 for (int i = 0; i < this.ongs.size(); i++) {
			 if (this.ongs.get(i).getEstado().equals(estado)) {
				 resultado ++ ;
				
			}
			
		}
		 return resultado;
	 }
	
	
	//Metodo que retorna lista de postop por capacidade
	 public ArrayList<Posto> getPostosPorCapacidade(int x){
		 ArrayList<Posto> resultado = new ArrayList<Posto>();
		 
		 //Percorrer a lista de Postos
		 for (int i = 0; i < this.posto.size(); i++) {
			 if (this.posto.get(i).getCapacidade() > x) {
				 resultado.add(this.posto.get(i));
				
			}
			
		}
		 return resultado;
	 }
	 
	 //Metodo que retorna o codigo do posto Vegetariano
	 public ArrayList<Integer> getPostosVegetarianos(){
		 ArrayList<Integer> resultado = new ArrayList<Integer>();
		 
		 //Pecorrer a lista de Posto
		 for (int i = 0; i < this.posto.size(); i++) {
			 if (this.posto.get(i).isVegetariano()) {
				 resultado.add(this.posto.get(i).getCodigo());
			}
			
		}
		 return resultado;
	 }
	 
	 //Metodo que retorna o nome da ONG que vai atender a caravana por numero de pessoas
	 public String getONGQueAtende(int qtdePessoa){
		 String resultado = "";
		 
		 double qtdeComida = qtdePessoa * 0.5;
		 
		 //percorre a lista de postos
		 for (int i = 0; i < this.posto.size(); i++) {
			 if (this.posto.get(i).getCapacidade() >= qtdeComida) {
				resultado = this.posto.get(i).getOng().getNome();
			}
			
		}
		 return resultado;
	 }
	 
	 //metodo 
	 public String getONGQuePorSexo (int qtdeMascu, int qtdeFemi, int qtdeCrian){
		 String resultado = "";
		 double qtdeC1 = qtdeMascu * 0.5;
		 double qtdeC2 = qtdeFemi * 0.3;
		 double qtdeC3 = qtdeCrian * 0.15;
		 double qtdeComida = (qtdeC1) + (qtdeC2) + (qtdeC3);
		 
		 //
		 for (int i = 0; i < this.posto.size(); i++) {
			if (this.posto.get(i).getCapacidade() >= qtdeComida) {
				resultado = this.posto.get(i).getOng().getNome();
			}
		}
		 return resultado;
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	

}
