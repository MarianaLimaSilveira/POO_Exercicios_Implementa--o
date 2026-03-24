package folhapagamento;

import java.util.List;

public class FolhaDePagamento {
    
    public static void processarPagamentos(List<Funcionario> funcionarios) {
        System.out.println("=== PROCESSANDO FOLHA DE PAGAMENTO ===");
        for (Funcionario f : funcionarios) {
            System.out.println("Funcionário: " + f.getNome() + " | Salário: R$ " + f.calcularSalario());
        }
        System.out.println("======================================");
    }
}
