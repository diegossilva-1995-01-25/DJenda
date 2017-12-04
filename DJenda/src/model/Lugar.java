package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Lugar extends Entidade implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -506398832159957214L;

	private int idUsuario;
	@Id
	private int idLugar;
	private String endereco;
	private String bairro;
	private String cidade;
	private String tipoLugar;
	private String descricao;
	
	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdLugar() {
		return idLugar;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public String getTipoLugar() {
		return tipoLugar;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setIdLugar(int idLugar) {
		this.idLugar = idLugar;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public void setTipoLugar(String tipoLugar) {
		this.tipoLugar = tipoLugar;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
