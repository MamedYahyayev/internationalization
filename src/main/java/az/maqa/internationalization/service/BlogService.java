package az.maqa.internationalization.service;

import java.util.List;

import az.maqa.internationalization.dto.BlogDTO;

public interface BlogService {

	List<BlogDTO> getAllBlogs(String lang);

}
