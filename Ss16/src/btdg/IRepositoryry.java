package btdg;

public interface IRepositoryry<T>{
    boolean add(T item);
    boolean removeById(String id);
    T findById(String id);
    T[] findAll();
}
