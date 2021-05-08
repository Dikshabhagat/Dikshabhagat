package com.intense.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Columns_Fields {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	
	private String name;
	
	private String type;

	public void setName(String cName) {
		// TODO Auto-generated method stub
		
	}

	public void setType(String cType) {
		// TODO Auto-generated method stub
		
	}

	public void setName1(String cName) {
		// TODO Auto-generated method stub
		
	}
	
}
