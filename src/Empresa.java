import java.util.ArrayList;

public class Empresa {
	
	private ArrayList<Vehículo>vehículos=new ArrayList<>();
	
	public ArrayList<Vehículo> losMasRapidos(int x){
		ArrayList<Vehículo>rapidos=new ArrayList<>();
		for(Vehículo v:vehículos) {
			if(v.getVelocidadMax()>x) {
				rapidos.add(v);
			}
		}
		return rapidos;
	}
	
	public ArrayList<Vehículo> losQueConsumenMenos(int x){
		ArrayList<Vehículo>economicos=new ArrayList<>();
		for(Vehículo v:vehículos) {
			if(v.getGasto()<x) {
				economicos.add(v);
			}
		}
		return economicos;
	}
	
	public Vehículo elDeMayorCoeficiente() {
		Vehículo c = vehículos.isEmpty()?null:vehículos.get(0);
		for(Vehículo v:vehículos) {
			if(v.coeficienteDeEficiencia()>c.coeficienteDeEficiencia()) {
				c=v;
			}
		}
		return c;
	}
	
	public int totalDePasajeros(int x) {
		int pas=0;
		for(Vehículo v:vehículos) {
			if(v.getVelocidadMax()>x) {
				pas+=v.getPasajeros();
			}
		}
		return pas;
	}
	
}
