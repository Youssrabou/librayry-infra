package fr.training.spring.library.application;

import java.util.List;

import fr.training.spring.library.domaine.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class LibraryService {

	@Autowired
	private LibraryRepository libraryRepository;

	public Long create(final Library newLibrary) {
		return libraryRepository.save(newLibrary);
	}

	public Library obtain(final Long id) {
		return libraryRepository.get(id);
	}

	public List<Library> listAll() {
		return libraryRepository.findAll();
	}

	public void update(final Long id, final Library libraryWithNewInformations) {
		final Library library = obtain(id);
		library.update(libraryWithNewInformations);
		libraryRepository.save(library);
	}

	public void remove(final Long id) {
		final Library library = obtain(id);
		libraryRepository.delete(library);
	}

	public List<Library> listAllByType(final Type type) {
		return libraryRepository.findLibraryByType(type);
	}

	public List<Library> listAllByDirectorName(final String surname) {
		return libraryRepository.findLibraryByDirectorSurname(surname);
	}

}