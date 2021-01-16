package fr.training.spring.library.infra;
import fr.training.spring.library.domaine.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


//Implementation des methodes du domaine

@Repository
public class LibraryRepositoryImpl implements LibraryRepository {

    @Autowired
    private LibraryDAO libraryDAO;

    @Override
    public Long save(final Library library) {
        final LibraryJPA libraryJPA = libraryDAO.save (new LibraryJPA (library));
        return libraryJPA.getId ();
    }

    @Override
    public Library get(final Long id) {
        return libraryDAO.findById (id).map (LibraryJPA::toLibrary).orElseThrow (
                () -> new ExceptionNonTrouve ("Could not obtain library " + id, ErrorCode.Library_Not_Found));
    }

    @Override
    public List<Library> findAll() {
        final List<LibraryJPA> libraryJPAs = libraryDAO.findAll ();
        final List<Library> result = new ArrayList<Library> ();
        for (final LibraryJPA libraryJPA : libraryJPAs) {
            result.add (libraryJPA.toLibrary ());
        }
        return result;
    }

    @Override
    public void delete(Library library) {

    }

    @Override
    public List<Library> findLibraryByType(Type type) {
        return null;
    }

    @Override
    public List<Library> findLibraryByDirectorSurname(String surname) {
        return null;
    }
}