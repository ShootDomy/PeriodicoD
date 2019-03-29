/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba1;

import ec.edu.ups.clase1.Estructura1;
import ec.edu.ups.clase1.Multimedia1;
import ec.edu.ups.clase1.Noticia1;
import ec.edu.ups.clase1.RedSocial1;
import ec.edu.ups.clase1.Seccion1;
import java.util.Date;

/**
 *
 * @author Domenica Cañizares
 */
public class Prueba1 {
    public static void main(String[] args){
        
        //red social
        RedSocial1 facebook = new RedSocial1();
        facebook.setCodigo(1);
        facebook.setNombre("FACEBOOK");
        facebook.setUrl("www.facebook.com");
        
        int cod = facebook.getCodigo();
        System.out.println("codigo "+cod);
        String nom = facebook.getNombre();
        System.out.println("nombre "+nom);
        String url1 = facebook.getUrl();
        System.out.println("url "+url1);
        
        //noticia
        Noticia1 noticia = new Noticia1();
        noticia.setTitulo("Goleada de Barcelona fc ");
        noticia.setAutor("Julio Mendez");
        Date Date=null; 
        noticia.setFecha(Date);
        noticia.setContenido("Barcelona gana a Real madrid 8-5 en eliminatotrias");
        
        String tit=noticia.getTitulo();
        System.out.println("Titulo "+tit);
        String autor1=noticia.getAutor();
        System.out.println("Autor "+autor1);
        Date fecha1= new Date();
        System.out.println("Fehca "+fecha1);
        String cont=noticia.getContenido();
        System.out.println("Contenido "+cont);
        
        //estructura
        Estructura1 estruc = new Estructura1();
        estruc.setNomEs("Tiempo");
        estruc.setUbic("Cuenca-Ecuador");
        estruc.setFechaEs(Date);
        estruc.setNumPor(1);
        estruc.setEncab("hola");
        
        String nomEst=estruc.getNomEs();
        System.out.println("Nombre Periodico "+nomEst);
        String ubi=estruc.getUbic();
        System.out.println("Ubicacion "+ubi);
        Date fecha2=estruc.getFechaEs();
        System.out.println("Fecha "+fecha2);
        int numP=estruc.getNumPor();
        System.out.println("Numero de Portada "+numP);
        String enc=estruc.getEncab();
        System.out.println("Encabezado "+enc);
        
        //multimedia
        Multimedia1 mult= new Multimedia1();
        mult.setNomIma("foto.jpg");
        mult.setForm("jpg");
        mult.setTamByte(3.58);
        mult.setPath("Desktop/Imagenes/moto");
        
        String nomI=mult.getNomIma();
        System.out.println("Nombre de la Imagen "+nomI);
        String form1=mult.getForm();
        System.out.println("Formato Imagen "+form1);
        double tam=mult.getTamByte();
        System.out.println("Tamaño Imagen "+tam);
        String path1=mult.getPath();
        System.out.println("Path "+path1);
        
        //seccion
        Seccion1 sec= new Seccion1();
        sec.setNombre("Deportes");
        
        String nomS=sec.getNombre();
        System.out.println("Nombre de Seccion "+ nomS);
    }
}
