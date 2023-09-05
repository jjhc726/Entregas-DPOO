package uniandes.dpoo.taller2.modelo;

public class Pedido {
	
	private int id;
	
	private String nombre;
	
	private String direccion;
	
	public Pedido(int ID,  String NOMBRE, String DIRECCION)
	{
		this.id = ID;
		this.nombre = NOMBRE;
		this.direccion = DIRECCION;
	}
	
	
	public int darID()
	{
		return id;
	}
	
	public String darNombre()
	{
		return nombre;
	}
	
	public String darDireccion()
	{
		return direccion;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
