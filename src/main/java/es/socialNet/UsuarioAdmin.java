package es.socialNet;

public class UsuarioAdmin implements Usuario
{
	private CrearComentario nuevoComentario;
	
	
	public UsuarioAdmin(CrearComentario nuevoComentario) {
		this.nuevoComentario = nuevoComentario;
	}
	@Override
	public String comentario() {
		// TODO Auto-generated method stub
		return "Comentario de un usuario básico: " + nuevoComentario.getTextoComentario();
	}

	@Override
	public String crearPublicacion() {
		// TODO Auto-generated method stub
		return "Publicación de admin";
	}
	public String getNuevoComentario() 
	{
		return "comentario de admin (clase UsuarioAdmin): " + nuevoComentario.getTextoComentario();
	}

}
