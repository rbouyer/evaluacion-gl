package com.globallogic.evaluacion.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.UUID;

@Entity
@Table(name = "phones")
public class Phone {

		public Phone() {
		super();
		}
		
		public Phone(Long number, Integer citycode, String contrycode, User user) {
			super();
			this.number = number;
			this.citycode = citycode;
			this.contrycode = contrycode;
			this.user = user;
		}


		@Id
		@GeneratedValue
		private UUID id;
		
		private Long number;
		
		private Integer citycode;
		
		private String contrycode;
		
		@JoinColumn(name="user_id", referencedColumnName="id")
		@ManyToOne()
		private User user;
		
		@JsonIgnore
		public UUID getId() {
			return id;
		}
		@JsonIgnore
		public void setId(UUID id) {
			this.id = id;
		}

		public Long getNumber() {
			return number;
		}
		public void setNumber(Long number) {
			this.number = number;
		}
		public Integer getCitycode() {
			return citycode;
		}
		public void setCitycode(Integer citycode) {
			this.citycode = citycode;
		}
		public String getContrycode() {
			return contrycode;
		}
		public void setContrycode(String contrycode) {
			this.contrycode = contrycode;
		}

		@JsonIgnore
		public User getUser() {
			return user;
		}
		@JsonIgnore
		public void setUser(User user) {
			this.user = user;
		}
		
		
}
