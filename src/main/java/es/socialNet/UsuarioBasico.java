package es.socialNet;

public class UsuarioBasico implements Usuario
{
	private CrearComentario nuevoComentario;
	@Override
	public String comentario() 
	{
		// TODO Auto-generated method stub
		return "Comentario de un usuario básico: " + nuevoComentario.getTextoComentario();
	}
	public String crearPublicacion()
	{
		return "Publicación de un usuario";
	}
}
