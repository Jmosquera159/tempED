import java.util.Scanner;



public class ArregloJ3 {
    static String[] nombres;
	static double[][][] notas;
    static double[][] promedios;
    static int multi;
    static int multiMeses;
    
    static Scanner teclado = new Scanner(System.in);
 
	public static void main(String[] args) {

        System.out.print("Cuantas materias son? ");
        int Nmaterias = Integer.parseInt(teclado.nextLine());
 
		System.out.print("Cuantos alumnos son? ");
        int alumnos = Integer.parseInt(teclado.nextLine());

        System.out.print("Cuantos meses son? ");
        int meses = Integer.parseInt(teclado.nextLine());
        
		nombres = new String[alumnos];
        notas = new double[alumnos][Nmaterias][meses];
        promedios = new double[alumnos][meses];

		for (int i = 0; i < alumnos; i++)
		{

            System.out.println("Nombre del estudiante #" + (i+1) + ": ");
            
			nombres[i] = teclado.nextLine();

            System.out.println("introduzca la(s) nota(s) de la(s) " + Nmaterias + " Materia(s)");
            
			for (int k = 0; k < meses; k++)
			{
                for (int j= 0; j < Nmaterias; j++){

                System.out.println("Notas #" + (j+1) + " del mes #" + (k+1) );

                notas[i][j][k] = Double.parseDouble(teclado.nextLine());

                }
            
            }

            multiMeses = meses;

            multi = meses * Nmaterias;

            promedios[i][0] = calculaPromedio(notas[i]);

    }
        

        System.out.println("\n Promedio:");
       
        for (int i = 0; i < alumnos; i++) {

            System.out.print(nombres[i] + " ");
            
            System.out.println(promedios[i][0]);
        
        }

    }
   
	static double calculaPromedio(double[][] filaCalificaciones)
	{
        
        double suma = 0;

        for (int k = 0; k < multiMeses ; k++)

        for (int i = 0; i < notas.length; i++)

            suma += filaCalificaciones[i][k];
        
        return suma / multi;
        
    }
    
}