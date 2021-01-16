package fr.training.spring.library.domaine;


import java.util.List;



public class Library {



	private Long id;


	private Type type;


	private Address address;

	private Director director;


	private List<Book> books;

	public Library(Type type, Address address, Director director, List<Book> books) {
		this.type = type;
		this.address = address;
		this.director = director;
		this.books = books;
	}



	public void update(final Library libraryWithNewInformation) {
		type = libraryWithNewInformation.getType();
		address = libraryWithNewInformation.getAddress();
		director = libraryWithNewInformation.getDirector();
	}

	public Long getId() {
		return id;
	}

	public Type getType() {
		return type;
	}

	public Address getAddress() {
		return address;
	}

	public Director getDirector() {
		return director;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
}