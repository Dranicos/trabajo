package es.ifp.app.tienda.modelo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.ifp.app.tienda.modelo.entity.Direccione;
import es.ifp.app.tienda.repository.DireccionRepository;


// TODO: Auto-generated Javadoc
/**
 * The Class DireccionServiceImpl.
 */
@Service
public class DireccionServiceImpl implements DireccionService{

	/** The d repo. */
	@Autowired
	DireccionRepository dRepo;
	
	/**
	 * Registro direccion.
	 *
	 * @param direccion the direccion
	 * @return the direccione
	 */
	@Override
	public Direccione registroDireccion(Direccione direccion) {
			
			return dRepo.save(direccion);
		}
	}
