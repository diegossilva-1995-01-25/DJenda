package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import control.CtrlUsuario;
import model.Usuario;
import services.MBGenerico;

@ManagedBean(name="mbUsuario")
@SessionScoped
public class MBUsuario extends MBGenerico implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6548423795571304508L;
	
	private CtrlUsuario cUsr = new CtrlUsuario();
	private Usuario ultUsr = new Usuario();
	private List<Usuario> listaUsr = new ArrayList<>();
		
	public Usuario getUltUsr() {
		return ultUsr;
	}

	public List<Usuario> getListaUsr() {
		return listaUsr;
	}

	public void setUltUsr(Usuario ultUsr) {
		this.ultUsr = ultUsr;
	}

	public void setListaUsr(List<Usuario> listaUsr) {
		this.listaUsr = listaUsr;
	}
		
	@Override
	public String adicionar() {
		// TODO Auto-generated method stub
		cUsr.adicionar(ultUsr);
		ultUsr = new Usuario();
		FacesMessage fmsg = new FacesMessage("Usuário adicionado");
		FacesContext.getCurrentInstance().addMessage(null, fmsg);
		
		return "";
	}

	@Override
	public String alterar() {
		// TODO Auto-generated method stub
		cUsr.alterar(ultUsr);
		ultUsr = new Usuario();
		FacesMessage fmsg = new FacesMessage("Usuário alterado");
		FacesContext.getCurrentInstance().addMessage(null, fmsg);
		
		return "";
	}

	@Override
	public String consultar() {
		// TODO Auto-generated method stub
		setListaUsr(cUsr.consultar(ultUsr.getNome()));
		
		FacesMessage fmsg = new FacesMessage("Pesquisa efetuada, encontrados " +
				getListaUsr().size() + " resultados");
		FacesContext.getCurrentInstance().addMessage(null, fmsg);
		
		return "";
	}

	@Override
	public String excluir() {
		// TODO Auto-generated method stub
		cUsr.excluir(ultUsr);
		ultUsr = new Usuario();
		FacesMessage fmsg = new FacesMessage("Usuário deletado");
		FacesContext.getCurrentInstance().addMessage(null, fmsg);
		
		return "";
	}

	@Override
	public String relatorioTodos() {
		// TODO Auto-generated method stub
		setListaUsr(cUsr.relatorioTodos());
		
		FacesMessage fmsg = new FacesMessage("Pesquisa efetuada, encontrados " +
				getListaUsr().size() + " resultados");
		FacesContext.getCurrentInstance().addMessage(null, fmsg);
		
		return "";
	}
	
	public boolean loginMB() {
		
		Usuario usr = null;
		boolean logado = false;
		
		usr = cUsr.login(ultUsr.getEmailUsuario());
		
		if(usr.getSenhaUsuario().equals(ultUsr.getSenhaUsuario())) {
			
			logado = true;
			
		}
		
		
		return logado;
		
	}

	
}
