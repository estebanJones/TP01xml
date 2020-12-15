package main.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import main.entities.adapter.DateAdapter;

@XmlRootElement(name="donnees_demographique")
@XmlAccessorType(XmlAccessType.FIELD)
public class DateReleve {
	@XmlAttribute(name="format")
	private String format;
	@XmlValue
	@XmlJavaTypeAdapter(DateAdapter.class)
	private String value;
	
	public DateReleve() {
		
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}
