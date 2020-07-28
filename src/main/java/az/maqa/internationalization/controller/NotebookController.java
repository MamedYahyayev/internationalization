package az.maqa.internationalization.controller;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import az.maqa.internationalization.dto.NotebookDTO;
import az.maqa.internationalization.response.ResponseNotebook;
import az.maqa.internationalization.service.NotebookService;

@RestController
@RequestMapping("/notebook")
public class NotebookController {

	@Autowired
	private NotebookService notebookService;

	@GetMapping
	private List<ResponseNotebook> getAllNotebooks(@RequestParam(value = "lang" , defaultValue = "az") String lang) {
		List<ResponseNotebook> response = new ArrayList<ResponseNotebook>();

		List<NotebookDTO> notebooks = notebookService.getAllNotebooks(lang);

		ModelMapper mapper = new ModelMapper();

		Type listType = new TypeToken<List<ResponseNotebook>>() {
		}.getType();

		response = mapper.map(notebooks, listType);

		return response;
	}

}
