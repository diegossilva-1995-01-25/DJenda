package control;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import model.Compromisso;
import services.FabricaCRUD;

public class CtrlCompromisso implements FabricaCRUD<Compromisso> {
	
	private EntityManagerFactory fab;
	//private Compromisso comp;

	public CtrlCompromisso() {
		
		fab = Persistence.createEntityManagerFactory("compromisso");
		//comp = new Compromisso();
		
	}
	
	@Override
	public void adicionar(Compromisso entidade) {
		// TODO Auto-generated method stub
		
		EntityManager gerente = fab.createEntityManager();
		
		try {
			gerente.getTransaction().begin();
			gerente.persist(entidade);
			gerente.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao salvar no banco: \n" + e.getMessage());
		}
		
		gerente.close();
		
	}

	@Override
	public void alterar(Compromisso entidade) {
		// TODO Auto-generated method stub
		
		EntityManager gerente = fab.createEntityManager();
		gerente.getTransaction().begin();
		gerente.merge(entidade);
		gerente.getTransaction().commit();
		gerente.close();
		
	}

	@Override
	public List<Compromisso> consultar(String parametro) {
		// TODO Auto-generated method stub
		EntityManager gerente = fab.createEntityManager();
		
		TypedQuery<Compromisso> query = gerente.createQuery(
				"select c from Compromisso c where c.nome = :n", 
				Compromisso.class);
		query.setParameter("n", parametro);
		List<Compromisso> lista = query.getResultList();
		gerente.close();
		
		return lista;
		
	}

	@Override
	public void excluir(Compromisso entidade) {
		// TODO Auto-generated method stub
		
		EntityManager gerente = fab.createEntityManager();
		Query query = gerente.createQuery("delete from Compromisso c where"
				+ " c.idCompromisso = :entrada");
		query.setParameter("entrada", entidade.getIdCompromisso());
		gerente.close();
		
	}

	@Override
	public List<Compromisso> relatorioTodos() {
		// TODO Auto-generated method stub
		EntityManager gerente = fab.createEntityManager();
		
		TypedQuery<Compromisso> query = gerente.createQuery(
				"select c from Compromisso c", 
				Compromisso.class);
		List<Compromisso> lista = query.getResultList();
		gerente.close();
		
		return lista;
		
	}

}
