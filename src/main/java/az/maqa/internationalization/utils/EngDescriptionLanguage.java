package az.maqa.internationalization.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import az.maqa.internationalization.dto.NotebookDTO;
import az.maqa.internationalization.entity.Notebook;
import az.maqa.internationalization.repository.NotebookRepository;

@Service
public class EngDescriptionLanguage implements NotebookDescriptionLanguage {
	@Autowired
	private NotebookRepository notebookRepository;

	@Override
	public List<NotebookDTO> chooseDescriptionLang(String lang) {
		List<Notebook> notebooks = notebookRepository.findAllByActive(1);
		List<NotebookDTO> notebookDTOList = new ArrayList<NotebookDTO>();

		for (Notebook notebook : notebooks) {
			NotebookDTO notebookDTO = mapToDto(notebook);
			notebookDTO.setDescription(notebook.getDescriptionEng());
			notebookDTOList.add(notebookDTO);
		}

		return notebookDTOList;
	}

	private NotebookDTO mapToDto(Notebook notebook) {
		NotebookDTO notebookDTO = new NotebookDTO();
		notebookDTO.setId(notebook.getId());
		notebookDTO.setBrandName(notebook.getBrandName());
		notebookDTO.setMemory(notebook.getMemory());
		notebookDTO.setOperationSystem(notebook.getOperationSystem());
		notebookDTO.setProcessor(notebook.getProcessor());
		notebookDTO.setScreen(notebook.getScreen());
		notebookDTO.setActive(notebook.getActive());
		return notebookDTO;
	}
}
