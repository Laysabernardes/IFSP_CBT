

public class TesteBook {
	public static void main(String[] args) {
		// Crie e aloque o array de autores
		Author[] authors = new Author[2];
		authors[0] = new Author("Autor 01", "autor01@somewhere.com.br", 'm');
		authors[1] = new Author("Autor 02", "autor02@nowhere.com.br", 'm');

		// Declarar e alocar a instância de um book
		Book testeBook = new Book("Java for Dummy", authors, 19.99, 99);

		// Testando o método toString
		System.out.println(testeBook); // Saída esperada: Book[name=Java for Dummy,authors={Author[name=Autor 01,email=autor01@somewhere.com.br,gender=m],Author[name=Autor 02,email=autor02@nowhere.com.br,gender=m]},price=19.99,qty=99]

		// Testando os Getters
		System.out.println("Nome: " + testeBook.getName());
		System.out.println("Preço: " + testeBook.getPrice());
		System.out.println("Quantidade: " + testeBook.getQty());
		for (Author author : testeBook.getAuthors()) {
			System.out.println(author);
		}

		// Testando os Setters
		testeBook.setPrice(29.99);
		testeBook.setQty(50);
		System.out.println("Preço atualizado: " + testeBook.getPrice());
		System.out.println("Quantidade atualizada: " + testeBook.getQty());
	}
}