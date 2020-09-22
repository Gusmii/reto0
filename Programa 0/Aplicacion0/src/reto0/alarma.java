package reto0;

public class alarma {

	private String fecha;
	private int piso;
	private Boolean estado;
		
	
	
	
	@Override
	public String toString() {
		return "alarma [fecha=" + fecha + ", piso=" + piso + ", estado=" + estado + "]";
	}

	public alarma(String fecha, int piso, Boolean estado) {
		this.fecha = fecha;
		this.piso = piso;
		this.estado = estado;
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

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	
	
	
}
