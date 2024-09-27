package EX02;
import EX01.Author;

public class TesteBook {
    public static void main(String[] args) {
        // Crie e aloque o array de autores
        Author[] authors = new Author[2];
        authors[0] = new Author("Autor 01", "autorum@algumacoisa.com.br", 'm');
        authors[1] = new Author("Autor 02", "autordois@outracoisa.com.br", 'f');

        // Declarar e alocar a instância de um Book
        Book testeBook = new Book("Use a Cabeca - JAVA", authors, 19.99, 99);

        // Testando o método toString do Book
        System.out.println(testeBook);
        // Saída esperada:
        // Book[name=Java for Dummy,authors={Author[name=Autor 01,email=autor01@somewhere.com.br,gender=m], Author[name=Autor 02,email=autor02@nowhere.com.br,gender=f]},price=19.99,qty=99]

        // Testando os Getters do Book
        System.out.println("Nome do livro: " + testeBook.getName());
        System.out.println("Preco: " + testeBook.getPrice());
        System.out.println("Quantidade: " + testeBook.getQty());

        // Testando os autores
        System.out.println("Autores do livro:");
        for (Author author : testeBook.getAuthors()) {
            System.out.println("Nome do autor: " + author.getName());
            System.out.println("Email do autor: " + author.getEmail());
            System.out.println("Genero do autor: " + author.getGender());
            System.out.println();
        }

        // Testando o método getAuthorNames() do Book
        System.out.println("Nomes dos autores: " + testeBook.getAuthorNames());
        // Saída esperada: Autor 01, Autor 02

        // Testando os Setters do Book
        testeBook.setPrice(29.99);
        testeBook.setQty(50);
        System.out.println("Preco atualizado: " + testeBook.getPrice());
        System.out.println("Quantidade atualizada: " + testeBook.getQty());

        // Testando o método toString do Author individualmente
        for (Author author : testeBook.getAuthors()) {
            System.out.println(author); // Saída esperada: Author[name=Autor 01,email=autor01@somewhere.com.br,gender=m], etc.
        }
    }
}
