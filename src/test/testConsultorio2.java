package test;

import consultorioJavaUnla.Paciente;
import consultorioJavaUnla.Medico;

public class testConsultorio2 {

    public static void main(String[] args) {
        Paciente[] pacientes = new Paciente[4]; // Crear un array de Paciente con 4 elementos

        pacientes[0] = new Paciente("Jose", "Perez", 1.80f, 45f);
        pacientes[1] = new Paciente("Maria", "Lopez", 1.65f, 45f);
        pacientes[2] = new Paciente("Carlos", "Gonzalez", 1.75f, 45f);
        pacientes[3] = new Paciente("Ana", "Martinez", 1.60f, 45f);

        Paciente paciente1 = new Paciente("Jose", "Perez", 1.80f, 45f);
        Paciente paciente2 = new Paciente("Jorge", "Unla", 1.20f, 44f);
        Paciente paciente3 = new Paciente("Rober", "Ruix", 1.80f, 45f);

        Medico medico = new Medico("robeto", "NICOLA", "PSIQUIATRIA", pacientes);

        System.out.println("vista1");
        System.out.println("medico: " + medico.getNombre() + " " + medico.getApellido());
        float imc1 = medico.calcularImc(paciente1);
        System.out.println(paciente1.getNombre() + " " + paciente1.getApellido() + " " + "IMC: " + imc1);
        float imc2 = medico.calcularImc(paciente2);
        System.out.println(paciente2.getNombre() + " " + paciente2.getApellido() + " " + "IMC: " + imc2);

        System.out.println("vista2");
        paciente1.setPeso(33.3f);
        paciente2.setEstatura(1.56f);
        System.out.println("medico: " + medico.getNombre() + " " + medico.getApellido());
        imc1 = medico.calcularImc(paciente1);
        System.out.println(paciente1.getNombre() + " " + paciente1.getApellido() + " " + "IMC: " + imc1);
        imc2 = medico.calcularImc(paciente2);
        System.out.println(paciente2.getNombre() + " " + paciente2.getApellido() + " " + "IMC: " + imc2);
        System.out.println(medico.traerPromedioPeso());
        System.out.println(medico.traerPacienteMayorEstatura());
        System.out.println(medico.traerMenorImc());
    }
}
