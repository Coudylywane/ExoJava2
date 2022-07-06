package com.allocation.dao;

import com.allocation.model.Chambre;

public interface IChambreDao extends IDBDao<Chambre, Long, Integer> {
    
    Integer archiver(Chambre chambre);

}
