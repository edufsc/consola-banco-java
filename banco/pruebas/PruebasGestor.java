package banco.pruebas;

import java.util.Date;

import banco.modelos.Gestor;

public class PruebasGestor {

	public static void main(String[] args) {

		Gestor gestor = new Gestor(1, "paco", "1234", "paco@correo.com");
		gestor.setOficina("Valencia");
		
		// alternativa sin parámetros en el constructor
		Gestor gestorB = new Gestor();
		gestorB.setId(2);
		gestorB.setUsuario("ana");
		gestorB.setPassword("4321");
		gestorB.setCorreo("ana@correo.com");

		System.out.println(gestor);

		if (gestor.equals(gestorB)) {
			System.out.println("Son el mismo gestor");
		} else {
			System.out.println("Son gestores distintos");
		}

	}

}
