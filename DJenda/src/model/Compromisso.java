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
	private String descricao;
	private Date dataCompromisso = new Date();
	private String hora;
	private Date dataNotificacao = new Date();
	private String mensagem;
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
	
	public String getDescricao() {
		return descricao;
	}
	
	public Date getDataCompromisso() {
		return dataCompromisso;
	}
	
	public String getHora() {
		return hora;
	}
	
	public Date getDataNotificacao() {
		return dataNotificacao;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	public void setIdCompromisso(int idCompromisso) {
		this.idCompromisso = idCompromisso;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setDataCompromisso(Date dataCompromisso) {
		this.dataCompromisso = dataCompromisso;
	}
	
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	public void setDataNotificacao(Date dataNotificacao) {
		this.dataNotificacao = dataNotificacao;
	}
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
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
	
	
	
}
