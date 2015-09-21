package modelo;

public class ItemOrdenDeCompra {
	
	private int cantidad;
	private Rodamiento rodamiento;
	private float precio;
	private String estado;
	private int diferencia;
	
	
	public ItemOrdenDeCompra(int cantidad, Rodamiento rodamiento, float precio) {
		super();
		this.cantidad = cantidad;
		this.rodamiento = rodamiento;
		this.precio = precio;
		this.estado = "";
		this.diferencia = 0;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public Rodamiento getRodamiento() {
		return rodamiento;
	}


	public float getPrecio() {
		return precio;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public int getDiferencia() {
		return diferencia;
	}


	public void setDiferencia(int diferencia) {
		this.diferencia = diferencia;
	}
	
	
	
}


