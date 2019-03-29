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
public class Noticia1 {
    private String titulo;
    private String autor;
    private Date fecha;
    private String contenido;
    private byte[] multimedia;
    
    //set
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public void setFecha(Date fecha){
        this.fecha=fecha;
    }
    public void setContenido(String contenido){
        this.contenido=contenido;
    }
    
    //get
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public Date getFecha(){
        return this.fecha;
    }
    public String getContenido(){
        return this.contenido;
    }
}
