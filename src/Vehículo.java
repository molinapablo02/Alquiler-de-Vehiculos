public abstract class Veh�culo {
	
	private String marca;
	private String modelo;
	private String a�oDeFabricaci�n;
	
	public abstract int getGasto();
	
	public abstract float getVelocidadMax();
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getA�oDeFabricaci�n() {
		return a�oDeFabricaci�n;
	}
	public void setA�oDeFabricaci�n(String a�oDeFabricaci�n) {
		this.a�oDeFabricaci�n = a�oDeFabricaci�n;
	}

	protected abstract int getPasajeros();
	
	public float coeficienteDeEficiencia() {
		return(this.getPasajeros()*this.getVelocidadMax())/this.getGasto();
	}
	
}
