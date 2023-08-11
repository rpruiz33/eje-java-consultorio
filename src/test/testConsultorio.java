package test;
import consultorioJavaUnla.Paciente;
public class testConsultorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paciente paciente1=new Paciente("Jose","Perez",1.80f,45f);
		Paciente paciente2=new Paciente("Jorge","Unla",1.20f,44f);
		Paciente paciente3=new Paciente("Rober","Ruix",1.80f,45f);
		System.out.println("Pacientes");
		System.out.println(paciente1.traerNombreCompleto());
		System.out.println(paciente2.traerNombreCompleto());
		System.out.println(paciente3.traerNombreCompleto());
		
	}

}
