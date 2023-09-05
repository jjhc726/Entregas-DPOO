package uniandes.dpoo.taller2.modelo;

import uniandes.dpoo.taller2.modelo.*;
import java.util.*;


public class Restaurante {
	
	
	public static void iniciarPedido(String Nombre, String Direccion, int numPedidos)
	{
		int id = numPedidos;
		Pedido pedido = new Pedido(id, Nombre, Direccion);
		
	}

}
