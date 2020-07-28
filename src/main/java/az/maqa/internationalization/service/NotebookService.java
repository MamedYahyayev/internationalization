package az.maqa.internationalization.service;

import java.util.List;

import az.maqa.internationalization.dto.NotebookDTO;

public interface NotebookService {

	List<NotebookDTO> getAllNotebooks(String lang);

}
