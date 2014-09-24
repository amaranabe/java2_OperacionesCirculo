/*
 * Clase para obtener resultados del area y la circunferencia de un circulo.
 */
public class Circulo {


 //Metodo que calcula el area.
 public float area (float radio) {

	float result;
	result	= 3.1415f * radio * radio;
	return result;
 }

//Metodo que calcula la circunferencia.
 public float circunf (float radio) {

	float result;
	result = 2 * radio * 3.1415f;
	return result;
 }


}
