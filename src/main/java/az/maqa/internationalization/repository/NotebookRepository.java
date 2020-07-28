package az.maqa.internationalization.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import az.maqa.internationalization.entity.Notebook;

@Repository
public interface NotebookRepository extends CrudRepository<Notebook, Long> {

	List<Notebook> findAllByActive(Integer active);

}
