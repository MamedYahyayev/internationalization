package az.maqa.internationalization.utils;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import az.maqa.internationalization.dto.BlogDTO;
import az.maqa.internationalization.entity.Blog;
import az.maqa.internationalization.entity.Language;
import az.maqa.internationalization.repository.BlogRepository;
import az.maqa.internationalization.repository.LanguageRepository;

@Service
public class ChooseBlogLanguage implements BlogLanguage {

	@Autowired
	private LanguageRepository languageRepository;

	@Autowired
	private BlogRepository blogRepository;

	@Override
	public List<BlogDTO> chooseBlogLanguage(String lang) {
		ModelMapper modelMapper = new ModelMapper();
		Language language = languageRepository.findByLanguageCode(lang);

		List<Blog> blogs = blogRepository.findAllByActiveAndLanguage(1, language);

		Type listType = new TypeToken<List<BlogDTO>>() {
		}.getType();
		List<BlogDTO> blogDTO = modelMapper.map(blogs, listType);

		return blogDTO;
	}

}
