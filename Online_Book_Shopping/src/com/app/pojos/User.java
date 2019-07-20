package com.app.pojos;
import javax.persistence.*;
@Entity
@Table(name="user")
public class User{
	
	private Integer userId,customerId;
	private String username,password;
	private boolean enabled;
	
	@Id
	@GeneratedValue
	@Column(name="user_id")
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	@Column(name="customer_id")
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	@Column(name="username")
	public String getUserName() {
		return username;
	}
	public void setUserName(String username) {
		this.username = username;
	}
	@Column(name="password")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name="Enabled")
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	
}
