package consultorioJavaUnla;

public class Medico {
	private String nombre;
	private String apellido;
	private String especilidad;
	
	
	
	
	public Medico(String nombre, String apellido, String especilidad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.especilidad = especilidad;
	}


	public float calcularImc(Paciente paciente) {
		
		float calculo = paciente.getPeso() / (paciente.getEstatura() * paciente.getEstatura());
		return calculo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getEspecilidad() {
		return especilidad;
	}


	public void setEspecilidad(String especilidad) {
		this.especilidad = especilidad;
	}
}
