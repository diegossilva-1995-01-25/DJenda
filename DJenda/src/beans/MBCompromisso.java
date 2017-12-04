package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import control.CtrlCompromisso;
import model.Compromisso;
import services.MBGenerico;

@ManagedBean(name="mbCompromisso")
@SessionScoped
public class MBCompromisso extends MBGenerico implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7844545965452607341L;
	
	private List<Compromisso> listaComp = new ArrayList<>();
	private CtrlCompromisso cComp = new CtrlCompromisso();
	private Compromisso ultComp = new Compromisso();
			
	public Compromisso getUltComp() {
		return ultComp;
	}

	public void setUltComp(Compromisso ultComp) {
		this.ultComp = ultComp;
	}

	public List<Compromisso> getListaComp() {
		return listaComp;
	}
	
	public void setListaComp(List<Compromisso> listaComp) {
		this.listaComp = listaComp;
	}
	

	@Override
	public String adicionar() {
		// TODO Auto-generated method stub
		cComp.adicionar(ultComp);
		ultComp = new Compromisso();
		FacesMessage fmsg = new FacesMessage("Compromisso marcado");
		FacesContext.getCurrentInstance().addMessage(null, fmsg);
		
		return "";
	}

	@Override
	public String alterar() {
		// TODO Auto-generated method stub
		cComp.alterar(ultComp);
		ultComp = new Compromisso();
		FacesMessage fmsg = new FacesMessage("Compromisso alterado");
		FacesContext.getCurrentInstance().addMessage(null, fmsg);
		
		return "";
	}

	@Override
	public String consultar() {
		// TODO Auto-generated method stub
		setListaComp(cComp.consultar(ultComp.getNome()));
		
		FacesMessage fmsg = new FacesMessage("Pesquisa efetuada, encontrados " +
				getListaComp().size() + " resultados");
		FacesContext.getCurrentInstance().addMessage(null, fmsg);
		
		return "";
	}

	@Override
	public String excluir() {
		// TODO Auto-generated method stub
		cComp.excluir(ultComp);
		ultComp = new Compromisso();
		FacesMessage fmsg = new FacesMessage("Compromisso desmarcado");
		FacesContext.getCurrentInstance().addMessage(null, fmsg);
		
		return "";
	}

	@Override
	public String relatorioTodos() {
		// TODO Auto-generated method stub
		setListaComp(cComp.relatorioTodos());
		
		FacesMessage fmsg = new FacesMessage("Pesquisa efetuada, encontrados " +
				getListaComp().size() + " resultados");
		FacesContext.getCurrentInstance().addMessage(null, fmsg);
		
		return "";
	}
	

}
