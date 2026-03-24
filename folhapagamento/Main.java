package folhapagamento;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> lista = new ArrayList<>();

       
        lista.add(new Funcionario("João (Padrão)", 2000.0));
        lista.add(new FuncionarioHorista("Maria (Horista)", 1500.0, 40, 50.0));
        lista.add(new FuncionarioComissionado("Pedro (Comissionado)", 1500.0, 10000.0, 0.10)); // 10% de comissão
        lista.add(new FuncionarioBonificado("Ana (Bonificada)", 2000.0, 5000.0, 0.05, 500.0));

        
        FolhaDePagamento.processarPagamentos(lista);
    }
}