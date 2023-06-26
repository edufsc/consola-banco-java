package banco.util;

import java.util.Random;

// es habitual tener clases que no sirven para representar modelos de datos o tipos
// estas clases pueden ser "librerías" de código reutilizable
// puede ser código que complementa la parte principal de nuestro software
public class Utiles {

	// final indica que es una constante, no cambiará en ejecución
	// static permita que sea accesible a través del nombre de la clase (Utiles.NOMBRES)
	public static final String[] NOMBRES = { "Juan", "Antonia", "Paco", "Irene", "Carlos", "María", "Pedro", "Luisa", "Miguel", "Sofía", "Javier", "Laura", "Andrés", "Valentina", "Ricardo", "Camila", "Fernando", "Isabella", "Gabriel", "Paula", "Roberto", "Ana", "Sebastián", "Marta", "Alejandro" };

	public static final String[] APELLIDOS = { "Pérez", "Martín", "López", "Gómez", "Uta", "Lama", "Rodríguez", "González", "Hernández", "García", "Fernández", "Torres", "Vargas", "Romero", "Moreno", "Navarro", "Sánchez", "Ramírez", "Flores", "Delgado", "Cruz", "Morales", "Ortega", "Castillo", "Soto", "Mendoza", "Reyes", "Ibarra", "Méndez", "Ramos", "Guerrero", "Rojas", "Salazar", "Vega", "Campos", "Vargas", "Castro", "Cortés", "Pacheco", "Barrera", "Silva" };

	public static final String[] USUARIOS = { "jperez", "amartin", "junior", "eladio" };

	public static final String[] DOMINIOS = { "gmail.com", "hormail.com", "mailinator.com", "yahoo.es" };

	// obtener un nombre completo "aleatorio" a partir de dos listas recibidas como parámetro
	public static String nombreAleatorio(String[] nombres, String[] apellidos) {

		// generador de aleatorios
		Random random = new Random();

		// índice aleatorio en el rango de la lista de nombres
		int indiceNombre = random.nextInt(nombres.length);

		// nombre en el índice generado
		String nombre = nombres[indiceNombre];

		int indiceApellidos = random.nextInt(apellidos.length);
		String apellido = apellidos[indiceApellidos];

		return nombre + " " + apellido;

	}

	// podemos declarar métodos que se llaman igual, pero tienen un número de parámetros distinto
	// utilizamos los atributos de esta clase para no tener que pasar parámetros en este método
	public static String nombreAleatorio() {
		return nombreAleatorio(NOMBRES, APELLIDOS);
	}

	// retornar un email aleatorio
	public static String correoAleatorio(String[] correos) {
		// generador de aleatorios
		Random random = new Random();

		// índice aleatorio en el rango de la lista de correos
		int indiceCorreo = random.nextInt(correos.length);

		// correo en el índice generado
		return correos[indiceCorreo];
	}

	public static String correoAleatorio(String[] usuarios, String[] dominios) {
		// generador de aleatorios
		Random random = new Random();

		int indiceUsuario = random.nextInt(usuarios.length);
		String usuario = usuarios[indiceUsuario];

		int indiceDominio = random.nextInt(dominios.length);
		String dominio = dominios[indiceDominio];

		return usuario + "@" + dominio;
	}

	public static String correoAleatorio() {
		return correoAleatorio(USUARIOS, DOMINIOS);
	}

	// correos combinando nombres, apellidos y dominios
	public static String correoAleatorio(String[] nombres, String[] apellidos, String[] dominios) {
		// generador de aleatorios
		Random random = new Random();

		// índice aleatorio en el rango de la lista de nombres
		int indiceNombre = random.nextInt(nombres.length);
		String nombre = nombres[indiceNombre];

		int indiceApellidos = random.nextInt(apellidos.length);
		String apellido = apellidos[indiceApellidos];

		int indiceDominio = random.nextInt(dominios.length);
		String dominio = dominios[indiceDominio];

		return nombre.toLowerCase() + "." + apellido.toLowerCase() + "@" + dominio;
	}

}
