package com.allocation.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.allocation.model.Etudiant;

public class EtudiantDaoImp implements IEtudiantDao{

    @Override
    public Integer save(Etudiant t) {
        String sql = "INSERT INTO etudiant(matricule , nom , prenom , login , typeEtudiant , adresse , chambre ) VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement statement = DB.getConnection().prepareStatement(sql);
            statement.setString(1, t.getMatricule());
            statement.setString(2, t.getNom());
            statement.setString(3, t.getPrenom());
            statement.setString(4, t.getLogin());
            statement.setString(5, t.getTypeEtudiant().name());
            statement.setString(6, t.getAdresse());
            statement.setLong(7, t.getChambre().getId());
            statement.execute();
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return 0;
    }

    @Override
    public List<Etudiant> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Etudiant getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Integer delete(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Integer update(Etudiant t) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
