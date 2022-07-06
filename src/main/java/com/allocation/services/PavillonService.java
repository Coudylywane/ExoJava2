package com.allocation.services;

import java.util.List;

import com.allocation.dao.IPavillonDao;
import com.allocation.dao.PavillonDaoImp;
import com.allocation.model.Pavillon;

public class PavillonService {
    private final String SUCCESS_MSG = "Operation effectue avec succes";
    private final String FAILED_MSG = "Echec de l'operation";
    private IPavillonDao iPavillonDao;
   

    public PavillonService() {
        iPavillonDao = new PavillonDaoImp();
    }

    public void addPavillon(Pavillon pavillon) {
        Integer result = iPavillonDao.save(pavillon);
        System.out.println(result == 1 ? SUCCESS_MSG : FAILED_MSG);
    }

    public List<Pavillon> getAllPavillons() {
        return iPavillonDao.findAll();
    }


    public Pavillon getOnePavillon(long id) {
        return iPavillonDao.getById(id);
    }


    public void modifierPavillon(Pavillon pavillon) {
        Integer result = iPavillonDao.update(pavillon);
        System.out.println(result == 1 ? SUCCESS_MSG : FAILED_MSG);
    }
}



