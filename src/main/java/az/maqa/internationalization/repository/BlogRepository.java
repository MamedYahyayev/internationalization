package az.maqa.internationalization.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import az.maqa.internationalization.entity.Blog;
import az.maqa.internationalization.entity.Language;

@Repository
public interface BlogRepository extends CrudRepository<Blog, Long> {

	List<Blog> findAllByActiveAndLanguage(Integer active, Language language);

}
