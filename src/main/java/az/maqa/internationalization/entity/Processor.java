package az.maqa.internationalization.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Processor extends BaseEntity {

	private static final long serialVersionUID = -847364256783872578L;

	@Column(length = 40)
	private String processorType;

	private Integer numberOfCores;

	private Float processorFrequency;

	@OneToMany(mappedBy = "processor")
	@JsonBackReference
	private List<Notebook> notebooks = new ArrayList<Notebook>();

	public String getProcessorType() {
		return processorType;
	}

	public void setProcessorType(String processorType) {
		this.processorType = processorType;
	}

	public int getNumberOfCores() {
		return numberOfCores;
	}

	public void setNumberOfCores(int numberOfCores) {
		this.numberOfCores = numberOfCores;
	}

	public float getProcessorFrequency() {
		return processorFrequency;
	}

	public void setProcessorFrequency(float processorFrequency) {
		this.processorFrequency = processorFrequency;
	}

	public List<Notebook> getNotebooks() {
		return notebooks;
	}

	public void setNotebooks(List<Notebook> notebooks) {
		this.notebooks = notebooks;
	}

}
