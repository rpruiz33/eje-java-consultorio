package test;

import consultorioJavaUnla.Paciente;
import consultorioJavaUnla.Medico;

public class testConsultorio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paciente paciente1=new Paciente("Jose","Perez",1.80f,45f);
		Paciente paciente2=new Paciente("Jorge","Unla",1.20f,44f);
		Paciente paciente3=new Paciente("Rober","Ruix",1.80f,45f);
		Medico medico = new  Medico("robeto","NICOLA","PSIQUIATRIA");
		
		System.out.println("vista1");
		System.out.println("medico: "+medico.getNombre()+" "+medico.getApellido());
		float imc1=medico.calcularImc(paciente1);
		System.out.println(paciente1.getNombre()+" "+paciente1.getNombre()+" "+"IMC: "+imc1);
		float imc2=medico.calcularImc(paciente2);
		System.out.println(paciente2.getNombre()+" "+paciente2.getNombre()+" "+"IMC: "+imc2);
		
		System.out.println("vista2");
		paciente1.setPeso(33.3f);
		paciente2.setEstatura(1.56f);
		System.out.println("medico: "+medico.getNombre()+" "+medico.getApellido());
		imc1=medico.calcularImc(paciente1);
		System.out.println(paciente1.getNombre()+" "+paciente1.getNombre()+" "+"IMC: "+imc1);
		imc2=medico.calcularImc(paciente2);
		System.out.println(paciente2.getNombre()+" "+paciente2.getNombre()+" "+"IMC: "+imc2);

	}

}
