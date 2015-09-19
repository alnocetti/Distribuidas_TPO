package modelo;

public class Rodamiento {
	private int codigo;
	private int sfk;
	private String origen;
	private String marca;
	
	
	public Rodamiento(int codigo, int sfk, String origen, String marca) {
		super();
		this.codigo = codigo;
		this.sfk = sfk;
		this.origen = origen;
		this.marca = marca;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public int getSfk() {
		return sfk;
	}


	public void setSfk(int sfk) {
		this.sfk = sfk;
	}


	public String getOrigen() {
		return origen;
	}


	public void setOrigen(String origen) {
		this.origen = origen;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}
