package banco.modelos;

// cuando una clase "extiende" a otra hereda sus atributos y sus métodos
// la herencia hace más mantenible y reutilizable nuestro código
// Gestor y Cliente comparten atributos exáctamente iguales
// ahora solo los tenemos que declarar una vez en Usuario
// además podríamos añadir nuevas clases de Usuario (Ej. Asesor, Admin...) de forma totalmente compatible
public class Cliente extends Usuario {

	// a los atributos de esta clase se añaden los de la clase de la que hereda (Usuario)
	private Integer idGestor;
	private Double saldo;

	public Cliente() {
		// con super hacemos referencia al constructor de la clase de la que hereda
		// Nota: para los constructores vacíos como este no es necesario
		super();
	}
	
	public Cliente(Integer id, String usuario, String password, String correo, Double saldo, Integer idGestor) {
		// en este caso llamamos al constructor del que hereda con los parámetros que necesita
		super(id, usuario, password, correo);
		// luego inicializamos los atributos propios de esta clase
		// con el resto de los parámetros o los valores que proceda en cada caso
		this.saldo = saldo;
		this.idGestor = idGestor;
	}

	// solo necesitamos declarar los métodos consultores y modificadores de los atributos propios de esta clase
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

	// podemos sobreescibir métodos de la clase de la que hereda si se llaman igual y tienen los mismos parámetros
	public String toString() {
		// los atributos de la clase de laque hereda son accesibles siempre que sean "protected" y no "private"
		return "Cliente{id: " + this.id + ", nombre: " + this.usuario + ", saldo: " + this.saldo + "}";
	}

}
