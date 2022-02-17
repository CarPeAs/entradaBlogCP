package entradaBlog;

/**Clase para manejar las entradas de un blog.
 * @author Carlos Pérez
 * @since 17/02/2022
 * @version 2.3
 */

/**
 
 */
public class EntradaBlogCP {
	/**
	 * separador es el ccarácter que separa ENTRADA DE del
	 * nombre del autor
	 */
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	
	/**Constructor de la clase. 
	 * @param id 
	 * 			:número de entrada
	 * @param autor 
	 * 			:nombre del autor
	 * @param texto 
	 * 			:texto que contiene
	* @throws IllegalArgumentException Si el número de entrada es negativo.
	* */
	
	public EntradaBlogCP(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	/**
	 * @return número de la entrada
	 */
	
	public int getId(){
		return this.id;
	}
	
	/**
	 * @return texto completo de la entrada
	 */
	public String getTexto(){
		return this.texto;
	}
	
	/**
	 * @return nombre del autor de la entrada en mayúsculas
	 */
	
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	/**
	 * @return: nombre del autor. Ya no se usa. Mejor ver getAutor
	public String devuelveAutor(){
		return this.autor;
	}*/
	
	
	/**
	 * @param args 
	 */
	public static void main(String[] args) {
                
		EntradaBlogCP e1=new EntradaBlogCP (1,"ana","Últimas noticias, está disponible BixBy 2.0");
		System.out.println(e1);
	}
}
