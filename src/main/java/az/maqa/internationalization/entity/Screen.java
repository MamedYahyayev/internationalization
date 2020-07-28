package az.maqa.internationalization.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Screen extends BaseEntity {

	private static final long serialVersionUID = 4294015958142025135L;

	private Double screenSize;

	@Column(length = 50)
	private String screenResolution;

	@Column(length = 40)
	private String screenType;

	@Column(length = 40)
	private String videoCartModel;

	@OneToMany(mappedBy = "screen")
	@JsonBackReference
	private List<Notebook> notebooks = new ArrayList<>();

	public List<Notebook> getNotebooks() {
		return notebooks;
	}

	public void setNotebooks(List<Notebook> notebooks) {
		this.notebooks = notebooks;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	public String getScreenResolution() {
		return screenResolution;
	}

	public void setScreenResolution(String screenResolution) {
		this.screenResolution = screenResolution;
	}

	public String getScreenType() {
		return screenType;
	}

	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}

	public String getVideoCartModel() {
		return videoCartModel;
	}

	public void setVideoCartModel(String videoCartModel) {
		this.videoCartModel = videoCartModel;
	}

}
