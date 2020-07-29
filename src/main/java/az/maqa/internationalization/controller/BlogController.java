package az.maqa.internationalization.controller;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import az.maqa.internationalization.dto.BlogDTO;
import az.maqa.internationalization.response.ResponseBlog;
import az.maqa.internationalization.service.BlogService;

@RestController
@RequestMapping("/blogs")
public class BlogController {

	@Autowired
	private BlogService blogService;

	@GetMapping
	public List<ResponseBlog> getAllBlogs(@RequestParam(value = "lang", defaultValue = "az") String lang) {
		ModelMapper modelMapper = new ModelMapper();

		List<BlogDTO> blogs = blogService.getAllBlogs(lang);

		Type listType = new TypeToken<List<ResponseBlog>>() {
		}.getType();

		List<ResponseBlog> response = modelMapper.map(blogs, listType);

		return response;
	}

}
