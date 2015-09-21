package modelo;

import java.sql.Date;
import java.util.Vector;

public class RemitoCliente {

	private int codigo;
	private Vector<ItemRemitoCliente> items;
	private Date fecha;
	private boolean estado;
	
	public RemitoCliente(int codigo,
			Date fecha, boolean estado) {
		super();
		this.codigo = codigo;
		items = new Vector<ItemRemitoCliente>();
		this.fecha = fecha;
		this.estado = estado;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Vector<ItemRemitoCliente> getItems() {
		return items;
	}

	public void setItems(Vector<ItemRemitoCliente> items) {
		this.items = items;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public void agregarItem(Rodamiento rodamiento, int cantidad)
	{
		items.add(new ItemRemitoCliente(cantidad,rodamiento));
	}
	
}
