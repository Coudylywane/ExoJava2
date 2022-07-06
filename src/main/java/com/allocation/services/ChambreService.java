package com.allocation.services;

import java.util.ArrayList;
import java.util.List;

import com.allocation.dao.ChambreDaoImp;
import com.allocation.dao.IChambreDao;
import com.allocation.model.Chambre;

public class ChambreService {
    List<Chambre> chambres = new ArrayList<>();

    private final String SUCCESS_MSG = "Operation effectue avec succes";
    private final String FAILED_MSG = "Echec de l'operation";
    private IChambreDao iChambreDao;

    public ChambreService() {
        iChambreDao = new ChambreDaoImp();
    }

    public void addChambre(Chambre chambre) {
        Integer result = iChambreDao.save(chambre);
        System.out.println(result == 1 ? SUCCESS_MSG : FAILED_MSG);
    }


    public void modifierChambre(Chambre chambre) {
        Integer result = iChambreDao.update(chambre);
        System.out.println(result == 1 ? SUCCESS_MSG : FAILED_MSG);
    }

    public void deleteChambre(long id) {
        Integer result = iChambreDao.delete(id);
        System.out.println(result == 1 ? SUCCESS_MSG : FAILED_MSG);
    }

    

    public Chambre getOneChambre(long id) {
        return iChambreDao.getById(id);
    }

    public void archiverChambre(Chambre chambre) {
        Integer result = iChambreDao.archiver(chambre);
        System.out.println(result == 1 ? SUCCESS_MSG : FAILED_MSG);
    }


    public List<Chambre> getAllChambre() {
        return iChambreDao.findAll();
    }
}
