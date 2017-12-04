package services;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public abstract class MBGenerico {

	public abstract String adicionar();
	public abstract String alterar();
	public abstract String consultar();
	public abstract String excluir();
	public abstract String relatorioTodos();
	
}
