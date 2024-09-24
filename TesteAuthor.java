public class TesteAuthor {
	public static void main(String[] args) {
		// Testando o construtor
		Author author = new Author("Wellington Tuler", "tulermoraes@yahoo.com", 'm');
		
		// Testando o método toString
		System.out.println(author.toString()); // Saída esperada: Author[name=Wellington Tuler,email=tulermoraes@yahoo.com,gender=m]
		
		// Testando os Getters
		System.out.println("Nome: " + author.getName());
		System.out.println("Email: " + author.getEmail());
		System.out.println("Gênero: " + author.getGender());
		
		// Testando o Setter para email
		author.setEmail("novoemail@gmail.com");
		System.out.println("Email atualizado: " + author.getEmail());
	}
}
