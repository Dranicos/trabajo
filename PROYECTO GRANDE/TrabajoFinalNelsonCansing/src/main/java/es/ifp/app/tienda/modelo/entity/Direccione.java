package es.ifp.app.tienda.modelo.entity;

import java.io.Serializable;
import javax.persistence.*;


// TODO: Auto-generated Javadoc
/**
 * The persistent class for the direcciones database table.
 * 
 */
@Entity
@Table(name="direcciones")
@NamedQuery(name="Direccione.findAll", query="SELECT d FROM Direccione d")
public class Direccione implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The I D direccion. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ID_Direccion;

	/** The calle. */
	private String calle;

	/** The codigo postal. */
	private String codigo_Postal;

	/** The letra. */
	private String letra;

	/** The localidad. */
	private String localidad;

	/** The numero. */
	private int numero;

	/** The piso. */
	private int piso;

	/**
	 * Instantiates a new direccione.
	 */
	public Direccione() {
	}

	/**
	 * Gets the i D direccion.
	 *
	 * @return the i D direccion
	 */
	public int getID_Direccion() {
		return this.ID_Direccion;
	}

	/**
	 * Sets the i D direccion.
	 *
	 * @param ID_Direccion the new i D direccion
	 */
	public void setID_Direccion(int ID_Direccion) {
		this.ID_Direccion = ID_Direccion;
	}

	/**
	 * Gets the calle.
	 *
	 * @return the calle
	 */
	public String getCalle() {
		return this.calle;
	}

	/**
	 * Sets the calle.
	 *
	 * @param calle the new calle
	 */
	public void setCalle(String calle) {
		this.calle = calle;
	}

	/**
	 * Gets the codigo postal.
	 *
	 * @return the codigo postal
	 */
	public String getCodigo_Postal() {
		return this.codigo_Postal;
	}

	/**
	 * Sets the codigo postal.
	 *
	 * @param codigo_Postal the new codigo postal
	 */
	public void setCodigo_Postal(String codigo_Postal) {
		this.codigo_Postal = codigo_Postal;
	}

	/**
	 * Gets the letra.
	 *
	 * @return the letra
	 */
	public String getLetra() {
		return this.letra;
	}

	/**
	 * Sets the letra.
	 *
	 * @param letra the new letra
	 */
	public void setLetra(String letra) {
		this.letra = letra;
	}

	/**
	 * Gets the localidad.
	 *
	 * @return the localidad
	 */
	public String getLocalidad() {
		return this.localidad;
	}

	/**
	 * Sets the localidad.
	 *
	 * @param localidad the new localidad
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	/**
	 * Gets the numero.
	 *
	 * @return the numero
	 */
	public int getNumero() {
		return this.numero;
	}

	/**
	 * Sets the numero.
	 *
	 * @param numero the new numero
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Gets the piso.
	 *
	 * @return the piso
	 */
	public int getPiso() {
		return this.piso;
	}

	/**
	 * Sets the piso.
	 *
	 * @param piso the new piso
	 */
	public void setPiso(int piso) {
		this.piso = piso;
	}

}