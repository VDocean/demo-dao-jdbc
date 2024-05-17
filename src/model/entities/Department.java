package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable{
	//serializable é o processo no qual um objeto é transformado 
	//em uma sequencia de bytes que é util quando trafegamos objetos 
	//pela rede, salvar no disco, etc.
	
	private Integer id;
	private String name;
	
	public Department() {
		
	}

	public Department(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
	

}
