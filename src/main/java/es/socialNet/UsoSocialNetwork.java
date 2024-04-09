package es.socialNet;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsoSocialNetwork {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//leer el archivo de configuración
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(UsuarioConfig.class);
		
		UsuarioAdmin Pedro = contexto.getBean("usuarioAdmin", UsuarioAdmin.class);
		
		System.out.println(Pedro.getNuevoComentario());
	}

}
