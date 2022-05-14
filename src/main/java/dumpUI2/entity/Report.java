package dumpUI2.entity;

import java.io.Serializable;

public class Report implements Serializable, Comparable<Report>, Cloneable {
	private String name;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int compareTo(Report arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
