package apaw.api.daos;

public interface GenericDao<T, ID> {
	
	void create (T entity);
	
	T read(ID id);

}
