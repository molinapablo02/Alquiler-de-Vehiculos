public class Bicicleta extends Vehículo {
	
	private int rodado;
	
	public int getRodado() {
		return rodado;
	}

	public void setRodado(int rodado) {
		this.rodado = rodado;
	}
	
		
	public int getPasajeros() {
		return 1;
	}
	
	public int getGasto() {
		return 1;
	}
	
	public float getVelocidadMax() {
		return this.rodado*1.2f;
	}
	
}
