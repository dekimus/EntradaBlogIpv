package entradablogipv;
/**Clase para manejar las entradas de un blog.
 * @author Israel Pérez.
 * @since 12/02/2022
 * @version 2.3
 */
public class EntradaBlogIpv {
    /**
     * separador es el ccarácter que separa ENTRADA DE del
     * nombre del autor
     */
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	

    /**
     * Constructor de la clase. recibe el número de entrada, el nombre del autor
     * de la entrada y el texto que contiene la entrada. Si el número de entrada
     * es negativo, lanza una excepción.
     * @param id int no negativo
     * @param autor String
     * @param texto String
     * @throws IllegalArgumentException al introducir un negativo
     */
	public EntradaBlogIpv(int id,String autor,String texto)throws IllegalArgumentException{
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
     * Devuelve el número de la entrada
     * @return id int
     */
	public int getId(){
		return this.id;
	}
	
	

    /**
     * devuelve el texto completo de la entrada
     * @return texto String
     */
	public String getTexto(){
		return this.texto;
	}
	
	

    /**
     * devuelve el nombre del autor de la entrada en mayúsculas
     * @return autor.upperCase String
     */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	

    /**
     * devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
     * @return autor String
     */
	public String devuelveAutor(){
		return this.autor;
	}
	
	

    /**
     * No tiene porqué tener argumentos.
     * @param args parámetros no necesarios
     */
	public static void main(String[] args) {
                //Modificar.
		EntradaBlogIpv e1=new EntradaBlogIpv (1,"ana","Últimas noticias, está disponible BixBy 2.0");
		System.out.println(e1);
	}
}