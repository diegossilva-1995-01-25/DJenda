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
	private String emailUsuario;
	private String nome;
	private String senhaUsuario;
	private String dataNascimentoUsuario;
	private String nickUsuario;
	private String fraseDeDicaUsuario;
	
	public int getIdUsuario() {
		return idUsuario;
	}
	
	public String getEmailUsuario() {
		return emailUsuario;
	}
	
	public String getSenhaUsuario() {
		return senhaUsuario;
	}
	
	public String getDataNascimentoUsuario() {
		return dataNascimentoUsuario;
	}
	
	public String getNickUsuario() {
		return nickUsuario;
	}
	
	public String getFraseDeDicaUsuario() {
		return fraseDeDicaUsuario;
	}
	
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}
	
	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}
	
	public void setDataNascimentoUsuario(String dataNascimentoUsuario) {
		this.dataNascimentoUsuario = dataNascimentoUsuario;
	}
	
	public void setNickUsuario(String nickUsuario) {
		this.nickUsuario = nickUsuario;
	}
	
	public void setFraseDeDicaUsuario(String fraseDeDicaUsuario) {
		this.fraseDeDicaUsuario = fraseDeDicaUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
