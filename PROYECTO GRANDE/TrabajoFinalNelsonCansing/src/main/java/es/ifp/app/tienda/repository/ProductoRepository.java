package es.ifp.app.tienda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.ifp.app.tienda.modelo.entity.Producto;

// TODO: Auto-generated Javadoc
/**
 * The Interface ProductoRepository.
 */
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

	
	/**
	 * Find by tipo.
	 *
	 * @param idTipo the id tipo
	 * @return the list
	 */
	@Query("select p from Producto p where p.tiposProducto.idTipo = ?1")
	public List<Producto> findByTipo(int idTipo);
}
