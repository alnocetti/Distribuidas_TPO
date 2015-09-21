package modelo;

import java.util.Vector;

public class CasaCentral {

	public static CasaCentral instancia;
	private Vector<OrdenDeCompra> ordenesDeCompra;
	private Vector<Proveedor> proveedores;
	private Vector<OficinaVenta> oficinasDeVenta;
	private Vector<ComparativaPrecio> comparativasDePrecio;
	private Vector<Rodamiento> rodamientos;
	private Vector<PedidoDeCompra> pedidosDeCompra;
	private Vector<RemitoOV> remitosOV;

	// constructor vacio
	public CasaCentral() {
		super();
	}

	// implementacion singleton
	public static CasaCentral getInstancia() {
		if (instancia == null)
			return new CasaCentral();
		return instancia;
	}

	public Vector<OrdenDeCompra> getOrdenesDeCompra() {
		return ordenesDeCompra;
	}

	public Vector<Proveedor> getProveedores() {
		return proveedores;
	}

	public Vector<OficinaVenta> getOficinasDeVenta() {
		return oficinasDeVenta;
	}

	public Vector<ComparativaPrecio> getComparativasDePrecio() {
		return comparativasDePrecio;
	}

	public Vector<Rodamiento> getRodamientos() {
		return rodamientos;
	}

	public Vector<PedidoDeCompra> getPedidosDeCompra() {
		return pedidosDeCompra;
	}

	public Vector<RemitoOV> getRemitosOV() {
		return remitosOV;
	}
	
	

}
