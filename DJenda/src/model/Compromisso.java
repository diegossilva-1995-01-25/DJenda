package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Compromisso extends Entidade implements Serializable {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 8631689982601963928L;
	
	
	private int idUsuario;
	@Id
	private int idCompromisso;
	private String nome;
	private String descricaoCompromisso;
	private Date dataCompromisso = new Date();
	private String horaCompromisso;
	private Date dataNotificacaoCompromisso = new Date();
	private String mensagemCompromisso;
	private Lugar lugar;
	private Contato contato;
	
	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdCompromisso() {
		return idCompromisso;
	}
	
	public String getDescricaoCompromisso() {
		return descricaoCompromisso;
	}
	
	public Date getDataCompromisso() {
		return dataCompromisso;
	}
	
	public String getHoraCompromisso() {
		return horaCompromisso;
	}
	
	public Date getDataNotificacaoCompromisso() {
		return dataNotificacaoCompromisso;
	}
	
	public String getMensagemCompromisso() {
		return mensagemCompromisso;
	}
	
	public void setIdCompromisso(int idCompromisso) {
		this.idCompromisso = idCompromisso;
	}
	
	public void setDescricaoCompromisso(String descricaoCompromisso) {
		this.descricaoCompromisso = descricaoCompromisso;
	}
	
	public void setDataCompromisso(Date dataCompromisso) {
		this.dataCompromisso = dataCompromisso;
	}
	
	public void setHoraCompromisso(String horaCompromisso) {
		this.horaCompromisso = horaCompromisso;
	}
	
	public void setDataNotificacaoCompromisso(Date dataNotificacaoCompromisso) {
		this.dataNotificacaoCompromisso = dataNotificacaoCompromisso;
	}
	
	public void setMensagemCompromisso(String mensagemCompromisso) {
		this.mensagemCompromisso = mensagemCompromisso;
	}

	public Lugar getLugar() {
		return lugar;
	}

	public Contato getContato() {
		return contato;
	}

	public void setLugar(Lugar lugar) {
		this.lugar = lugar;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
