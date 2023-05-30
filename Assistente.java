package ExerciciosPOO1;

public abstract class Assistente  extends Funcionario{
    public String nomeChef;
    public  Integer matriculas;

    public Assistente(String nome, Double cpf, double idade, String funcaoExerce,String nomeChef,Integer matriculas) {
        super(nome, cpf, idade, funcaoExerce);
        this.nomeChef = nomeChef;
        this.matriculas = matriculas;
    }

    public abstract void ganhoAnual();

//    public abstract void ganhoAnual();
//
}
