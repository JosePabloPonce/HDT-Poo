import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Paciente implements Comparable<Paciente> {
	
	
	private String nombre;
	private String problema;
	private String prioridad;
	
	
	public Paciente(String nombre, String problema, String prioridad) {
		this.nombre = nombre;
		this.problema = problema;
		this.prioridad = prioridad;
	}
	
	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getProblema() {
		return problema;
	}




	public void setProblema(String problema) {
		this.problema = problema;
	}




	public String getPrioridad() {
		return prioridad;
	}




	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}




	@Override 
	public int compareTo(Paciente arg0) {
		// TODO Auto-generated method stub
		return arg0.getPrioridad().compareTo(prioridad)*-1;
	} 
	

}
