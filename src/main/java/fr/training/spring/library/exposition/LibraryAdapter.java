package fr.training.spring.library.exposition;

import fr.training.spring.library.domaine.Address;
import fr.training.spring.library.domaine.Book;
import fr.training.spring.library.domaine.Director;
import fr.training.spring.library.domaine.Library;

import java.util.List;
import java.util.stream.Collectors;

public class LibraryAdapter {

    private LibraryAdapter() {
    }

    public static Library transformToLibrary(final LibraryDto libraryDto) {
        final Address address = new Address(libraryDto.addressDTO.number, //
                libraryDto.addressDTO.street, //
                libraryDto.addressDTO.postalCode, //
                libraryDto.addressDTO.city);

        final Director director = new Director(libraryDto.directorDTO.surname, libraryDto.directorDTO.name);

        return new Library(libraryDto.type, address, director, transformToBook(libraryDto.bookDtoList));
    }

    public static List<Book> transformToBook(final List<BookDto> bookDTO) {
        return bookDTO.stream().map(b -> new Book(b.isbn, b.title, b.numberOfPage,b.author, b.literaryGenre))
                .collect(Collectors.toList());
    }

    public static LibraryDto adaptToBookDTO(final Library library) {
        return new LibraryDto (library.getType (),
                new AddressDto (library.getAddress ().getNumber (), library.getAddress ().getStreet (),
                        library.getAddress ().getPostalCode (), library.getAddress ().getCity ()),
                new DirectorDto (library.getDirector ().getSurname (), library.getDirector ().getName ()),
                LibraryAdapter.adaptToBookListDTO (library.getBooks ()));

    }

    public static List<LibraryDto> adaptToLibraryDTO( List<Library> libraries) {
        return libraries.stream().map(LibraryAdapter::adaptToBookDTO).collect(Collectors.toList());
    }

    public static List<BookDto> adaptToBookListDTO( List<Book> books) {
        return books.stream().map(LibraryAdapter::adaptToBookDTO).collect(Collectors.toList());
    }

    public static BookDto adaptToBookDTO(final Book book) {
        return new BookDto(book.getIsbn(), book.getTitle(), book.getAuthor(), book.getNumberOfPage(),
                book.getLiteraryGenre());
    }

}
