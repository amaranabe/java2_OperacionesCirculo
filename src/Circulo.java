/*
 * Clase para obtener resultados del area y la circunferencia de un circulo.
 */
public class Circulo {


 //Método que calcula el area.
 public float area (float radio) {

	float result;
	result	= 3,1415 * radio * radio;
	return result;
 }

//Método que calcula la circunferencia.
 public float circunf (float radio) {

	float result;
	result = 2 * radio * 3,1415;
	return result;
 }


}