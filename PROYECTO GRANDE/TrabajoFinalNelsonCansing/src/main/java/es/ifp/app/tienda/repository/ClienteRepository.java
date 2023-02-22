package es.ifp.app.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.ifp.app.tienda.modelo.entity.Cliente;

// TODO: Auto-generated Javadoc
/**
 * The Interface ClienteRepository.
 */
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	
	/**
	 * Find by username and password.
	 *
	 * @param username the username
	 * @param password the password
	 * @return the cliente
	 */
	public Cliente findByUsernameAndPassword(String username, String password);

	/**
	 * Find by username.
	 *
	 * @param username the username
	 * @return the cliente
	 */
	public Cliente findByUsername(String username);

}
