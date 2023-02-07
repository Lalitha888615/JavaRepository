package com.capg.entity;


import java.time.LocalDate;
import javax.persistence.*;

@Entity
@Table(name="booking")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="booking_id")
	private long id;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User users;
	
	
	
	@Column(name="date")
	private LocalDate date;
	
	//@JoinColumn(name="show_time")
	//private Shows shows;
	
	public Booking() {}
	public Booking(long id, User users, LocalDate date) {
		super();
		this.id = id;
		this.users = users;
		this.date = date;
	}


	public long getId() {
		return id;
	}



	



	public User getUsers() {
		return users;
	}



	public LocalDate getDate() {
		return date;
	}



	public void setId(long id) {
		this.id = id;
	}



	public void setUsers(User users) {
		this.users = users;
	}



	public void setDate(LocalDate date) {
		this.date = date;
	}



	@Override
	public String toString() {
		return "Booking [id=" + id + ", users=" + users + ", bookedDate=" + date + "]";
	}




	

	

	
	
	


}
