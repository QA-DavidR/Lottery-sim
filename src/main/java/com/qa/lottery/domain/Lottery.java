package com.qa.lottery.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lottery {
	
	@Id // PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO INCREMENT
	private Long ticket_id;
	
	private String firstName;
	private String lastName;
	private String email;
	private String gender;
	private String address;
	private String postcode;
	private int ticketsBought;
	
	private List<Integer> numbersChosen;
	private List<Integer> randomlyChosen;
	
	
	public Lottery() {
		
	}
	
	
	public Lottery(Long ticket_id, String firstName, String lastName, String email, String gender, String address,
			String postcode, int ticketsBought, List<Integer> numbersChosen, List<Integer> randomlyChosen) {
		super();
		this.ticket_id = ticket_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.address = address;
		this.postcode = postcode;
		this.ticketsBought = ticketsBought;
		this.numbersChosen = numbersChosen;
		this.randomlyChosen = randomlyChosen;
	}
	
	
	public Long getTicket_id() {
		return ticket_id;
	}
	public void setTicket_id(Long ticket_id) {
		this.ticket_id = ticket_id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public int getTicketsBought() {
		return ticketsBought;
	}
	public void setTicketsBought(int ticketsBought) {
		this.ticketsBought = ticketsBought;
	}
	public List<Integer> getNumbersChosen() {
		return numbersChosen;
	}
	public void setNumbersChosen(List<Integer> numbersChosen) {
		this.numbersChosen = numbersChosen;
	}
	public List<Integer> getRandomlyChosen() {
		return randomlyChosen;
	}
	public void setRandomlyChosen(List<Integer> randomlyChosen) {
		this.randomlyChosen = randomlyChosen;
	}
	

}


