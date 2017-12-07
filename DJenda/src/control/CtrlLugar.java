package control;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import model.Lugar;
import services.FabricaCRUD;

public class CtrlLugar implements FabricaCRUD<Lugar> {
	
	private EntityManagerFactory fab;
	private Lugar lug;
	
	public CtrlLugar() {
		// TODO Auto-generated constructor stub
		fab = Persistence.createEntityManagerFactory("sql10208877");
		lug = new Lugar();
	}

	@Override
	public void adicionar(Lugar entidade) {
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
	public void alterar(Lugar entidade) {
		// TODO Auto-generated method stub
		
		EntityManager gerente = fab.createEntityManager();
		gerente.getTransaction().begin();
		gerente.merge(entidade);
		gerente.getTransaction().commit();
		gerente.close();

	}

	@Override
	public List<Lugar> consultar(String parametro) {
		// TODO Auto-generated method stub
		EntityManager gerente = fab.createEntityManager();

		TypedQuery<Lugar> query = gerente.createQuery("select l from Lugar l where l.nome = :n",
				Lugar.class);
		query.setParameter("n", parametro);
		List<Lugar> lista = query.getResultList();
		gerente.close();

		return lista;
		
	}

	@Override
	public void excluir(Lugar entidade) {
		// TODO Auto-generated method stub
		
		EntityManager gerente = fab.createEntityManager();
		Query query = gerente.createQuery("delete from Lugar l where"
				+ " l.idLugar = :entrada");
		query.setParameter("entrada", entidade.getIdLugar());
		gerente.close();

	}

	@Override
	public List<Lugar> relatorioTodos() {
		// TODO Auto-generated method stub
		EntityManager gerente = fab.createEntityManager();
		
		TypedQuery<Lugar> query = gerente.createQuery(
				"select l from Lugar l", 
				Lugar.class);
		List<Lugar> lista = query.getResultList();
		gerente.close();
		
		return lista;
		
	}

	

}
