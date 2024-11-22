package hn.unah.poo.examenii.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import hn.unah.poo.examenii.dtos.DueniosDTO;
import hn.unah.poo.examenii.modelmapper.ModelmapperSingleton;
import hn.unah.poo.examenii.modelos.Duenios;
import hn.unah.poo.examenii.repositorio.DueniosRepositorio;

@Service
public class DueniosService {

    ModelMapper modelmapper = ModelmapperSingleton.getInstance();

    @Autowired
    DueniosRepositorio dueniosRepositorio;

    @Autowired
    DueniosDTO dueniosDTO;

    public List<Duenios> obtenerTodos() {

        return dueniosRepositorio.findAll();
    }

    public DueniosDTO Crear(DueniosDTO nvoDuenio) {

        if (nvoDuenio != null) {

        }
        Duenios duenioBD = modelmapper.map(nvoDuenio, Duenios.class);

        dueniosRepositorio.save(duenioBD);
        return nvoDuenio;
    }

    @GetMapping("buscar/{dni}")
    public String buscar(@PathVariable(name = "dni") String dni) {

        if (!dueniosRepositorio.existsById(dni)) {
            return "Dueño no existe";

        }

        return "Dueño encontrado";
    }

    public String eliminar(@RequestParam(name = "dni") String dni) {

        if (!dueniosRepositorio.existsById(dni)) {
            return "El Dueño no existe";
        }
        dueniosRepositorio.deleteById(dni);
        return "Cliente Eliminado";
    }
}
