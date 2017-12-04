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
	private String nome;
	private String enderecoLugar;
	private String bairroLugar;
	private String cidadeLugar;
	private String tipoLugar;
	private String descricaoLugar;
	
	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdLugar() {
		return idLugar;
	}
	
	public String getEnderecoLugar() {
		return enderecoLugar;
	}
	
	public String getBairroLugar() {
		return bairroLugar;
	}
	
	public String getCidadeLugar() {
		return cidadeLugar;
	}
	
	public String getTipoLugar() {
		return tipoLugar;
	}
	
	public String getDescricaoLugar() {
		return descricaoLugar;
	}
	
	public void setIdLugar(int idLugar) {
		this.idLugar = idLugar;
	}
	
	public void setEnderecoLugar(String enderecoLugar) {
		this.enderecoLugar = enderecoLugar;
	}
	
	public void setBairroLugar(String bairroLugar) {
		this.bairroLugar = bairroLugar;
	}
	
	public void setCidadeLugar(String cidadeLugar) {
		this.cidadeLugar = cidadeLugar;
	}
	
	public void setTipoLugar(String tipoLugar) {
		this.tipoLugar = tipoLugar;
	}
	
	public void setDescricaoLugar(String descricaoLugar) {
		this.descricaoLugar = descricaoLugar;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
