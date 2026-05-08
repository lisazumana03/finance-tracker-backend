package za.co.lzinc.service;

import java.util.List;

public interface IService <T, ID>{
    T create (T t);
    List<T> getAll();
    T update (T t, ID id);
    void deleteById(ID id);

}
