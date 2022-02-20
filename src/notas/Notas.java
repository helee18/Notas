package notas;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir números por teclado
		int nota = 0;
		String calificacion = "";
		System.out.print("Introduzca una nota: ");
		nota = reader.nextInt();

		calificacion = Califica.califica(nota);

		System.out.println(calificacion);
		reader.close();
	}

	/**
	 * @param nota
	 * @return calificacion
	 * @deprecated Use {@link Califica#califica(int)} instead
	 */
	public static String cali(int nota) {
		return Califica.califica(nota);
	}
}