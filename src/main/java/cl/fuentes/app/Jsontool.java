package cl.fuentes.app;

import java.io.File;
import java.io.IOException;
//import java.util.Base64;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

public class Jsontool {

	
	public byte[] cargarArchivo(String ruta) throws IOException {

		File file = new File(ruta);
		return FileUtils.readFileToByteArray(file);
	
	}
	
	public byte[] cargarArchivoBase64(String ruta) throws IOException {

		File file = new File(ruta);
		return Base64.getEncoder().encode(FileUtils.readFileToByteArray(file));
	
	}
	
	public Archivo obtenerArchivo(String ruta) throws IOException {
		
		Archivo archivo = new Archivo();
		archivo.setRutaAbsoluta(FilenameUtils.getFullPath(ruta));
		archivo.setNombreExtension(FilenameUtils.removeExtension(FilenameUtils.getName(ruta)) + "." + FilenameUtils.getExtension(ruta));
		archivo.setNombre(FilenameUtils.removeExtension(FilenameUtils.getName(ruta)));
		archivo.setExtension(FilenameUtils.getExtension(ruta));
		archivo.setContenido(cargarArchivoBase64(ruta));
		return archivo;
	}
	
	
	
	
}
