package biblioteca;

//pedi pra IA fazer o main

public class Main {
    public static void main(String[] args) {
       
        Estudante aluno = new Estudante("Carlos", "15/05/2000", 12345, "Sistemas de Informação", 2023);

        
        String[] autores = {"Deitel", "Deitel"};
        Livro livroJava = new Livro("Java Como Programar", "10ª", 2016, "Pearson", autores, 5);

        
        Emprestimo emp = new Emprestimo(livroJava, aluno, "24/03/2026", "31/03/2026");

        
        System.out.println("=== SISTEMA DE BIBLIOTECA ===");
        System.out.println("Livro emprestado: " + emp.getLivro().getTitulo());
        System.out.println("Emprestado para: " + emp.getPessoa().getNome());
        System.out.println("Data de Devolução: " + emp.getDataDevolucao());
    }
}