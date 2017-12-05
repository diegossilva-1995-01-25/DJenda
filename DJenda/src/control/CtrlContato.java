package control;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;


import model.Contato;
import services.FabricaCRUD;

public class CtrlContato implements FabricaCRUD<Contato> {

	private EntityManagerFactory fab;
	//private Contato cont;

	public CtrlContato() {
		// TODO Auto-generated constructor stub
		fab = Persistence.createEntityManagerFactory("sql10208877");
		//cont = new Contato();
	}

	@Override
	public void adicionar(Contato entidade) {
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
	public void alterar(Contato entidade) {
		// TODO Auto-generated method stub
		
		EntityManager gerente = fab.createEntityManager();
		gerente.getTransaction().begin();
		gerente.merge(entidade);
		gerente.getTransaction().commit();
		gerente.close();

	}

	@Override
	public List<Contato> consultar(String parametro) {
		// TODO Auto-generated method stub
		EntityManager gerente = fab.createEntityManager();

		TypedQuery<Contato> query = gerente.createQuery("select c from Contato c where c.nome = :n",
				Contato.class);
		query.setParameter("n", parametro);
		List<Contato> lista = query.getResultList();
		gerente.close();

		return lista;
		
	}

	@Override
	public void excluir(Contato entidade) {
		// TODO Auto-generated method stub
		
		EntityManager gerente = fab.createEntityManager();
		Query query = gerente.createQuery("delete from Contato c where" + " c.idContato = :entrada");
		query.setParameter("entrada", entidade.getIdContato());
		gerente.close();

	}

	@Override
	public List<Contato> relatorioTodos() {
		// TODO Auto-generated method stub
		EntityManager gerente = fab.createEntityManager();
		
		TypedQuery<Contato> query = gerente.createQuery(
				"select c from Contato c", 
				Contato.class);
		List<Contato> lista = query.getResultList();
		gerente.close();
		
		return lista;
		
	}

}
