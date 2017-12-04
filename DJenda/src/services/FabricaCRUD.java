package services;

import java.util.List;

// Generics (usando um tipo/classe como tipo a ser usado na hora de implementar)
public interface FabricaCRUD<T> {

	public abstract void adicionar(T entidade);
	public abstract void alterar(T entidade);
	public abstract List<T> consultar(String parametro);
	public abstract void excluir(T entidade);
	public abstract List<T> relatorioTodos();
	
	// Use delegator, é uma possibilidade
	
}
