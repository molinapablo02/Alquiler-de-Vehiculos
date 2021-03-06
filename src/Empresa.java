import java.util.ArrayList;

public class Empresa {
	
	private ArrayList<VehÝculo>vehÝculos=new ArrayList<>();
	
	public ArrayList<VehÝculo> losMasRapidos(int x){
		ArrayList<VehÝculo>rapidos=new ArrayList<>();
		for(VehÝculo v:vehÝculos) {
			if(v.getVelocidadMax()>x) {
				rapidos.add(v);
			}
		}
		return rapidos;
	}
	
	public ArrayList<VehÝculo> losQueConsumenMenos(int x){
		ArrayList<VehÝculo>economicos=new ArrayList<>();
		for(VehÝculo v:vehÝculos) {
			if(v.getGasto()<x) {
				economicos.add(v);
			}
		}
		return economicos;
	}
	
	public VehÝculo elDeMayorCoeficiente() {
		VehÝculo c = vehÝculos.isEmpty()?null:vehÝculos.get(0);
		for(VehÝculo v:vehÝculos) {
			if(v.coeficienteDeEficiencia()>c.coeficienteDeEficiencia()) {
				c=v;
			}
		}
		return c;
	}
	
	public int totalDePasajeros(int x) {
		int pas=0;
		for(VehÝculo v:vehÝculos) {
			if(v.getVelocidadMax()>x) {
				pas+=v.getPasajeros();
			}
		}
		return pas;
	}
	
}
