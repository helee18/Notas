package notas;

/** Clase para comprobar cual es la calificacion correspondiente a la nota que se recibe **/
public class Califica {

	/**
	 * Metodo para calcular la calificacion correspondiente a la nota introducida
	 * @param num_nota
	 * @return calificacion
	 */
	public static String califica(int num_nota) {
        /** Definimos la variable en la que almacenaremos el mensaje a mostrar con al calificacion **/
		String calificacion;
		if (num_nota >= 0 && num_nota < 5) {
			calificacion = "Suspenso";}
		else if (num_nota >= 5 && num_nota < 7) {
			calificacion = "Aprobado";}
		else if (num_nota >= 7 && num_nota < 9) {
			calificacion = "Notable";}
		else if (num_nota >= 9 && num_nota <= 10) {
			calificacion = "Sobresaliente";}
		else { 
			calificacion = "La nota introducida no es correcta";}
        
        /** Devolvemos el mensaje correcto a mostrar **/
		return calificacion;
	}

}
