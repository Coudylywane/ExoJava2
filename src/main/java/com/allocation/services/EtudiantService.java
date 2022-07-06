package com.allocation.services;

import java.util.ArrayList;
import java.util.List;

import com.allocation.dao.EtudiantDaoImp;
import com.allocation.dao.IEtudiantDao;
import com.allocation.model.Etudiant;

public class EtudiantService {
    List<Etudiant> etudiants = new ArrayList<>();

    private final String SUCCESS_MSG = "Operation effectue avec succes";
    private final String FAILED_MSG = "Echec de l'operation";
    private IEtudiantDao iEtudiantDao;

    public EtudiantService(){
        iEtudiantDao = new EtudiantDaoImp();
    }

    public void addEtudiant(Etudiant etudiant) {
        Integer result = iEtudiantDao.save(etudiant);
        System.out.println(result == 1 ? SUCCESS_MSG : FAILED_MSG);
    }

}
