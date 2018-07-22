package cl.fuentes.app;

public class Archivo {

	private String rutaAbsoluta;
	private String nombreExtension;
	private String nombre;
	private String extension;
	private byte[] contenido;
	
	public Archivo(){
	}
	
	public Archivo(String rutaAbsoluta, String nombreExtension, String nombre, String extension, byte[] contenido) {
		//super();
		
		this.rutaAbsoluta = rutaAbsoluta;
		this.nombreExtension = nombreExtension;
		this.nombre = nombre;
		this.extension = extension;
		this.contenido = contenido;
	}
	
	
	public String getRutaAbsoluta() {
		return rutaAbsoluta;	}

	public void setRutaAbsoluta(String rutaAbsoluta) {
		this.rutaAbsoluta = rutaAbsoluta;
	}

	public String getNombreExtension() {
		return nombreExtension;
	}
	public void setNombreExtension(String nombreExtension) {
		this.nombreExtension = nombreExtension;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public byte[] getContenido() {
		return contenido;
	}
	public void setContenido(byte[] contenido) {
		this.contenido = contenido;
	}
}
