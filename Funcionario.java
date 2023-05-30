package ExerciciosPOO1;

public class Funcionario {
    public String nome;
    public Double cpf;
    public double idade;
    public String funcaoExerce;

    public Funcionario(String nome, Double cpf, double idade, String funcaoExerce) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.funcaoExerce = funcaoExerce;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", idade=" + idade +
                ", funcaoExerce='" + funcaoExerce + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = (double) cpf;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    public String getFuncaoExerce() {
        return funcaoExerce;
    }

    public void setFuncaoExerce(String funcaoExerce) {
        this.funcaoExerce = funcaoExerce;
    }
}
