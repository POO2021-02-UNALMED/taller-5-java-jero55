package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal {
	
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {listado.add(this);totalAnimales++;}
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
		totalAnimales++;
	}
	public static ArrayList<Pez> getListado() {
		return listado;
	}
	public static void setListado(ArrayList<Pez> listado) {
		Pez.listado = listado;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	
	//
	
	public static Pez crearSalmon(String nombre,int edad,String genero) {
		salmones++;
		return new Pez(nombre,edad,"oceano",genero,"rojo",6);
	}
	
	public static Pez crearBacalao(String nombre,int edad,String genero) {
		bacalaos++;
		return new Pez(nombre,edad,"oceano",genero,"gris",6);
	}
	
	public static int cantidadPeces() {
		return listado.size();
	}
	public String movimiento() {
		return "nadar";	
}
}
