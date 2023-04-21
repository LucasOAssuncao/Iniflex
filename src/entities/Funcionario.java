package entities;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario extends Pessoa {
    private BigDecimal salario;
    private String funcao;

    public Funcionario(String nome, int ano, int mes, int dia, double salario, String funcao) {
        super(nome, LocalDate.of(ano, mes, dia));
        this.salario = BigDecimal.valueOf(salario);
        this.funcao = funcao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void raiseSalary() {
        this.salario = salario.add(BigDecimal.valueOf(0.1 * salario.doubleValue()));
      }
}