public class Moto extends Vehículo {
	
	private int cilindrada;
	
	public int getRodado() {
		return cilindrada;
	}

	public void setRodado(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	public int getPasajeros() {
		if(cilindrada<=75) {
			return 1;
		}
		else {
			return 2;
		}
	}
	
	public int getGasto() {
		return 50+(cilindrada/10);
	}
	
	public float getVelocidadMax() {
		return 50+(cilindrada/2f);
	}
	
	
	
}
