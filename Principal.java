package ExerciciosPOO1;

public class Principal {
    public static void main(String[] args) {
        Funcionario fc = new Funcionario("Luciano", (double) 52.362102, 40, "Supervisor");
        System.out.println("\n");
        AssistenteAdministrativos assAdm = new AssistenteAdministrativos("Jailsom", 63.854965,49,"AssistenteAdministrativos","Luciano",2179802,"5 Horas","0 Horas","3 Horas");
        System.out.println("\n");
        AssistenteTecnico assTec = new AssistenteTecnico("Ketelen", 85.421630,30,"AssistenteTecnico","Luciano",53621410,900);
        System.out.println("\n");

        System.out.println(fc.toString());
        System.out.println(assAdm.toString());
        System.out.println(assTec.toString());


    }
}
