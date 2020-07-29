package az.maqa.internationalization.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Language extends BaseEntity {

	private static final long serialVersionUID = 6828744183177221605L;

	@Column(name = "language", length = 40)
	private String languageName;

	@Column(length = 15)
	private String languageCode;

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

}
