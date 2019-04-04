/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba1;

//Palabra reservada 
//Traer una los valores de una clase a otra
import ec.edu.ups.clase1.Estructura;   //importar clase Estructura
import ec.edu.ups.clase1.Multimedia;   //importar clase Multimedia
import ec.edu.ups.clase1.Noticia;      //importar clase Noticia
import ec.edu.ups.clase1.RedSocial;    //iomportar clase RedSocial
import ec.edu.ups.clase1.Seccion;      //importar calse seccion
import java.util.Date;                  //importar clase Date para la decha

/**
 *
 * @author Domenica Cañizares
 * Prueba 
 * En esta clase se va a mostar la interfaz es decir donde se muestran las impresiones 

 */
public class Prueba1 {
    public static void main(String[] args){
        
        
        //red social
        RedSocial facebook = new RedSocial();//llamar clase
        facebook.setCodigo(1);//asignar valores para luego imprimir datos
        facebook.setNombre("FACEBOOK");
        facebook.setUrl("www.facebook.com");
        //obtener valores
        int cod = facebook.getCodigo();
        System.out.println("codigo "+cod);//impresion de valor
        String nom = facebook.getNombre();
        System.out.println("nombre "+nom);//impresion de valor
        String url1 = facebook.getUrl();
        System.out.println("url "+url1+"\n");//impresion de valor
        
        //noticia
        Noticia noticia = new Noticia();
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
        System.out.println("Contenido "+cont+"\n");//impresion de valor
        
        //noticia-multimedia
        Multimedia multi =new Multimedia();
        multi.setForm(".jpg");
        multi.setNomIma("Foto1");
        multi.setPath("thisPC/Desktop/Pictures");
        multi.setTamByte(26.1);
        
        String formato = multi.getForm();
        System.out.println("Formato "+ formato);//impresion de valor
        String nomI= multi.getNomIma();
        System.out.println("Nombre de la imagen "+ nomI);//impresion de valor
        String pathI= multi.getPath();
        System.out.println("Path "+pathI);
        double tam=multi.getTamByte();
        System.out.println("Tamaño en Byte "+tam);
        
        //estructura
        Estructura estruc = new Estructura();
        estruc.setNomEs("Tiempo"); //Asignacion de valor en variable //obtener
        estruc.setUbic("Cuenca-Ecuador");//Asignacion de valor en variable //obtener
        estruc.setFechaEs(Date); //Asignacion de valor en variable //obtener
        estruc.setNumPor(1);//Asignacion de valor en variable //obtener
        estruc.setEncab("hola"+"\n");//Asignacion de valor en variable //obtener
        
        String nomEst=estruc.getNomEs();
        System.out.println("Nombre Periodico "+nomEst);//impresion de valor
        String ubi=estruc.getUbic();
        System.out.println("Ubicacion "+ubi);//impresion de valor
        Date fecha2=estruc.getFechaEs();
        System.out.println("Fecha "+fecha2);//impresion de valor
        int numP=estruc.getNumPor();
        System.out.println("Numero de Portada "+numP);//impresion de valor
        String enc=estruc.getEncab();
        System.out.println("Encabezado "+enc+"\n");//impresion de valor
        
        //estructura-redsocial
        RedSocial redS =new RedSocial();
        redS.setCodigo(1);
        redS.setNombre("Instagram");
        redS.setUrl("www.instagram.com");
        
        int codR = redS.getCodigo();
        System.out.println("Codigo "+ codR);//impresion de valor
        String nomRed= redS.getNombre();
        System.out.println("Nombre de la Red "+ nomRed);//impresion de valor
        String urlR= redS.getUrl();
        System.out.println("URL "+urlR);
        
        //estructura-seccion
        Seccion secD =new Seccion();
        secD.setNombre("Deportes");
        
        String nomS = secD.getNombre();
        System.out.println("Nombre de la seccion "+ nomS);//impresion de valor
        
        //multimedia
        Multimedia mult= new Multimedia();
        mult.setNomIma("foto.jpg");//Asignacion de valor en variable //obtener
        mult.setForm("jpg");//Asignacion de valor en variable //obtener
        mult.setTamByte(3.58);//Asignacion de valor en variable //obtener
        mult.setPath("Desktop/Imagenes/moto");//Asignacion de valor en variable //obtener
        
        String nomIm=mult.getNomIma();
        System.out.println("Nombre de la Imagen "+nomIm);//impresion de valor
        String form1=mult.getForm();
        System.out.println("Formato Imagen "+form1);//impresion de valor
        double tamI=mult.getTamByte();
        System.out.println("Tamaño Imagen "+tamI);//impresion de valor
        String path1=mult.getPath();
        System.out.println("Path "+path1+"\n");//impresion de valor
        
        //seccion
        
        Seccion deporte= new Seccion();
        deporte.setNombre("Futbol");//Asignacion de valor en variable //obtener
        
        String nomSe=deporte.getNombre();
        System.out.println("Nombre de Seccion "+ nomSe);//impresion de valor
        
        //Seccion-noticia
        Noticia barceleche=new Noticia();
        barceleche.setTitulo("Barceleche es el peor equipo del mundo");
        barceleche.setAutor("Don Bosco");
        barceleche.setLugar("Cuenca");
        
        String titul = barceleche.getTitulo();
        System.out.println("Titulo de la noticia "+ titul);//impresion de valor
        String auto=barceleche.getAutor();
        System.out.println("Autor noticia "+ auto);//impresion de valor
        String lu= barceleche.getLugar();
        System.out.println("Lugar "+lu);
        
        Noticia cuenquita=new Noticia();
        cuenquita.setTitulo("Dep. Cuenca golea a barceleche");
        cuenquita.setAutor("Don Bosco");
        cuenquita.setLugar("Cuenca");
        
        String titu = cuenquita.getTitulo();
        System.out.println("Titulo de la noticia "+ titu);//impresion de valor
        String aut=cuenquita.getAutor();
        System.out.println("Autor noticia "+ aut);//impresion de valor
        String lug= cuenquita.getLugar();
        System.out.println("Lugar "+lug);
        
    }
}
