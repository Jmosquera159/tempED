import java.util.Scanner;

public class ArregloFinalJ {

	static String[] nombres;
	static double[][] notas;
    static double[] promedios;
    
    static Scanner teclado = new Scanner(System.in);
 
	public static void main(String[] args) {

        System.out.print("Cuantas materias son? ");
        int Nmaterias = Integer.parseInt(teclado.nextLine());
 
		System.out.print("Cuantas alumnos son? ");
        int alumnos = Integer.parseInt(teclado.nextLine());
        
		nombres = new String[alumnos];
        notas = new double[alumnos][Nmaterias];
        promedios = new double[alumnos];

		for (int i = 0; i < alumnos; i++)
		{

			System.out.println("Nombre del estudiante #" + (i+1) + ": ");
			nombres[i] = teclado.nextLine();

			System.out.println("introduzca la(s) nota(s) de la(s) " + Nmaterias + " Materia(s)");
			for (int j = 0; j < Nmaterias; j++)
			{
				System.out.println("Notas #" + (j+1) + ": ");
				notas[i][j] = Integer.parseInt(teclado.nextLine());
            }

            promedios[i] = calculaPromedio(notas[i]);

		}
        for(int i=0;i<notas.length;i++){

            System.out.print(nombres[i] + " ");

            for(int j=0;j<notas[0].length;j++){
 
                System.out.print(" " +notas[i][j] + " " );

            }
            System.out.println("");
           
        }

        System.out.println("Promedio:");

        
        for (int i = 0; i < alumnos; i++) {
            System.out.print(nombres[i] + " ");
            System.out.println(promedios[i]);
            }

    }
    
	static double calculaPromedio(double[] filaCalificaciones)
	{
		double suma = 0;
		for (int i = 0; i < notas.length; i++)
			suma += filaCalificaciones[i];
 
		return suma / notas.length;
	}

}