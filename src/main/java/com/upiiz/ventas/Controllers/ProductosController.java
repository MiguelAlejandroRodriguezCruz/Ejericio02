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
@RequestMapping("/api/v1/Productos")
public class ProductosController {

    @GetMapping()
    public String listaProductos() {
        return "Lista de todas las Productos - GET";
    }

    @GetMapping("/{id}")
    public String listaProducto(@PathVariable int id) {
        return "Obtener una Producto por id - GET" + id;
    }

    @PostMapping()
    public String agregarProducto(@RequestBody String Producto) {
        return "Agregar una Producto - POST" + Producto;
    }

    @PutMapping("/{id}")
    public String actualizarProducto(@RequestBody String Producto, @PathVariable int id) {
        return "Actualizar una Producto - PUT" + Producto + "en: " + id;
    }

    @DeleteMapping("/{id}")
    public String eliminarProducto(@PathVariable int id) {
        return "Eliminar una Producto - DELETE" + id;
    }
}
