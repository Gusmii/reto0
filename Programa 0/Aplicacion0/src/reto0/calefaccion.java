package reto0;

public class calefaccion {

	private String fecha;
	private int piso;
	private String aula;
	private Boolean estado;
	
	
	
	
	@Override
	public String toString() {
		return "calefaccion [fecha=" + fecha + ", piso=" + piso + ", aula=" + aula + ", estado=" + estado + "]";
	}
	
	
	public calefaccion(String fecha, int piso, String aula, Boolean estado) {
		
		this.fecha = fecha;
		this.piso = piso;
		this.aula = aula;
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

	public String getAula() {
		return aula;
	}

	public void setAula(String aula) {
		this.aula = aula;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	
	
	
	
	
	
	
}
