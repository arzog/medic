package iram.sgbd.patterns.dao;

import java.util.List;

public abstract class AbstractDao<T> {
    protected abstract boolean insert(T t);
    protected abstract T update(T t);
    protected abstract boolean delete(T t);
    protected abstract List<T> selectAll(String s);
    protected abstract T selectById(int id);
}
