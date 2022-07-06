package com.allocation.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.allocation.model.Pavillon;

public class PavillonDaoImp  implements IPavillonDao{

    @Override
    public Integer save(Pavillon t) {
            String sql = "INSERT INTO pavillon(libelle,nombreEtage) VALUES(?,?)";
            try {
                PreparedStatement statement = DB.getConnection().prepareStatement(sql);
                statement.setString(1, t.getNumero());
                statement.setInt(2, t.getNombreEtage());
                statement.execute();
                return 1;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            
            return 0;
    }



    @Override
    public List<Pavillon> findAll() {
        String sql = "SELECT * FROM pavillon";
        try {

            Statement statement = DB.getConnection().createStatement();
            ResultSet rs = statement.executeQuery(sql);
          

            List<Pavillon> pavillons = new ArrayList<>();
            while(rs.next()) {
                Pavillon pavillon = new Pavillon();
                pavillon.setId(rs.getLong("id"));
                pavillon.setNumero(rs.getString("libelle"));
                pavillon.setNombreEtage(rs.getInt("nombreEtage"));  

                pavillons.add(pavillon);
            }
                
                

            return pavillons;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return new ArrayList<>();
    

    }





    @Override
    public Pavillon getById(Long id) {
        String sql = "SELECT * FROM pavillon WHERE pavillon.id = ?";
        PreparedStatement statement;

        try {
            statement = DB.getConnection().prepareStatement(sql);
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
               Pavillon pavillon = new Pavillon(); 
                pavillon.setId(rs.getLong("id"));
                pavillon.setNumero(rs.getString("libelle"));
                pavillon.setNombreEtage(rs.getInt("nombreEtage"));

                return pavillon ;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }






    @Override
    public Integer delete(Long id) {
        // TODO Auto-generated method stub
        return null;
    }



    @Override
    public Integer update(Pavillon t) {
        String sql = "UPDATE pavillon SET libelle = ? , nombreEtage = ?  WHERE pavillon.id = ?";

        try {
            PreparedStatement statement = DB.getConnection().prepareStatement(sql);  
            statement.setString(1, t.getNumero());  
            statement.setInt(2, t.getNombreEtage());      
            statement.setLong(3, t.getId());
           
            statement.executeUpdate();

            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;

    }
    
}
