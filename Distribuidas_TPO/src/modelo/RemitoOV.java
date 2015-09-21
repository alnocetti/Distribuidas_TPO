package modelo;

import java.util.Date;
import java.util.Vector;

public class RemitoOV {
	private int codigo;
	private Date fecha;
	private Vector<PedidoDeCompra> pedidosDeCompra;
	private Vector<ItemRemitoOV> items;
	private int codigoOV;
	
	public RemitoOV(int codigo, Date fecha,
			Vector<PedidoDeCompra> pedidosDeCompra, Vector<ItemRemitoOV> items,int codigoOV) {
		super();
		this.codigo = codigo;
		this.fecha = fecha;
		this.pedidosDeCompra = pedidosDeCompra;
		this.items = items;
		this.codigoOV = codigoOV;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getCodigo() {
		return codigo;
	}

	public Vector<PedidoDeCompra> getPedidosDeCompra() {
		return pedidosDeCompra;
	}

	public Vector<ItemRemitoOV> getItems() {
		return items;
	}

	public int getCodigoOV() {
		return codigoOV;
	}

	public void setCodigoOV(int codigoOV) {
		this.codigoOV = codigoOV;
	}
	
	

	
}
