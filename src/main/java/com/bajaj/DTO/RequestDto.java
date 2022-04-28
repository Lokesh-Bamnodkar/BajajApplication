package com.bajaj.DTO;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class RequestDto {

	public List<String> data;
	
	public RequestDto() {
		// TODO Auto-generated constructor stub
	}

	public List<String> getData() {
		return data;
	}

	public void setData(List<String> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "RequestDto [data=" + data + "]";
	}
	
}
