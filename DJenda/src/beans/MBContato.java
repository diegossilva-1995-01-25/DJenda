package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import control.CtrlContato;
import model.Contato;
import services.MBGenerico;

@ManagedBean(name="mbContato")
@SessionScoped
public class MBContato extends MBGenerico implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1421697340678561964L;
	
	private CtrlContato cCont = new CtrlContato();
	private Contato ultCont = new Contato();
	List<Contato> listaCont = new ArrayList<>();
		
	public Contato getUltCont() {
		return ultCont;
	}

	public List<Contato> getListaCont() {
		return listaCont;
	}

	public void setUltCont(Contato ultCont) {
		this.ultCont = ultCont;
	}

	public void setListaCont(List<Contato> listaCont) {
		this.listaCont = listaCont;
	}

	@Override
	public String adicionar() {
		// TODO Auto-generated method stub
		cCont.adicionar(ultCont);
		ultCont = new Contato();
		FacesMessage fmsg = new FacesMessage("Contato salvo");
		FacesContext.getCurrentInstance().addMessage(null, fmsg);
		
		return "";
	}

	@Override
	public String alterar() {
		// TODO Auto-generated method stub
		cCont.alterar(ultCont);
		ultCont = new Contato();
		FacesMessage fmsg = new FacesMessage("Contato alterado");
		FacesContext.getCurrentInstance().addMessage(null, fmsg);
		
		return "";
	}

	@Override
	public String consultar() {
		// TODO Auto-generated method stub
		setListaCont(cCont.consultar(ultCont.getNome()));
		
		FacesMessage fmsg = new FacesMessage("Pesquisa efetuada, encontrados " +
				getListaCont().size() + " resultados");
		FacesContext.getCurrentInstance().addMessage(null, fmsg);
		
		return "";
	}

	@Override
	public String excluir() {
		// TODO Auto-generated method stub
		cCont.excluir(ultCont);
		ultCont = new Contato();
		FacesMessage fmsg = new FacesMessage("Contato deletado");
		FacesContext.getCurrentInstance().addMessage(null, fmsg);
		
		return "";
	}

	@Override
	public String relatorioTodos() {
		// TODO Auto-generated method stub
		setListaCont(cCont.relatorioTodos());
		
		FacesMessage fmsg = new FacesMessage("Pesquisa efetuada, encontrados " +
				getListaCont().size() + " resultados");
		FacesContext.getCurrentInstance().addMessage(null, fmsg);
		
		return "";
	}
	

}
