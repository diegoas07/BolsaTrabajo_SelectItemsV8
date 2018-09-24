/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.dto;

/**
 *
 * @author Desarrollo2
 */
public class Colonia {
       private long coloniaId;
       private String nombreColonia;
       private long codigoPostal;
       
       public Colonia(long coloniaId, String nombreColonia, long codigoPostal){
           this.coloniaId = coloniaId;
           this.codigoPostal = codigoPostal;
           this.nombreColonia = nombreColonia;
       }
       
    /**
     * @return the coloniaId
     */
    public long getColoniaId() {
        return coloniaId;
    }

    /**
     * @param coloniaId the coloniaId to set
     */
    public void setColoniaId(long coloniaId) {
        this.coloniaId = coloniaId;
    }

    /**
     * @return the nombreColonia
     */
    public String getNombreColonia() {
        return nombreColonia;
    }

    /**
     * @param nombreColonia the nombreColonia to set
     */
    public void setNombreColonia(String nombreColonia) {
        this.nombreColonia = nombreColonia;
    }

    /**
     * @return the codigoPostal
     */
    public long getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * @param codigoPostal the codigoPostal to set
     */
    public void setCodigoPostal(long codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
       
       
}
