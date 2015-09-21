package modelo;

import java.util.Vector;

public class ListaPrecios {
	
	private int codigo;
	private Vector<ItemListaPrecios> items;
	private Vector<CondicionDePago> condicionesDePago;
	
	
	public ListaPrecios(int codigo, Vector<ItemListaPrecios> items) {
		super();
		this.codigo = codigo;
		this.items = items;
	}
	public Vector<CondicionDePago> getCondicionesDePago() {
		return condicionesDePago;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Vector<ItemListaPrecios> getItems() {
		return items;
	}
	public void setItems(Vector<ItemListaPrecios> items) {
		this.items = items;
	}
	
	
	
	
}
