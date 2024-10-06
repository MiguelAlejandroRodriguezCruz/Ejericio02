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
@RequestMapping("/api/v1/Proveedores")
public class ProveedoresController {

    @GetMapping()
    public String listaProveedores() {
        return "Lista de todas las Proveedores - GET";
    }

    @GetMapping("/{id}")
    public String listaProveedore(@PathVariable int id) {
        return "Obtener una Proveedore por id - GET" + id;
    }

    @PostMapping()
    public String agregarProveedore(@RequestBody String Proveedore) {
        return "Agregar una Proveedore - POST" + Proveedore;
    }

    @PutMapping("/{id}")
    public String actualizarProveedore(@RequestBody String Proveedore, @PathVariable int id) {
        return "Actualizar una Proveedore - PUT" + Proveedore + "en: " + id;
    }

    @DeleteMapping("/{id}")
    public String eliminarProveedore(@PathVariable int id) {
        return "Eliminar una Proveedore - DELETE" + id;
    }
}
