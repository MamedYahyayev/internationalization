package az.maqa.internationalization.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import az.maqa.internationalization.dto.NotebookDTO;
import az.maqa.internationalization.service.NotebookService;
import az.maqa.internationalization.utils.AzDescriptionLanguage;
import az.maqa.internationalization.utils.EngDescriptionLanguage;

@Service
public class NotebookServiceImpl implements NotebookService {

	@Autowired
	private AzDescriptionLanguage descriptionLangAz;

	@Autowired
	private EngDescriptionLanguage descriptionLangEn;

	@Override
	public List<NotebookDTO> getAllNotebooks(String lang) {
		List<NotebookDTO> returnValue = new ArrayList<NotebookDTO>();

		returnValue = choosingDescriptionLang(lang, returnValue);

		return returnValue;
	}

	private List<NotebookDTO> choosingDescriptionLang(String lang, List<NotebookDTO> returnValue) {
		switch (lang) {
		case "az":
			returnValue = descriptionLangAz.chooseDescriptionLang(lang);
			break;
		case "en":
			returnValue = descriptionLangEn.chooseDescriptionLang(lang);
			break;
		default:
			returnValue = descriptionLangAz.chooseDescriptionLang(lang);
			break;
		}
		return returnValue;
	}

}
