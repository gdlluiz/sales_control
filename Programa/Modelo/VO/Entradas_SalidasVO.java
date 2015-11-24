package Modelo.VO;

public class Entradas_SalidasVO {

	private int idES;
	private int codArticulo;
	private String fecha;
	private String hora;
	private Boolean movimiento_ES;
	private int cantidad;
	private int codUsuario;
	
	
	
	//getters and setters
	
	
	public int getIdES() {
		return idES;
	}
	public void setIdES(int idES) {
		this.idES = idES;
	}
	public int getCodArticulo() {
		return codArticulo;
	}
	public void setCodArticulo(int codArticulo) {
		this.codArticulo = codArticulo;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public Boolean getMovimiento_ES() {
		return movimiento_ES;
	}
	public void setMovimiento_ES(Boolean movimiento_ES) {
		this.movimiento_ES = movimiento_ES;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getCodUsuario() {
		return codUsuario;
	}
	public void setCodUsuario(int codUsuario) {
		this.codUsuario = codUsuario;
	}
	
	
	
	
	
	
}
