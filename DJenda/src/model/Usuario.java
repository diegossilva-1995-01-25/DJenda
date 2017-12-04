package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario extends Entidade implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2748837857727564816L;

	@Id
	private int idUsuario;
	private String email;
	private String senha;
	private String dataNascimento;
	private String nick;
	private String fraseDeDica;
	
	public int getIdUsuario() {
		return idUsuario;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public String getNick() {
		return nick;
	}
	
	public String getFraseDeDica() {
		return fraseDeDica;
	}
	
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public void setNick(String nick) {
		this.nick = nick;
	}
	
	public void setFraseDeDica(String fraseDeDica) {
		this.fraseDeDica = fraseDeDica;
	}
	
	
	
}
