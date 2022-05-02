package com.cenfotec.libros.librosGraphQL.mutation;

import com.cenfotec.libros.librosGraphQL.entities.Libro;
import com.cenfotec.libros.librosGraphQL.services.LibroService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LibroMutation implements GraphQLMutationResolver {
    @Autowired
    private LibroService libroService;

    public Libro createLibro(String titulo, String
            ISBN , String estado) {
        return this.libroService.createLibro(titulo, ISBN,
                estado );
    }

    public Libro updateLibro (int id, String titulo, String ISBN, String estado)  {

        return libroService.updateLibro(id,titulo,ISBN,estado);
    }

    public Libro updateLibroEstado (int id, String estado)  {

        return libroService.updateLibroEstado(id,estado);
    }
}
