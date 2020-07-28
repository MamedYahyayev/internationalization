package az.maqa.internationalization.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class NotebookLangEng {

	@Column(name = "description_eng")
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
