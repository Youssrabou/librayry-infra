package fr.training.spring.library.domaine;

import org.springframework.stereotype.Repository;

import java.util.List;


//Definir les méthodes dans le domaine pour les implémenter dans l'infra
//Le repository définition a chercher

public interface LibraryRepository {

        Long save(Library library);

        Library get(Long id);

        List<Library> findAll();

        void delete(Library library);

        List<Library> findLibraryByType(Type type);

        List<Library> findLibraryByDirectorSurname(String surname);
}

