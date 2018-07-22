package cl.fuentes.app;


public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	Jsontool j = new Jsontool();
		
    	System.out.println("--------------------------------------------");
    	//byte[] data = j.cargarArchivo("F://prueba.txt");
    	//System.out.println(data.toString());

    	//byte[] data1 = j.cargarArchivoBase64("F://prueba.txt");
    	//System.out.println(data1.toString());
    	
    	Archivo archivo = j.obtenerArchivo("F:/logo.png");
    	System.out.println(archivo.getRutaAbsoluta());
    	System.out.println(archivo.getNombreExtension());
    	System.out.println(archivo.getNombre());
    	System.out.println(archivo.getExtension());
    	System.out.println(archivo.getContenido());
    	j.generarJson(archivo, archivo.getRutaAbsoluta());
    	System.out.println("--------------------------------------------");
    }

}
