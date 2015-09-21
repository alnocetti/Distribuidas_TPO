package modelo;

import java.util.Date;
import java.util.Vector;

public class OrdenDeCompra {

	private int codigo;
	private Date fecha;
	private String estado;
	private Proveedor proveedor;
	private Vector<ItemOrdenDeCompra> items;
	private Vector<PedidoDeCompra>pedidosDeCompra;
	
	
	public OrdenDeCompra(int codigo, Date fecha, String estado,
			Proveedor proveedor) {
		super();
		this.codigo = codigo;
		this.fecha = fecha;
		this.estado = estado;
		this.proveedor = proveedor;
	}


	public int getCodigo() {
		return codigo;
	}


	public Date getFecha() {
		return fecha;
	}


	public String getEstado() {
		return estado;
	}


	public Proveedor getProveedor() {
		return proveedor;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public Vector<ItemOrdenDeCompra> getItems(){
		return this.items;
	}


	public Vector<PedidoDeCompra> getPedidosDeCompra() {
		return pedidosDeCompra;
	}
	
	
	
}
