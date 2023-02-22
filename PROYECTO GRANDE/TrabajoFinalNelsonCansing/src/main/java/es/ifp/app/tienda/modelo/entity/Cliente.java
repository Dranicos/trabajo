package es.ifp.app.tienda.modelo.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


// TODO: Auto-generated Javadoc
/**
 * The persistent class for the clientes database table.
 * 
 */
@Entity
@Table(name="clientes")
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The I D cliente. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ID_Cliente;

	/** The apellidos. */
	private String apellidos;

	/** The password. */
	private String password;

	/** The email. */
	private String email;

	/** The fecha nacimiento. */
	@Temporal(TemporalType.DATE)
	private Date fecha_Nacimiento;

	/** The nombre. */
	private String nombre;

	/** The username. */
	private String username;

	/** The direcciones. */
	//uni-directional many-to-many association to Direccione
	@ManyToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(
		name="clientes_direcciones"
		, joinColumns={
			@JoinColumn(name="ID_Cliente")
			}
		, inverseJoinColumns={
			@JoinColumn(name="ID_Direccion")
			}
		)
	private List<Direccione> direcciones;

	/** The tarjetas bancarias. */
	//uni-directional many-to-many association to TarjetasBancaria
	@ManyToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(
		name="clientes_tarjetas"
		, joinColumns={
			@JoinColumn(name="ID_Cliente")
			}
		, inverseJoinColumns={
			@JoinColumn(name="ID_Tarjeta")
			}
		)
	private List<TarjetasBancaria> tarjetasBancarias;

	/**
	 * Instantiates a new cliente.
	 */
	public Cliente() {
	}

	/**
	 * Gets the i D cliente.
	 *
	 * @return the i D cliente
	 */
	public int getID_Cliente() {
		return this.ID_Cliente;
	}

	/**
	 * Sets the i D cliente.
	 *
	 * @param ID_Cliente the new i D cliente
	 */
	public void setID_Cliente(int ID_Cliente) {
		this.ID_Cliente = ID_Cliente;
	}

	/**
	 * Gets the apellidos.
	 *
	 * @return the apellidos
	 */
	public String getApellidos() {
		return this.apellidos;
	}

	/**
	 * Sets the apellidos.
	 *
	 * @param apellidos the new apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the fecha nacimiento.
	 *
	 * @return the fecha nacimiento
	 */
	public Date getFecha_Nacimiento() {
		return this.fecha_Nacimiento;
	}

	/**
	 * Sets the fecha nacimiento.
	 *
	 * @param fecha_Nacimiento the new fecha nacimiento
	 */
	public void setFecha_Nacimiento(Date fecha_Nacimiento) {
		this.fecha_Nacimiento = fecha_Nacimiento;
	}

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the username.
	 *
	 * @return the username
	 */
	public String getUsername() {
		return this.username;
	}

	/**
	 * Sets the username.
	 *
	 * @param username the new username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Gets the direcciones.
	 *
	 * @return the direcciones
	 */
	public List<Direccione> getDirecciones() {
		return this.direcciones;
	}

	/**
	 * Sets the direcciones.
	 *
	 * @param direcciones the new direcciones
	 */
	public void setDirecciones(List<Direccione> direcciones) {
		this.direcciones = direcciones;
	}

	/**
	 * Gets the tarjetas bancarias.
	 *
	 * @return the tarjetas bancarias
	 */
	public List<TarjetasBancaria> getTarjetasBancarias() {
		return this.tarjetasBancarias;
	}

	/**
	 * Sets the tarjetas bancarias.
	 *
	 * @param tarjetasBancarias the new tarjetas bancarias
	 */
	public void setTarjetasBancarias(List<TarjetasBancaria> tarjetasBancarias) {
		this.tarjetasBancarias = tarjetasBancarias;
	}
	
	/**
	 * Adds the direccion.
	 *
	 * @param direccion the direccion
	 */
	public void addDireccion(Direccione direccion) {
		if (direcciones == null)
			direcciones = new ArrayList<>();
		direcciones.add(direccion);
		
	}
	
	/**
	 * Removes the direccion.
	 *
	 * @param direccion the direccion
	 */
	public void removeDireccion(Direccione direccion) {
		if (direcciones == null)
			direcciones = new ArrayList<>();
		direcciones.remove(direccion);
		
	}
}