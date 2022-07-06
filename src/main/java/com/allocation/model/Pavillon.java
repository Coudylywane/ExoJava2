package com.allocation.model;

public class Pavillon {
    private Long id;
    private String numero;
    private int nombreEtage;

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
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
     * @return the nombreEtage
     */
    public int getNombreEtage() {
        return nombreEtage;
    }
    /**
     * @param nombreEtage the nombreEtage to set
     */
    public void setNombreEtage(int nombreEtage) {
        this.nombreEtage = nombreEtage;
    }
    
}
