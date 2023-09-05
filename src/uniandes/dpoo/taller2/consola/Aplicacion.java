package uniandes.dpoo.taller2.consola;

import uniandes.dpoo.taller2.procesamiento.ReadFile;
import uniandes.dpoo.taller2.modelo.Restaurante;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;



public class Aplicacion {
	List<List<String>> Combos = new ArrayList<>();
	List<List<String>> Ingredientes = new ArrayList<>();
	List<List<String>> Menu = new ArrayList<>();
	int numPedidos = 0;
	Scanner entrada = new Scanner(System.in);
	public void ejecutarAplicacion()
	{
		System.out.print("Tienda de hamburguesas\n");
		
		boolean continuar = true;
		while (continuar)
		{
			try
			{
				mostrarOpciones();
				int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
				if (opcion_seleccionada == 1)
					ejecutarMostrarMenu();
				else if (opcion_seleccionada == 2)
					ejecutarIniciarPedido();
				else if (opcion_seleccionada == 3)
					ejecutarAgregarElemento();
				/*else if (opcion_seleccionada == 4)
					ejecutarAtletasPorPais();
				else if (opcion_seleccionada == 5)
					ejecutarPaisConMasMedallistas();*/
				else if (opcion_seleccionada == 6)
				{
					System.out.println("Saliendo de la aplicación ...");
					continuar = false;
				}
			}
			catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los números de las opciones.");
			}
		}
		
	}
	private String input(String mensaje) {
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}
	public void mostrarOpciones()
	{
		System.out.println("\nOpciones de la aplicación\n");
		System.out.println("1. Mostrar Menu");
		System.out.println("2. Iniciar un nuevo pedido");
		System.out.println("3. Agregar un elemento a un pedido");
		System.out.println("4. Cerrar un pedido y guardar la factura");
		System.out.println("5. Consultar la información de un pedido dado su id");
		System.out.println("6. Finalizar el programa");
	}
	private void ejecutarMostrarMenu()
	{
		Combos = ReadFile.main(null);
		Ingredientes = ReadFile.ingredientes(null);
		Menu = ReadFile.menu(null);
	}
	private void ejecutarIniciarPedido()
	{
		numPedidos++;
		
		System.out.println("Por favor ingrese su nombre: ");
		String nombre = entrada.nextLine();
		System.out.println("Por favor ingrese su direccion: ");
		String direccion = entrada.nextLine();
		Restaurante.iniciarPedido(nombre, direccion, numPedidos);

	}
	private void ejecutarAgregarElemento()
	{
		System.out.println("Por favor ingrese el id de su pedido: ");
		int id = entrada.nextInt();
		
		System.out.println("\nSeleccione que quiere añadir a su pedido\n");
		System.out.println("1. Combos");
		System.out.println("2. Ingredientes");
		System.out.println("3. Productos base");
		int opc = entrada.nextInt();
		if(opc==1)
		{
			int cont=0;
			for(List<String> linea:Combos)
			{
				System.out.println(cont+". "+linea.get(0));
				cont++;
			}
			List<String> comboPedido = new ArrayList<>();
			comboPedido.addAll(Combos.get(opc-1));
			
		}
		
	}
	
	public static void main(String[] args)
	{
		Aplicacion consola = new Aplicacion();
		consola.ejecutarAplicacion();
	}
}

