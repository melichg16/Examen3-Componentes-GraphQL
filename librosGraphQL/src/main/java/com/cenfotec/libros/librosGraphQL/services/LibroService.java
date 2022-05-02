package com.cenfotec.libros.librosGraphQL.services;

import com.cenfotec.libros.librosGraphQL.entities.Libro;
import com.cenfotec.libros.librosGraphQL.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class LibroService {
    @Autowired
    LibroRepository libroRepo;


    public List<Libro> getAllLibros(int count) {
        return
                this.libroRepo.findAll().stream().limit(count).collect(Collectors.toList());
    }

    public Optional<Libro> getLibro(int id) {
        return this.libroRepo.findById(id);
    }

    public Libro createLibro(String titulo, String ISBN,
                             String estado) {

        Libro libro = new Libro();
        libro.setTitulo(titulo);
        libro.setISBN(ISBN);
        libro.setEstado(estado);

        return this.libroRepo.save(libro);
    }

    public Libro updateLibro (int id, String titulo, String ISBN, String estado)  {
        Optional<Libro> optionalLibro = libroRepo.findById(id);

        if (optionalLibro.isPresent()) {
            Libro libro = optionalLibro.get();

            if (titulo != null)
                libro.setTitulo(titulo);
            if (ISBN != null)
                libro.setISBN(ISBN);
            if(estado!= null)
                libro.setEstado(estado);
            libroRepo.save(libro);
            return libro;
        }
        return null;
    }

    public Libro updateLibroEstado (int id, String estado)  {
        Optional<Libro> optionalLibro = libroRepo.findById(id);

        if (optionalLibro.isPresent()) {
            Libro libro = optionalLibro.get();
            if(estado!= null)
                libro.setEstado(estado);
            libroRepo.save(libro);
            return libro;
        }
        return null;
    }
}
