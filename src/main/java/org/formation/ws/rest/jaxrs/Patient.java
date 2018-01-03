package org.formation.ws.rest.jaxrs;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Patient {
	private long id;
	private String name;

	public Patient() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
