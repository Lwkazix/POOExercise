package ExerciciosPOO1;

public class AssistenteTecnico extends Assistente{
    private int bonusSalarial;
    public AssistenteTecnico(String nome, Double cpf, double idade, String funcaoExerce, String nomeChef, Integer matriculas,int bonusSalarial) {
        super(nome,cpf,idade,funcaoExerce,nomeChef,matriculas);
        this.bonusSalarial = bonusSalarial;

    }

    @Override
    public String toString() {
        return "AssistenteTecnico{" +
                "nomeChef='" + nomeChef + '\'' +
                ", matriculas=" + matriculas +
                ", nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", idade=" + idade +
                ", funcaoExerce='" + funcaoExerce + '\'' +
                '}';
    }

    public int getBonusSalarial() {
        return bonusSalarial;
    }

    public void setBonusSalarial(int bonusSalarial) {
        this.bonusSalarial = bonusSalarial;
    }
    @Override
    public void ganhoAnual(){


    }
}
