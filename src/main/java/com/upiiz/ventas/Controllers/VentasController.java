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
@RequestMapping("/api/v1/Ventas")
public class VentasController {

    @GetMapping()
    public String listaVentas() {
        return "Lista de todas las Ventas - GET";
    }

    @GetMapping("/{id}")
    public String listaVenta(@PathVariable int id) {
        return "Obtener una Venta por id - GET" + id;
    }

    @PostMapping()
    public String agregarVenta(@RequestBody String Venta) {
        return "Agregar una Venta - POST" + Venta;
    }

    @PutMapping("/{id}")
    public String actualizarVenta(@RequestBody String Venta, @PathVariable int id) {
        return "Actualizar una Venta - PUT" + Venta + "en: " + id;
    }

    @DeleteMapping("/{id}")
    public String eliminarVenta(@PathVariable int id) {
        return "Eliminar una Venta - DELETE" + id;
    }
}
