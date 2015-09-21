package modelo;

public class DescuentoProveedor {
	
	private int codigo;
	private float porcentual;
	
	
	public DescuentoProveedor(int codigo, float porcentual) {
		super();
		this.codigo = codigo;
		this.porcentual = porcentual;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public float getPorcentual() {
		return porcentual;
	}


	public void setPorcentual(float porcentual) {
		this.porcentual = porcentual;
	}
	
	
}
