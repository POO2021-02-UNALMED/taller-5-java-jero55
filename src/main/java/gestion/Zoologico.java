package gestion;
import java.util.ArrayList;


public class Zoologico {
	private String nombre;
	private String ubicacion;
	private static ArrayList<Zona> zonas = new ArrayList<Zona>();
	
	
	public Zoologico() {}
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public ArrayList<Zona> getZonas() {
		return zonas;
	}
	public void setZonas(ArrayList<Zona> zonas) {
		Zoologico.zonas = zonas;
	}
	
	//
	public static int cantidadTotalAnimales() {
		int c=0;
		for (Zona i : zonas) {
			c += i.cantidadAnimales() ;
		}
		return c;
	}
	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
}
