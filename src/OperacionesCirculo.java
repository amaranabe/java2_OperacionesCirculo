import java.util.Scanner;

/*
 *Programa para conocer el area y la circunferencia de un circulo.
 */
public class Main {

	public static void main (String args[]) {

		float radio, resultadoArea, resultadoCircunferencia;
		Circulo operaciones = new Circulo();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\ncual es el radio: ");
		radio = sc.nextInt();

		
		resultadoArea = operaciones.area(radio);
		resultadoCircunferencia = operaciones.circunf(radio);
		
		System.out.println("\nEl resultado del AREA es: " + resultadoArea);
		System.out.println("\nEl resultado de la CIRCUNFERENCIA es: " + resultadoCircunferencia);
		
	
		System.out.println("\n\nEGUN ONA IZAN!!\n");
	}
}