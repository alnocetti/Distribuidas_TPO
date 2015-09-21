package modelo;

public class ItemRemitoCliente {

	private int cantidad;
	private Rodamiento rodamiento;
	public ItemRemitoCliente(int cantidad, Rodamiento rodamiento) {
		super();
		this.cantidad = cantidad;
		this.rodamiento = rodamiento;
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
	public void setRodamiento(Rodamiento rodamiento) {
		this.rodamiento = rodamiento;
	}
	
	

	
	
}
