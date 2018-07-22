package cl.fuentes.app;

import java.io.File;
import java.io.IOException;
//import java.util.Base64;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

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
	
	public void generarJson(Archivo archivo, String ruta) {
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(new File(ruta + archivo.getNombre() + ".json"), archivo);
			String jsonInString = mapper.writeValueAsString(archivo);
			System.out.println(jsonInString);
			jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(archivo);
			System.out.println(jsonInString);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
