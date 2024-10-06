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
@RequestMapping("/api/v1/Facturas")
public class FacturasController {

    @GetMapping()
    public String listaFacturas() {
        return "Lista de todas las Facturas - GET";
    }

    @GetMapping("/{id}")
    public String listaFactura(@PathVariable int id) {
        return "Obtener una Factura por id - GET" + id;
    }

    @PostMapping()
    public String agregarFactura(@RequestBody String Factura) {
        return "Agregar una Factura - POST" + Factura;
    }

    @PutMapping("/{id}")
    public String actualizarFactura(@RequestBody String Factura, @PathVariable int id) {
        return "Actualizar una Factura - PUT" + Factura + "en: " + id;
    }

    @DeleteMapping("/{id}")
    public String eliminarFactura(@PathVariable int id) {
        return "Eliminar una Factura - DELETE" + id;
    }
}
