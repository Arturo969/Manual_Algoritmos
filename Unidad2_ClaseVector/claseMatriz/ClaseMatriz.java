package claseMatriz;

import java.util.Scanner;

public class ClaseMatriz {

		static int[][] matriz1=null;
		//Static para usar dentro del main
		//null porque el usuario va a definir el tamaño
		static Scanner scan = new Scanner(System.in);	
		
		public static int[][] definirTamano(int [][] x)
		{
			System.out.println("Ingrese el tamaño de la matriz: (filas&columnas)");
			String datosIngresados = scan.next();
			String []datos = datosIngresados.split("&");
			
			int filas = Integer.parseInt(datos[0]);//convertir de cadena a entero
			int columnas = Integer.parseInt(datos[1]);
			x = new int [filas][columnas];
			return x;
		}
		
		public static void ingresaValor(int[][] x)
		{
			System.out.println("Valores de la matriz:");
			for(int i = 0; i < x.length;i++)
			{
				for(int j = 0; j < x[i].length; j++)
				{
					x[i][j]=Integer.parseInt(scan.next());
				}
			}
		}
		
		public static void imprimirMatriz(int[][] x)
		{
			for(int i = 0; i < x.length;i++)
			{
				for(int j = 0; j < x[i].length; j++)
				{
					System.out.printf("[ %d ]",x[i][j]);
				}
				System.out.println(" ");
			}
		}
		public static void main(String[] args) 
		{
			matriz1 = definirTamano(matriz1);
			System.out.println("Filas: "+ matriz1.length);
			System.out.println("Columnas: "+ matriz1[0].length);//de la fila creo trae el tamaño de las columnas
			ingresaValor(matriz1);
			imprimirMatriz(matriz1);
		}

}
