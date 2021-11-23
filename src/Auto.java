public class Auto extends Vehículo {
	
	private int pasajeros;
	private float velocidadMax;
	
	public void setVelocidadMax(float velocidadMax) {
		this.velocidadMax=velocidadMax;
	}
	
	public void setPasajeros(int pasajeros) {
		this.pasajeros=pasajeros;
	}

	public int getPasajeros() {
		return pasajeros;
	}

	public float getVelocidadMax() {
		return velocidadMax;
	}
	
	public int getGasto() {
		return 20+(getPasajeros()*10);
	}
	
}
