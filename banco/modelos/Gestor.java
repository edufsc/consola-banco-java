package banco.modelos;

public class Gestor extends Usuario {

	private String oficina;

	public Gestor() {
	}

	public Gestor(Integer id, String usuario, String password, String correo) {
		super(id, usuario, password, correo);
	}

	public Gestor(Integer id, String usuario, String password, String correo, String oficina) {
		super(id, usuario, password, correo);
		this.oficina = oficina;
	}

	public String getOficina() {
		return oficina;
	}

	public void setOficina(String oficina) {
		this.oficina = oficina;
	}

	public String toString() {
		return "Gestor{id: " + this.id + ", nombre: " + this.usuario + ", oficina: " + this.oficina + "}";
	}

}
