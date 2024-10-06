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
@RequestMapping("/api/v1/Clientes")
public class ClienteController {

    @GetMapping()
    public String listaClientes() {
        return "Lista de todas las Clientes - GET";
    }

    @GetMapping("/{id}")
    public String listaCliente(@PathVariable int id) {
        return "Obtener una Cliente por id - GET" + id;
    }

    @PostMapping()
    public String agregarCliente(@RequestBody String Cliente) {
        return "Agregar una Cliente - POST" + Cliente;
    }

    @PutMapping("/{id}")
    public String actualizarCliente(@RequestBody String Cliente, @PathVariable int id) {
        return "Actualizar una Cliente - PUT" + Cliente + "en: " + id;
    }

    @DeleteMapping("/{id}")
    public String eliminarCliente(@PathVariable int id) {
        return "Eliminar una Cliente - DELETE" + id;
    }
}
