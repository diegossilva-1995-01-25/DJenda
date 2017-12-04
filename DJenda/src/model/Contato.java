package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contato extends Entidade implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2125829636829080334L;

	private int idUsuario;
	@Id
	private int idContato;
	private String tipoContato;
	private String ondeConheci;
	private String organizacao;
	private Date dataNascimento;
	private String email;
	private String telefone;
	
	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdContato() {
		return idContato;
	}
	
	public String getTipoContato() {
		return tipoContato;
	}
	
	public String getOndeConheci() {
		return ondeConheci;
	}
	
	public String getOrganizacao() {
		return organizacao;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setIdContato(int idContato) {
		this.idContato = idContato;
	}
	
	public void setTipoContato(String tipoContato) {
		this.tipoContato = tipoContato;
	}
	
	public void setOndeConheci(String ondeConheci) {
		this.ondeConheci = ondeConheci;
	}
	
	public void setOrganizacao(String organizacao) {
		this.organizacao = organizacao;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
}
