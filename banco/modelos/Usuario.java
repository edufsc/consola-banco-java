package banco.modelos;

public class Usuario {

	// los atributos protected actúan como private
	// pero son accesibles en las clase que heredan de esta (Gestor y Cliente)
	// dentro de la misma clase podemos acceder a ellos con "this."
	// si el nombre del atributo no es el mismo que el de otra variable o parámetro
	// no es necesario usar "this"
	// pero puede hacer más legible y semántico el código
	protected Integer id;
	protected String usuario;
	protected String password;
	protected String correo;

	// constructor vacío
	// creará un objeto o instancia de Usuario
	// con los atributos sin inicializar (sin valor o con su valor por defecto)
	public Usuario() {

	}

	// constructor parametrizado (con parámetros)
	// recibe valores declarados como parámetros (entre paréntesis)
	// en este caso inicializa los atribudos (marcados con "this") asignándoles los
	// valores que se reciban en los parámetros
	public Usuario(Integer id, String usuario, String password, String correo) {
		// en este caso el "this" es necesario
		// de otro modo no distinguimos entre el id "atributo de clase" y el id
		// "parámetro del método"
		// el resultado de id = id sería que el atributo de clase no se inicializa
		// (spoiler: muchos problemas)
		// una alternativa sería que el parátro se llamara nuevoId y hacer id = nuevoId.
		// No es lo habitual.
		this.id = id;
		this.usuario = usuario;
		this.password = password;
		this.correo = correo;
	}

	// los métodos consultores (getters) públicos (public)
	// permiten leer los atributos privados o protegidos fuera de la clase
	public Integer getId() {
		return id;
	}

	// los métodos modificadores (setters) públicos (public)
	// permiten modificar los atributos privados o protegidos fuera de la clase
	// no suelen retornar nada (void), ya que su única función es modificar
	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	// los métodos toString y equals se heredan en todas las clases, aunque no lo
	// utilicemos
	// ya que todas las clases herdan por defecto de Object
	// podemos sobreescribir estos métodos para que se ajusten a nuestras
	// necesidades

	// toString traducirá los objetos de esta clase a un texto (String) que podemos
	// personalizar
	public String toString() {
		return "Usuario{id: " + this.id + ", nombre: " + this.usuario + "}";
	}

	// equals se utiliza para comparar dos objetos de esta clase
	// podemos sobreescribirlo para que compare los atributos que prefiramos
	// en este caso podemos decir que dos usuarios son el mismo si tienen el mismo
	// id
	public boolean equals(Object o) {
		// como los parámetros deben ser los mismos para sobreescribir una función
		// tenemos que convertir del tipo genérico "Object" a nuestro tipo Usuario
		// esta operación se conoce como "casting" o conversión forzada
		Usuario g = (Usuario) o;
		boolean mismoId = this.id == g.id;
		return mismoId;
	}
}
