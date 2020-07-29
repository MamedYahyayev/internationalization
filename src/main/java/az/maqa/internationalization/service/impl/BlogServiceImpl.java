package az.maqa.internationalization.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import az.maqa.internationalization.dto.BlogDTO;
import az.maqa.internationalization.repository.BlogRepository;
import az.maqa.internationalization.service.BlogService;
import az.maqa.internationalization.utils.BlogLanguage;

@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogRepository blogRepository;

	@Autowired
	private BlogLanguage blogLanguage;

	@Override
	public List<BlogDTO> getAllBlogs(String lang) {
		List<BlogDTO> returnValue = blogLanguage.chooseBlogLanguage(lang);
		return returnValue;
	}

}
