package reto0;

public class alarma {

	private String fecha;
	private int piso;
		
	
	
	
	@Override
	public String toString() {
		return "alarma [fecha=" + fecha + ", piso=" + piso + "]";
	}

	public alarma(String fecha, int piso) {
		this.fecha = fecha;
		this.piso = piso;
	}
	
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	
	
}
