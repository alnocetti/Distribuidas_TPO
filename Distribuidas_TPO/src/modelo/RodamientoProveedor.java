package modelo;

public class RodamientoProveedor {
	private Rodamiento rodamiento;
	private Proveedor proveedor;
	
	
	public RodamientoProveedor(Rodamiento rodamiento, Proveedor proveedor) {
		super();
		this.rodamiento = rodamiento;
		this.proveedor = proveedor;
	}


	public Rodamiento getRodamiento() {
		return rodamiento;
	}


	public void setRodamiento(Rodamiento rodamiento) {
		this.rodamiento = rodamiento;
	}


	public Proveedor getProveedor() {
		return proveedor;
	}


	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
	
	
}
