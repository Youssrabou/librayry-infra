package fr.training.spring.library.infra;

import java.util.List;

import fr.training.spring.library.domaine.Library;
import fr.training.spring.library.domaine.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface LibraryDAO extends JpaRepository<LibraryJPA, Long> {

	//Dans le DAO on mentionne les requetes qui seront utilisees dans l'implementation (RepositoryImpl)

	List<LibraryJPA> findLibraryJPAByType(Type type);

	List<LibraryJPA> findLibraryJPAByDirectorSurname(String surname);

}