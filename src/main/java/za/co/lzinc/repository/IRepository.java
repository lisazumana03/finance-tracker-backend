package za.co.lzinc.repository;

@Deprecated
public interface IRepository<T, ID> {
    T create(T t);
}
