package banco.util;

import java.util.Random;

public class Utiles {

	// final indica que es una constante
	public static final String[] NOMBRES = { "Juan", "Antonia", "Paco", "Irene", "Carlos", "Mar�a", "Pedro", "Luisa", "Miguel", "Sof�a", "Javier", "Laura", "Andr�s", "Valentina", "Ricardo", "Camila", "Fernando", "Isabella", "Gabriel", "Paula", "Roberto", "Ana", "Sebasti�n", "Marta", "Alejandro" };

	public static final String[] APELLIDOS = { "P�rez", "Mart�n", "L�pez", "G�mez", "Uta", "Lama", "Rodr�guez", "Gonz�lez", "Hern�ndez", "Garc�a", "Fern�ndez", "Torres", "Vargas", "Romero", "Moreno", "Navarro", "S�nchez", "Ram�rez", "Flores", "Delgado", "Cruz", "Morales", "Ortega", "Castillo", "Soto", "Mendoza", "Reyes", "Ibarra", "M�ndez", "Ramos", "Guerrero", "Rojas", "Salazar", "Vega", "Campos", "Vargas", "Castro", "Cort�s", "Pacheco", "Barrera", "Silva" };

	public static final String[] USUARIOS = { "jperez", "amartin", "junior", "eladio" };

	public static final String[] DOMINIOS = { "gmail.com", "hormail.com", "mailinator.com", "yahoo.es" };

	// obtener un nombre completo "aleatorio" a partir de dos listas
	public static String nombreAleatorio(String[] nombres, String[] apellidos) {

		// generador de aleatorios
		Random random = new Random();

		// �ndice aleatorio en el rango de la lista de nombres
		int indiceNombre = random.nextInt(nombres.length);

		// nombre en el �ndice generado
		String nombre = nombres[indiceNombre];

		int indiceApellidos = random.nextInt(apellidos.length);
		String apellido = apellidos[indiceApellidos];

		return nombre + " " + apellido;

	}

	// utilizamos los atributos de la clase para no tener que pasar par�metros
	public static String nombreAleatorio() {
		return nombreAleatorio(NOMBRES, APELLIDOS);
	}

	// retornar un email aleatorio
	// completar
	public static String correoAleatorio(String[] correos) {
		// generador de aleatorios
		Random random = new Random();

		// �ndice aleatorio en el rango de la lista de correos
		int indiceCorreo = random.nextInt(correos.length);

		// correo en el �ndice generado
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

	public static String correoAleatorio(String[] nombres, String[] apellidos, String[] dominios) {
		// generador de aleatorios
		Random random = new Random();

		// �ndice aleatorio en el rango de la lista de nombres
		int indiceNombre = random.nextInt(nombres.length);
		String nombre = nombres[indiceNombre];

		int indiceApellidos = random.nextInt(apellidos.length);
		String apellido = apellidos[indiceApellidos];

		int indiceDominio = random.nextInt(dominios.length);
		String dominio = dominios[indiceDominio];

		return nombre.toLowerCase() + "." + apellido.toLowerCase() + "@" + dominio;
	}

}
