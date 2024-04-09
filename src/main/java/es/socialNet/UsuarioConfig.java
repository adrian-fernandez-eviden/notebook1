package es.socialNet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("es.pildoras.pruebaannotations")
public class UsuarioConfig 
{
	@Bean
	public CrearComentario nuevoComentario()
	{
		return new ComentarioAdmin();
	}
	@Bean
	public Usuario usuarioAdmin()
	{
		return new UsuarioAdmin(nuevoComentario());
	}
}

