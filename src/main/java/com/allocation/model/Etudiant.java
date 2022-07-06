package com.allocation.model;

public class Etudiant {
    private Long id ;
    private String matricule ;
    private String nom;
    private String prenom;
    private String login;
    private TypeEtudiant typeEtudiant ;
    private String adresse ; 
    private Chambre chambre ;

    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public TypeEtudiant getTypeEtudiant() {
        return typeEtudiant;
    }
    public void setTypeEtudiant(TypeEtudiant typeEtudiant) {
        this.typeEtudiant = typeEtudiant;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public Chambre getChambre() {
        return chambre;
    }
    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }

}
