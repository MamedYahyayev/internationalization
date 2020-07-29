package az.maqa.internationalization.repository;

import org.springframework.data.repository.CrudRepository;

import az.maqa.internationalization.entity.Language;

public interface LanguageRepository extends CrudRepository<Language, Long> {

	Language findByLanguageCode(String lang);

}
