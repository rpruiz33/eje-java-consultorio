package consultorioJavaUnla;

public class Medico {
	private String nombre;
	private String apellido;
	private String especilidad;
	private Paciente [] pacientesFrecuentes;
	
	
	
	


	public Medico(String nombre, String apellido, String especilidad, Paciente[] pacientesFrecuentes) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.especilidad = especilidad;
		this.pacientesFrecuentes = pacientesFrecuentes;
	}


	public float calcularImc(Paciente paciente) {
		
		return (float)(paciente.getPeso() / (Math.pow(paciente.getEstatura(),2)));

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
	public double traerPromedioPeso () {
		double acum=0;
		for (int i = 0; i < pacientesFrecuentes.length; i++) {
			acum= acum+ pacientesFrecuentes[i].getPeso();
		}
		double promedio=acum/pacientesFrecuentes.length;
		return promedio;
	}
	public Paciente traerPacienteMayorEstatura() {
	    Paciente mayor = pacientesFrecuentes[0];
	    for (int i = 1; i < pacientesFrecuentes.length; i++) {
	        if (pacientesFrecuentes[i].getEstatura() > mayor.getEstatura()) {
	            mayor = pacientesFrecuentes[i];
	        }
	    }
	    return mayor;
	}

	public Paciente traerMenorImc() {
	    Paciente p1 = pacientesFrecuentes[0];
	    float menorImc = calcularImc(p1);

	    for (int i = 1; i < pacientesFrecuentes.length; i++) {
	        float imc = calcularImc(pacientesFrecuentes[i]);
	        if (imc < menorImc) {
	            menorImc = imc;
	            p1 = pacientesFrecuentes[i];
	        }
	    }
	    return p1;
	}

}
