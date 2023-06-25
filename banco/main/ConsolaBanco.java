package banco.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import banco.modelos.Gestor;
import banco.util.Utiles;

public class ConsolaBanco {

	public static void main(String[] args) {

		// simula "base de datos" de gestores
		List<Gestor> gestores = new ArrayList<>();
		// para garantizar que el id es único
		Integer siguienteIdGestor = 1;

		Scanner teclado = new Scanner(System.in);

		int opcion = -1;

		do {
			System.out.println("\n1. Insertar gestor");
			System.out.println("2. Insertar gestores de prueba");
			System.out.println("3. Consultar gestor");
			System.out.println("4. Ver todos los gestores");
			System.out.println("5. Actualizar gestor");
			System.out.println("6. Eliminar un gestor");
			System.out.println("0. Salir\n");
			System.out.print("Selecciona una opción: ");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				System.out.print("Nombre: ");
				String nombre = teclado.next();
				System.out.print("Email: ");
				String email = teclado.next();
				System.out.print("Contraseña: ");
				String pass = teclado.next();
				System.out.print("Oficina: ");
				String oficina = teclado.next();
				Gestor nuevoGestor = new Gestor(siguienteIdGestor, nombre, pass, email, oficina);
				gestores.add(nuevoGestor);
				siguienteIdGestor++;
				System.out.println("Gestor creado con éxito.");
				break;
			case 2:
				System.out.print("Número de gestores: ");
				int numeroGestores = teclado.nextInt();
				for (int i = 0; i < numeroGestores; i++) {
					String usuario = Utiles.nombreAleatorio();
					String correo = Utiles.correoAleatorio();
					Gestor gestor = new Gestor(siguienteIdGestor, usuario, "", correo, "Valencia");
					gestores.add(gestor);
					siguienteIdGestor++;
				}
				break;
			case 3:
				System.out.print("Id del gestor a consultar: ");
				int idGestor = teclado.nextInt();
				Gestor gestorResultado = null;
				for (int i = 0; i < gestores.size(); i++) {
					Gestor gestor = gestores.get(i);
					if (gestor.getId() == idGestor) {
						gestorResultado = gestor;
						// como ya lo hemos encontrado, rompemos el bucle
						break;
					}
				}
				// si se ha encontrado
				if (gestorResultado != null) {
					System.out.println(gestorResultado);
				} else {
					System.out.println("No se pudo encontrar un gestor con el id " + idGestor);
				}
				break;
			case 4:
				if (gestores.isEmpty()) {
					System.out.println("Todavía no hay gestores.");
				}
				gestores.forEach(gestor -> {
					System.out.println(gestor);
				});
				break;
			case 5:
				System.out.print("Id del gestor a actualizar: ");
				idGestor = teclado.nextInt();
				gestorResultado = null;
				int posicionGestor = -1;
				for (int i = 0; i < gestores.size(); i++) {
					Gestor gestor = gestores.get(i);
					if (gestor.getId() == idGestor) {
						gestorResultado = gestor;
						posicionGestor = i;
						// como ya lo hemos encontrado, rompemos el bucle
						break;
					}
				}
				// si se ha encontrado
				if (gestorResultado != null) {
					System.out.println(gestorResultado);
					System.out.println("[n] Nombre");
					System.out.println("[e] Email");
					System.out.println("[c] Contraseña");
					System.out.println("[o] Oficina");
					System.out.println("[x] Cancelar");
					System.out.print("Campo a actualizar: ");
					char opcionActualizar = teclado.next().charAt(0);
					switch (opcionActualizar) {
					case 'n':
						System.out.print("Nombre: ");
						nombre = teclado.next();
						gestorResultado.setUsuario(nombre);
						break;
					case 'e':
						System.out.print("Email: ");
						email = teclado.next();
						gestorResultado.setCorreo(email);
						break;
					case 'c':
						System.out.print("Contraseña: ");
						pass = teclado.next();
						gestorResultado.setPassword(pass);
						break;
					case 'o':
						System.out.print("Oficina: ");
						oficina = teclado.next();
						gestorResultado.setOficina(oficina);
						break;
					case 'x':
						System.out.print("Cancelando actualización...");
						break;
					default:
						System.out.println("Opción no válida.");
					}
					if (opcionActualizar != 'x') {
						gestores.set(posicionGestor, gestorResultado);
						System.out.println("Se actualizó el gestor con el id " + idGestor);
					}
				} else {
					System.out.println("No se pudo encontrar un gestor con el id " + idGestor);
				}
				break;
			case 6:
				System.out.print("Id del gestor a eliminar: ");
				idGestor = teclado.nextInt();
				gestorResultado = null;
				posicionGestor = -1;
				for (int i = 0; i < gestores.size(); i++) {
					Gestor gestor = gestores.get(i);
					if (gestor.getId() == idGestor) {
						gestorResultado = gestor;
						posicionGestor = i;
						// como ya lo hemos encontrado, rompemos el bucle
						break;
					}
				}
				// si se ha encontrado
				if (gestorResultado != null) {
					gestores.remove(posicionGestor);
					System.out.println("Se eliminó el gestor con el id " + idGestor);
				} else {
					System.out.println("No se pudo encontrar un gestor con el id " + idGestor);
				}
				break;
			case 0:
				System.out.println("¡Hasta pronto!");
				break;
			default:
				System.out.println("Opción desconocida...");
			}

		} while (opcion != 0);

	}

}
