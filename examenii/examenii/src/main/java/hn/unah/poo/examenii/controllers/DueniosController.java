package hn.unah.poo.examenii.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.poo.examenii.dtos.DueniosDTO;
import hn.unah.poo.examenii.modelos.Duenios;
import hn.unah.poo.examenii.services.DueniosService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/duenios")
public class DueniosController {

    @Autowired
    DueniosService dueniosService;

    @GetMapping("obtenerTodos")
    public List<Duenios> obtenerTodos(@RequestParam String param) {
        return dueniosService.obtenerTodos();
    }

    @PostMapping("crear")
    public DueniosDTO Crear(@RequestBody DueniosDTO entity) {

        return dueniosService.Crear(entity);
    }

    @GetMapping("buscar/{dni}")
    public String buscar(@PathVariable(name = "dni") String dni) {
        return dueniosService.buscar(dni);
    }

    @DeleteMapping("eliminar/{dni}")
    public String eliminar(@RequestParam(name = "dni") String dni) {
        return dueniosService.eliminar(dni);
    }

}
