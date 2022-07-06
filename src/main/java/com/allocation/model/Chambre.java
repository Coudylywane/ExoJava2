package com.allocation.model;

public class Chambre {
    private Long id;
    private int numero;
    private int numeroEtage;
    private TypeChambre typeChambre;
    private EtatChambre etatChambre;
    private Pavillon pavillon;

    public Chambre(Long  id) {
        this.id = id;
    }

    public Chambre (){}

    @Override
    public boolean equals(Object obj) {
        return  ((Chambre)obj).getId() == this.id;
       
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }


    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }


    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }


    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }


    /**
     * @return the numeroEtage
     */
    public int getNumeroEtage() {
        return numeroEtage;
    }


    /**
     * @param numeroEtage the numeroEtage to set
     */
    public void setNumeroEtage(int numeroEtage) {
        this.numeroEtage = numeroEtage;
    }


    /**
     * @return the pavillon
     */
    public Pavillon getPavillon() {
        return pavillon;
    }


    /**
     * @param pavillon the pavillon to set
     */
    public void setPavillon(Pavillon pavillon) {
        this.pavillon = pavillon;
    }


    /**
     * @return the typeChambre
     */
    public TypeChambre getTypeChambre() {
        return typeChambre;
    }


    /**
     * @param typeChambre the typeChambre to set
     */
    public void setTypeChambre(TypeChambre typeChambre) {
        this.typeChambre = typeChambre;
    }


    /**
     * @return the etatChambre
     */
    public EtatChambre getEtatChambre() {
        return etatChambre;
    }


    /**
     * @param etatChambre the etatChambre to set
     */
    public void setEtatChambre(EtatChambre etatChambre) {
        this.etatChambre = etatChambre;
    }
    
}
