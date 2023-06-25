package banco.pruebas;

import java.util.ArrayList;
import java.util.List;

import banco.modelos.Gestor;
import banco.util.Utiles;

public class PruebaUtil {

	public static void main(String[] args) {

		// utilizando los atributos públicos de Utiles
		String nombreAleatorio = Utiles.nombreAleatorio(Utiles.NOMBRES, Utiles.APELLIDOS);

//		System.out.println(nombreAleatorio);

		// sin parámetros
		nombreAleatorio = Utiles.nombreAleatorio();

//		System.out.println(nombreAleatorio);

		String[] nombres = { "José", "Lucía", "Marta", "John" };
		String[] apellidos = { "Albert", "García", "Lucas", "Esteve" };

		// pasando listas personalizadas
		nombreAleatorio = Utiles.nombreAleatorio(nombres, apellidos);

//		System.out.println(nombreAleatorio);

		String correoAleatorio = Utiles.correoAleatorio();

//		System.out.println(correoAleatorio);

		correoAleatorio = Utiles.correoAleatorio(Utiles.NOMBRES, Utiles.APELLIDOS, Utiles.DOMINIOS);

//		System.out.println(correoAleatorio);

		// para guardar los gestores
		List<Gestor> gestores = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			String usuario = Utiles.nombreAleatorio();
			String correo = Utiles.correoAleatorio();
			// crear gestor con los datos aleatorios
			// (i+1 para que el id no sea nunca 0)
			Gestor gestor = new Gestor(i + 1, usuario, "", correo);
			// añadirlo a la lista
			gestores.add(gestor);
		}

		System.out.println(gestores);

	}

}
