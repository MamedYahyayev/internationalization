package az.maqa.internationalization.utils;

import java.util.List;

import az.maqa.internationalization.dto.BlogDTO;

public interface BlogLanguage {

	List<BlogDTO> chooseBlogLanguage(String lang);

}
