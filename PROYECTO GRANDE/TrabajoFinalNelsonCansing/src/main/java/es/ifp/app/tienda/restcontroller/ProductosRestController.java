package es.ifp.app.tienda.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.ifp.app.tienda.modelo.entity.Producto;
import es.ifp.app.tienda.repository.ProductoRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class ProductosRestController.
 */
@RestController
@RequestMapping("/productos")
@CrossOrigin(origins="*")

public class ProductosRestController {

    /** The p repo. */
    @Autowired
    private ProductoRepository pRepo;

    /**
     * Obtener productos.
     *
     * @param idTipo the id tipo
     * @return the list
     */
    @GetMapping("/producto/{idTipo}")
    public List<Producto> obtenerProductos(@PathVariable int idTipo) {
        return pRepo.findByTipo(idTipo);
    }
}