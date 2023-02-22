package es.ifp.app.tienda.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.ifp.app.tienda.modelo.entity.Cliente;
import es.ifp.app.tienda.modelo.entity.Direccione;
import es.ifp.app.tienda.modelo.entity.Producto;
import es.ifp.app.tienda.modelo.entity.TarjetasBancaria;
import es.ifp.app.tienda.modelo.service.DireccionService;
import es.ifp.app.tienda.repository.ClienteRepository;



// TODO: Auto-generated Javadoc
/**
 * The Class ClienteRestController.
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/inicio")
public class ClienteRestController {

	/** The c repo. */
	@Autowired
	private ClienteRepository cRepo;


	/**
	 * Loguear.
	 *
	 * @param cliente the cliente
	 * @return the cliente
	 */
	@PostMapping("/login")
	public Cliente loguear(@RequestBody Cliente cliente) {
		Cliente usuario1 = cRepo.findByUsernameAndPassword(cliente.getUsername(), cliente.getPassword());
		Cliente usuario2 = new Cliente();
		if (usuario1 == null) {		
			return usuario2;
		} else {
			return usuario1;
		}
	}

	/**
	 * Registrar.
	 *
	 * @param cliente the cliente
	 * @return the cliente
	 */
	@PostMapping("/registrar")
	public Cliente registrar(@RequestBody Cliente cliente) {
	    return cRepo.save(cliente);
	}
	
	/**
	 * Registro direccion.
	 *
	 * @param direccion the direccion
	 * @param username the username
	 * @return the cliente
	 */
	@PostMapping("/direcciones/{username}")
	public Cliente registroDireccion(@RequestBody Direccione direccion, @PathVariable("username") String username) {
		
		Cliente cliente = cRepo.findByUsername(username);
		cliente.addDireccion(direccion);
		return cRepo.save(cliente);
		
	}
	
	/**
	 * Delete direccion.
	 *
	 * @param direccion the direccion
	 * @param username the username
	 * @return the cliente
	 */
	@DeleteMapping("/direcciones/{username}")
	public Cliente deleteDireccion(@RequestBody Direccione direccion, @PathVariable("username") String username) {
		
		Cliente cliente = cRepo.findByUsername(username);
		cliente.removeDireccion(direccion);
		return cRepo.save(cliente);
	}
	
	/**
	 * Direcciones usuario.
	 *
	 * @param username the username
	 * @return the list
	 */
	@GetMapping("/direcciones/{username}")
	public List<Direccione> direccionesUsuario( @PathVariable("username") String username) {
		return cRepo.findByUsername(username).getDirecciones();
	}
}