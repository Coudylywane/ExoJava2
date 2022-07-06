package com.allocation.dao;

import java.util.List;

public interface IDBDao<T, S, R> {
    R save(T t);
    List<T> findAll();
    T getById(S id);
    R delete(S id);
    R update(T t);
}
