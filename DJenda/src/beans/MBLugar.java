package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import control.CtrlLugar;
import model.Lugar;
import services.MBGenerico;

@ManagedBean(name="mbLugar")
@SessionScoped
public class MBLugar extends MBGenerico implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8391767840131377089L;
	
	private CtrlLugar cLug = new CtrlLugar();
	private Lugar ultLug = new Lugar();
	private List<Lugar> listaLug = new ArrayList<>();
		
	public Lugar getUltLug() {
		return ultLug;
	}

	public List<Lugar> getListaLug() {
		return listaLug;
	}

	public void setUltLug(Lugar ultLug) {
		this.ultLug = ultLug;
	}

	public void setListaLug(List<Lugar> listaLug) {
		this.listaLug = listaLug;
	}

	@Override
	public String adicionar() {
		// TODO Auto-generated method stub
		cLug.adicionar(ultLug);
		ultLug = new Lugar();
		FacesMessage fmsg = new FacesMessage("Lugar salvo");
		FacesContext.getCurrentInstance().addMessage(null, fmsg);
		
		return "";
	}

	@Override
	public String alterar() {
		// TODO Auto-generated method stub
		cLug.alterar(ultLug);
		ultLug = new Lugar();
		FacesMessage fmsg = new FacesMessage("Lugar alterado");
		FacesContext.getCurrentInstance().addMessage(null, fmsg);
		
		return "";
	}

	@Override
	public String consultar() {
		// TODO Auto-generated method stub
		setListaLug(cLug.consultar(ultLug.getNome()));
		
		FacesMessage fmsg = new FacesMessage("Pesquisa efetuada, encontrados " +
				getListaLug().size() + " resultados");
		FacesContext.getCurrentInstance().addMessage(null, fmsg);
		
		return "";
	}

	@Override
	public String excluir() {
		// TODO Auto-generated method stub
		cLug.excluir(ultLug);
		ultLug = new Lugar();
		FacesMessage fmsg = new FacesMessage("Lugar deletado");
		FacesContext.getCurrentInstance().addMessage(null, fmsg);
		
		return "";
	}

	@Override
	public String relatorioTodos() {
		// TODO Auto-generated method stub
		setListaLug(cLug.relatorioTodos());
		
		FacesMessage fmsg = new FacesMessage("Pesquisa efetuada, encontrados " +
				getListaLug().size() + " resultados");
		FacesContext.getCurrentInstance().addMessage(null, fmsg);
		
		return "";
	}

	
}
