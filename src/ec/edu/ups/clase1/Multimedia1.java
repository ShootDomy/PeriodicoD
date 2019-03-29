/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clase1;

/**
 *
 * @author Domenica Cañizares
 */
public class Multimedia1 {
    private String nomIma;
    private String form;
    private double tamByte;
    private String path;
    
    public void setNomIma(String nomIma){
        this.nomIma=nomIma;
    }
    public void setForm(String form){
        this.form=form;
    }
    public void setTamByte(double tsmByte){
        this.tamByte=tamByte;
    }
    public void setPath(String path){
        this.path=path;
    }
    
    //get
    public String getNomIma(){
        return this.nomIma;
    }
    public String getForm(){
        return this.form;
    }
    public double getTamByte(){
        return this.tamByte;
    }
    public String getPath(){
        return this.path;
    }
}
