package com.intense.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
public class MyResponse {
	
	public MyResponse(String string, String string2, Object object) {
		// TODO Auto-generated constructor stub
	}
	private String message;
	private String description;
	private Object body;
	
	
	@Override
	public String toString() {
		return "MyResponse [message=" + message + ", description=" + description + ", body=" + body + "]";
	}
	
	
	
	
}
