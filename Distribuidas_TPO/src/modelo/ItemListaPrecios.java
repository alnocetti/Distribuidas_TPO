package modelo;

public class ItemListaPrecios {
	
	private int cantidad;
	private Rodamiento rodamiento;
	private float precio;
	
	
	public ItemListaPrecios(int cantidad, Rodamiento rodamiento, float precio) {
		super();
		this.cantidad = cantidad;
		this.rodamiento = rodamiento;
		this.precio = precio;
	}


	public int getCantidad() {
		return cantidad;
	}


	public Rodamiento getRodamiento() {
		return rodamiento;
	}


	public float getPrecio() {
		return precio;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public void setRodamiento(Rodamiento rodamiento) {
		this.rodamiento = rodamiento;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	
}
