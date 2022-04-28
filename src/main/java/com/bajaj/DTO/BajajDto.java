package com.bajaj.DTO;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class BajajDto {

	public String  status;
	public String user_id;
	public String email;
	public String roll_number;
	public List<Integer> numbers;
	public List<String> alphabets;
	
	public BajajDto() {
		// TODO Auto-generated constructor stub
	}

	public BajajDto(String status, String user_id, String email, String roll_number, List<Integer> numbers,
			List<String> alphabets) {
		super();
		this.status = status;
		this.user_id = user_id;
		this.email = email;
		this.roll_number = roll_number;
		this.numbers = numbers;
		this.alphabets = alphabets;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRoll_number() {
		return roll_number;
	}

	public void setRoll_number(String roll_number) {
		this.roll_number = roll_number;
	}

	public List<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}

	public List<String> getAlphabets() {
		return alphabets;
	}

	public void setAlphabets(List<String> alphabets) {
		this.alphabets = alphabets;
	}

	@Override
	public String toString() {
		return "BajajDto [status=" + status + ", user_id=" + user_id + ", email=" + email + ", roll_number="
				+ roll_number + ", numbers=" + numbers + ", alphabets=" + alphabets + "]";
	}
	
	
}
