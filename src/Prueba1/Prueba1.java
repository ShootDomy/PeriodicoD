/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba1;

//Palabra reservada 
//Traer una los valores de una clase a otra
import ec.edu.ups.clase1.Estructura1;   //importar clase Estructura
import ec.edu.ups.clase1.Multimedia1;   //importar clase Multimedia
import ec.edu.ups.clase1.Noticia1;      //importar clase Noticia
import ec.edu.ups.clase1.RedSocial1;    //iomportar clase RedSocial
import ec.edu.ups.clase1.Seccion1;      //importar calse seccion
import java.util.Date;                  //importar clase Date para la decha

/**
 *
 * @author Domenica Cañizares
 * Estructura1 Periodico
 * En esta clase se va a almacenar variabels para la creacion para la estructura de la noticia
 * set-> dar valores a las variables
 * get-> obtener valores de las variables
 */
public class Prueba1 {
    public static void main(String[] args){
        
        
        //red social
        RedSocial1 facebook = new RedSocial1();//llamar clase
        facebook.setCodigo(1);//asignar valores para luego imprimir datos
        facebook.setNombre("FACEBOOK");
        facebook.setUrl("www.facebook.com");
        //obtener valores
        int cod = facebook.getCodigo();
        System.out.println("codigo "+cod);//impresion de valor
        String nom = facebook.getNombre();
        System.out.println("nombre "+nom);//impresion de valor
        String url1 = facebook.getUrl();
        System.out.println("url "+url1);//impresion de valor
        
        //noticia
        Noticia1 noticia = new Noticia1();
        noticia.setTitulo("Goleada de Barcelona fc ");//Asignacion de valor en variable //obtener
        noticia.setAutor("Julio Mendez");//Asignacion de valor en variable //obtener
        Date Date=null; 
        noticia.setFecha(Date);//Asignacion de valor en variable //obtener
        noticia.setContenido("Barcelona gana a Real madrid 8-5 en eliminatotrias");//Asignacion de valor en variable //obtener
        
        String tit=noticia.getTitulo();
        System.out.println("Titulo "+tit);//impresion de valor
        String autor1=noticia.getAutor();
        System.out.println("Autor "+autor1);//impresion de valor
        Date fecha1= new Date();
        System.out.println("Fehca "+fecha1);//impresion de valor
        String cont=noticia.getContenido();
        System.out.println("Contenido "+cont);//impresion de valor
        
        //estructura
        Estructura1 estruc = new Estructura1();
        estruc.setNomEs("Tiempo"); //Asignacion de valor en variable //obtener
        estruc.setUbic("Cuenca-Ecuador");//Asignacion de valor en variable //obtener
        estruc.setFechaEs(Date); //Asignacion de valor en variable //obtener
        estruc.setNumPor(1);//Asignacion de valor en variable //obtener
        estruc.setEncab("hola");//Asignacion de valor en variable //obtener
        
        String nomEst=estruc.getNomEs();
        System.out.println("Nombre Periodico "+nomEst);//impresion de valor
        String ubi=estruc.getUbic();
        System.out.println("Ubicacion "+ubi);//impresion de valor
        Date fecha2=estruc.getFechaEs();
        System.out.println("Fecha "+fecha2);//impresion de valor
        int numP=estruc.getNumPor();
        System.out.println("Numero de Portada "+numP);//impresion de valor
        String enc=estruc.getEncab();
        System.out.println("Encabezado "+enc);//impresion de valor
        
        //multimedia
        Multimedia1 mult= new Multimedia1();
        mult.setNomIma("foto.jpg");//Asignacion de valor en variable //obtener
        mult.setForm("jpg");//Asignacion de valor en variable //obtener
        mult.setTamByte(3.58);//Asignacion de valor en variable //obtener
        mult.setPath("Desktop/Imagenes/moto");//Asignacion de valor en variable //obtener
        
        String nomI=mult.getNomIma();
        System.out.println("Nombre de la Imagen "+nomI);//impresion de valor
        String form1=mult.getForm();
        System.out.println("Formato Imagen "+form1);//impresion de valor
        double tam=mult.getTamByte();
        System.out.println("Tamaño Imagen "+tam);//impresion de valor
        String path1=mult.getPath();
        System.out.println("Path "+path1);//impresion de valor
        
        //seccion
        Seccion1 sec= new Seccion1();
        sec.setNombre("Deportes");//Asignacion de valor en variable //obtener
        
        String nomS=sec.getNombre();
        System.out.println("Nombre de Seccion "+ nomS);//impresion de valor
    }
}
