package notas;

import java.util.Scanner;

/** Clase Notas para calcular la calificacion que corresponde a cada nota **/
public class Notas {

    /** Metodo en el pediremos la nota al usuario, llamaremos al metodo de la clase que calcula la calificacion y mostraremos esta **/
	public static void main(String[] args) {
        /** Se define la variable que usaremos despues para pedir datos al usuario **/
		Scanner reader = new Scanner(System.in);// Para pedir números por teclado
        
        /** Se define e inicializa la variable que usaremos para almacenar la nota y calificaciones **/
		int nota = 0;
		String calificacion = "";
        
        /** Se muestra un mensaje para indicar que pedimos la nota y recogemos el resultado introducido por el usuario **/
		System.out.print("Introduzca una nota: ");
		nota = reader.nextInt();

        /** Llamamos al metodo califica de la clase Califica para comprobar cual es la calificacion correspondiente a la nota que le pasamos **/
		calificacion = Califica.califica(nota);

        /** Mostramos la calificación correcta y terminamos el programa **/
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