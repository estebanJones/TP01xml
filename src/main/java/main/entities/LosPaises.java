package main.entities;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="pays")
@XmlAccessorType(XmlAccessType.FIELD)
public class LosPaises {
	@XmlElement(name="un_pays")
	private List<Pays> pays = new ArrayList<>();
	
	
	public LosPaises() {
		// TODO Auto-generated constructor stub
	}
	
	public LosPaises(List<Pays> pays) {
		super();
		this.pays = pays;
	}

	public List<Pays> getPays() {
		return pays;
	}

	public void setPays(List<Pays> pays) {
		this.pays = pays;
	}
	
	
	
}
