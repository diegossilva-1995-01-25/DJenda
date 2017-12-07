package control;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import model.Usuario;
import services.FabricaCRUD;

public class CtrlUsuario implements FabricaCRUD<Usuario> {
	
	private EntityManagerFactory fab;
	private Usuario usr;
	
	public CtrlUsuario() {
		// TODO Auto-generated constructor stub
		fab = Persistence.createEntityManagerFactory("sql10208877");
		usr = new Usuario();
	}

	@Override
	public void adicionar(Usuario entidade) {
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
	public void alterar(Usuario entidade) {
		// TODO Auto-generated method stub

		EntityManager gerente = fab.createEntityManager();
		gerente.getTransaction().begin();
		gerente.merge(entidade);
		gerente.getTransaction().commit();
		gerente.close();

	}

	@Override
	public List<Usuario> consultar(String parametro) {
		// TODO Auto-generated method stub
		// Faça uma lista de object clonando a lista de usuário
		EntityManager gerente = fab.createEntityManager();

		TypedQuery<Usuario> query = gerente.createQuery("select u from usuario u where u.nome = :n",
				Usuario.class);
		query.setParameter("n", parametro);
		List<Usuario> lista = query.getResultList();
		gerente.close();

		return lista;
		
	}

	@Override
	public void excluir(Usuario entidade) {
		// TODO Auto-generated method stub

		EntityManager gerente = fab.createEntityManager();
		Query query = gerente.createQuery("delete from usuario u where" + " u.idUsuario = :entrada");
		query.setParameter("entrada", entidade.getIdUsuario());
		gerente.close();

	}

	@Override
	public List<Usuario> relatorioTodos() {
		// TODO Auto-generated method stub
		EntityManager gerente = fab.createEntityManager();
		
		TypedQuery<Usuario> query = gerente.createQuery(
				"select u from usuario u", 
				Usuario.class);
		List<Usuario> lista = query.getResultList();
		gerente.close();
		
		return lista;
	}

	public Usuario login(String login) {
		
		EntityManager gerente = fab.createEntityManager();

		TypedQuery<Usuario> query = gerente.createQuery("select u from usuario u where u.email = :n",
				Usuario.class);
		query.setParameter("n", login);
		Usuario user = (Usuario) query.getResultList();
		gerente.close();

		return user;
		
	}

}
