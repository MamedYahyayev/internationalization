package az.maqa.internationalization.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
public class Memory extends BaseEntity {

	private static final long serialVersionUID = 811905217417638974L;

	private Float ram;

	private Float builtInMemory;

	@Column(length = 30)
	private String memoryType;

	@OneToMany(mappedBy = "memory")
	@JsonBackReference
	private List<Notebook> notebooks = new ArrayList<>();

	public Float getRam() {
		return ram;
	}

	public void setRam(Float ram) {
		this.ram = ram;
	}

	public Float getBuiltInMemory() {
		return builtInMemory;
	}

	public void setBuiltInMemory(Float builtInMemory) {
		this.builtInMemory = builtInMemory;
	}

	public String getMemoryType() {
		return memoryType;
	}

	public void setMemoryType(String memoryType) {
		this.memoryType = memoryType;
	}

	public List<Notebook> getNotebooks() {
		return notebooks;
	}

	public void setNotebooks(List<Notebook> notebooks) {
		this.notebooks = notebooks;
	}

}
