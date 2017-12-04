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
	private String nome;
	private String tipoContato;
	private String ondeConheciContato;
	private String organizacaoContato;
	private Date dataNascimentoContato;
	private String emailContato;
	private String telefoneContato;
	
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
	
	public String getOndeConheciContato() {
		return ondeConheciContato;
	}
	
	public String getOrganizacaoContato() {
		return organizacaoContato;
	}
	
	public Date getDataNascimentoContato() {
		return dataNascimentoContato;
	}
	
	public String getEmailContato() {
		return emailContato;
	}
	
	public String getTelefoneContato() {
		return telefoneContato;
	}
	
	public void setIdContato(int idContato) {
		this.idContato = idContato;
	}
	
	public void setTipoContato(String tipoContato) {
		this.tipoContato = tipoContato;
	}
	
	public void setOndeConheciContato(String ondeConheciContato) {
		this.ondeConheciContato = ondeConheciContato;
	}
	
	public void setOrganizacaoContato(String organizacaoContato) {
		this.organizacaoContato = organizacaoContato;
	}
	
	public void setDataNascimentoContato(Date dataNascimentoContato) {
		this.dataNascimentoContato = dataNascimentoContato;
	}
	
	public void setEmailContato(String emailContato) {
		this.emailContato = emailContato;
	}
	
	public void setTelefoneContato(String telefoneContato) {
		this.telefoneContato = telefoneContato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
