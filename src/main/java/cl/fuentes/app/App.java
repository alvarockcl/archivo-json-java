package cl.fuentes.app;

import java.io.File;
import java.util.List;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	Jsontool jsontool = new Jsontool();
		
    	//System.out.println("--------------------------------------------");
    	//byte[] data = j.cargarArchivo("F://prueba.txt");
    	//System.out.println(data.toString());

    	//byte[] data1 = j.cargarArchivoBase64("F://prueba.txt");
    	//System.out.println(data1.toString());
    	/*
    	Archivo archivo = j.obtenerArchivo("d:/prueba2.png");
    	System.out.println(archivo.getRutaAbsoluta());
    	System.out.println(archivo.getNombreExtension());
    	System.out.println(archivo.getNombre());
    	System.out.println(archivo.getExtension());
    	System.out.println(archivo.getContenido());
    	j.generarJson(archivo, archivo.getRutaAbsoluta());
    	System.out.println("--------------------------------------------");
    	*/
    	
    	// genera archivos json por cada uno en la ruta determinada
    	System.out.println("--------------------------------------------");
    	Archivo archivo = new Archivo();
    	List<File> files = jsontool.obtenerListadir("D:/ZZZ");
    	for (File file : files) {
    		System.out.println("file: " + file.getCanonicalPath());
    		archivo = jsontool.obtenerArchivo(file.getCanonicalPath()); 
    		//jsontool.generarJson(archivo,archivo.getRutaAbsoluta());
    		jsontool.guardarArchivo(archivo);
    	}
    	System.out.println("--------------------------------------------");
    }

}
