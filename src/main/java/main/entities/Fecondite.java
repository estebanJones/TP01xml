package main.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name="fecondite")
@XmlAccessorType(XmlAccessType.FIELD)
public class Fecondite {
	@XmlAttribute
	private String relation;
	@XmlValue
	private String value;
	
	public Fecondite() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
}
