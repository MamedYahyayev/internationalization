package az.maqa.internationalization.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Notebook extends BaseEntity {

	private static final long serialVersionUID = 5209991670342153696L;

	@Column(length = 40)
	private String brandName;

	@Column(length = 40)
	private String operationSystem;

	@ManyToOne
	@JoinColumn(name = "processor_id")
	@JsonManagedReference
	private Processor processor;

	@ManyToOne
	@JoinColumn(name = "memory_id")
	@JsonManagedReference
	private Memory memory;

	@ManyToOne
	@JoinColumn(name = "screen_id")
	@JsonManagedReference
	private Screen screen;

	private String descriptionAz;

	private String descriptionEng;

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getOperationSystem() {
		return operationSystem;
	}

	public void setOperationSystem(String operationSystem) {
		this.operationSystem = operationSystem;
	}

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public Memory getMemory() {
		return memory;
	}

	public void setMemory(Memory memory) {
		this.memory = memory;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public String getDescriptionAz() {
		return descriptionAz;
	}

	public void setDescriptionAz(String descriptionAz) {
		this.descriptionAz = descriptionAz;
	}

	public String getDescriptionEng() {
		return descriptionEng;
	}

	public void setDescriptionEng(String descriptionEng) {
		this.descriptionEng = descriptionEng;
	}

}
