package models;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	
	@Column(name = "username", length = 100, nullable = false, unique = true)
	private String user_name;
	
	@Column(nullable = false)
	@Size(min = 8, message = "sua senha deve conter no minimo 8 caracteres")
	private String passwordHash;
	
	@Column(length = 11, nullable = false, unique = true)
	private String cpf;
	
	@Column(length = 100, nullable = false)
	private String address;

	public User(){}
	
	public long getId() {
		return id;
	}

	public String getPassword() {
		return passwordHash;
	}

	public void setPassword(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, cpf, id, passwordHash, user_name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(address, other.address) && Objects.equals(cpf, other.cpf) && id == other.id
				&& Objects.equals(passwordHash, other.passwordHash) && Objects.equals(user_name, other.user_name);
	}
	
			
}
	
	
	
	

