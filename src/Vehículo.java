public abstract class Vehículo {
	
	private String marca;
	private String modelo;
	private String añoDeFabricación;
	
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
	public String getAñoDeFabricación() {
		return añoDeFabricación;
	}
	public void setAñoDeFabricación(String añoDeFabricación) {
		this.añoDeFabricación = añoDeFabricación;
	}

	protected abstract int getPasajeros();
	
	public float coeficienteDeEficiencia() {
		return(this.getPasajeros()*this.getVelocidadMax())/this.getGasto();
	}
	
}
