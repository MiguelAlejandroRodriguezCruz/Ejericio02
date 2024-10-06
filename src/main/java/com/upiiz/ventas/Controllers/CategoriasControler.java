package com.upiiz.ventas.Controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/Categorias")
public class CategoriasControler {

    @GetMapping()
    public String listaCategorias() {
        return "Lista de todas las categorias - GET";
    }

    @GetMapping("/{id}")
    public String listaCategoria(@PathVariable int id) {
        return "Obtener una categoria por id - GET" + id;
    }

    @PostMapping()
    public String agregarCategoria(@RequestBody String categoria) {
        return "Agregar una categoria - POST" + categoria;
    }

    @PutMapping("/{id}")
    public String actualizarCategoria(@RequestBody String categoria, @PathVariable int id) {
        return "Actualizar una categoria - PUT" + categoria + "en: " + id;
    }

    @DeleteMapping("/{id}")
    public String eliminarCategoria(@PathVariable int id) {
        return "Eliminar una categoria - DELETE" + id;
    }
}
