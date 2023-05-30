package ExerciciosPOO1;

public class AssistenteAdministrativos extends Assistente{
    public String turnoDia;
    public String turnoNoite;
    public String noturno;
    public AssistenteAdministrativos(String nome, Double cpf, double idade, String funcaoExerce, String nomeChef, Integer matriculas,String turnoDia,String turnoNoite,String noturno) {
        super(nome,cpf,idade,funcaoExerce,nomeChef,matriculas);
        this.turnoDia = turnoDia;
        this.turnoNoite = turnoNoite;
        this.noturno = noturno;
    }

    @Override
    public String toString() {
        return "AssistenteAdministrativos{" +
                "turnoDia='" + turnoDia + '\'' +
                ", turnoNoite='" + turnoNoite + '\'' +
                ", noturno='" + noturno + '\'' +
                ", nomeChef='" + nomeChef + '\'' +
                ", matriculas=" + matriculas +
                ", nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", idade=" + idade +
                ", funcaoExerce='" + funcaoExerce + '\'' +
                '}';
    }

    public String getTurnoDia() {
        return turnoDia;
    }

    public void setTurnoDia(String turnoDia) {
        this.turnoDia = turnoDia;
    }

    public String getTurnoNoite() {
        return turnoNoite;
    }

    public void setTurnoNoite(String turnoNoite) {
        this.turnoNoite = turnoNoite;
    }

    public String getNoturno() {
        return noturno;
    }

    public void setNoturno(String noturno) {
        this.noturno = noturno;
    }

    @Override
    public void ganhoAnual() {

    }
}
