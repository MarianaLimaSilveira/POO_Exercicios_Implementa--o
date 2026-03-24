package folhapagamento;

public class FuncionarioComissionado extends Funcionario {
    private double vendasMensais;
    private double percentualComissao;

    public FuncionarioComissionado() {
    }

    public FuncionarioComissionado(String nome, double salarioBase, double vendasMensais, double percentualComissao) {
        super(nome, salarioBase);
        this.vendasMensais = vendasMensais;
        this.percentualComissao = percentualComissao;
    }

    @Override
    public double calcularSalario() {
        // Salário base + a comissão sobre vendas
        return getSalarioBase() + (vendasMensais * percentualComissao);
    }

    public double getVendasMensais() {
        return vendasMensais;
    }

    public void setVendasMensais(double vendasMensais) {
        this.vendasMensais = vendasMensais;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
}