package modelo;

import java.util.Vector;

public class Proveedor {
	
	private int codigo;
	private String nombre;
	private String pais;
	private Vector<ListaPrecios> listasDePrecios;
	private Vector<DescuentoProveedor> descuentos;
	
	public Proveedor(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}

	public Vector<ListaPrecios> getListasDePrecios() {
		return listasDePrecios;
	}

	public Vector<DescuentoProveedor> getDescuentos() {
		return descuentos;
	}
	
	
	
	
	

}
