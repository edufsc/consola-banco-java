package banco.modelos;

public class Cliente extends Usuario {

	private Integer idGestor;
	private Double saldo;

	public Cliente() {
		super();
	}
	
	public Cliente(Integer id, String usuario, String password, String correo, Double saldo, Integer idGestor) {
		super(id, usuario, password, correo);
		this.saldo = saldo;
		this.idGestor = idGestor;
	}

	public Integer getIdGestor() {
		return idGestor;
	}

	public void setIdGestor(Integer idGestor) {
		this.idGestor = idGestor;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String toString() {
		return "Cliente{id: " + this.id + ", nombre: " + this.usuario + ", saldo: " + this.saldo + "}";
	}

}
