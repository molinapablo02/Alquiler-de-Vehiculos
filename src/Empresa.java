import java.util.ArrayList;

public class Empresa {
	
	private ArrayList<Veh�culo>veh�culos=new ArrayList<>();
	
	public ArrayList<Veh�culo> losMasRapidos(int x){
		ArrayList<Veh�culo>rapidos=new ArrayList<>();
		for(Veh�culo v:veh�culos) {
			if(v.getVelocidadMax()>x) {
				rapidos.add(v);
			}
		}
		return rapidos;
	}
	
	public ArrayList<Veh�culo> losQueConsumenMenos(int x){
		ArrayList<Veh�culo>economicos=new ArrayList<>();
		for(Veh�culo v:veh�culos) {
			if(v.getGasto()<x) {
				economicos.add(v);
			}
		}
		return economicos;
	}
	
	public Veh�culo elDeMayorCoeficiente() {
		Veh�culo c = veh�culos.isEmpty()?null:veh�culos.get(0);
		for(Veh�culo v:veh�culos) {
			if(v.coeficienteDeEficiencia()>c.coeficienteDeEficiencia()) {
				c=v;
			}
		}
		return c;
	}
	
	public int totalDePasajeros(int x) {
		int pas=0;
		for(Veh�culo v:veh�culos) {
			if(v.getVelocidadMax()>x) {
				pas+=v.getPasajeros();
			}
		}
		return pas;
	}
	
}
