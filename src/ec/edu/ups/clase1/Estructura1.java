/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clase1;

import java.util.Date;

/**
 *
 * @author Domenica Cañizares
 */
public class Estructura1 {
    private String nomEs;
    private String ubic;
    private Date fechaEs;
    private int numPor;
    private String encab;
    //private seccion
    
    public void setNomEs(String nomEs){
        this.nomEs=nomEs;
    }
    public void setUbic(String ubic){
        this.ubic=ubic;
    }
    public void setFechaEs(Date fechaEs){
        this.fechaEs=fechaEs;
    }
    public void setNumPor(int numPor) {
    this.numPor=numPor;
}
    public void setEncab(String encab){
        this.encab=encab;
    }
    
    //get
    
    public String getNomEs(){
        return this.nomEs;
    }
    public String getUbic(){
        return this.ubic;
    }
    public Date getFechaEs(){
        return this.fechaEs;
    }
    public int getNumPor(){
    return this.numPor;
}
    public String getEncab(){
        return this.encab;
    }
}
