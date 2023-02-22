package es.ifp.app.tienda.modelo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


// TODO: Auto-generated Javadoc
/**
 * The persistent class for the tarjetas_bancarias database table.
 * 
 */
@Entity
@Table(name="tarjetas_bancarias")
@NamedQuery(name="TarjetasBancaria.findAll", query="SELECT t FROM TarjetasBancaria t")
public class TarjetasBancaria implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The I D tarjeta. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ID_Tarjeta;

	/** The cvv. */
	private int cvv;

	/** The fecha caducidad. */
	@Temporal(TemporalType.DATE)
	private Date fecha_Caducidad;

	/** The nombre titular. */
	private String nombre_Titular;

	/** The numero tarjeta. */
	private String numero_Tarjeta;

	/**
	 * Instantiates a new tarjetas bancaria.
	 */
	public TarjetasBancaria() {
	}

	/**
	 * Gets the i D tarjeta.
	 *
	 * @return the i D tarjeta
	 */
	public int getID_Tarjeta() {
		return this.ID_Tarjeta;
	}

	/**
	 * Sets the i D tarjeta.
	 *
	 * @param ID_Tarjeta the new i D tarjeta
	 */
	public void setID_Tarjeta(int ID_Tarjeta) {
		this.ID_Tarjeta = ID_Tarjeta;
	}

	/**
	 * Gets the cvv.
	 *
	 * @return the cvv
	 */
	public int getCvv() {
		return this.cvv;
	}

	/**
	 * Sets the cvv.
	 *
	 * @param cvv the new cvv
	 */
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	/**
	 * Gets the fecha caducidad.
	 *
	 * @return the fecha caducidad
	 */
	public Date getFecha_Caducidad() {
		return this.fecha_Caducidad;
	}

	/**
	 * Sets the fecha caducidad.
	 *
	 * @param fecha_Caducidad the new fecha caducidad
	 */
	public void setFecha_Caducidad(Date fecha_Caducidad) {
		this.fecha_Caducidad = fecha_Caducidad;
	}

	/**
	 * Gets the nombre titular.
	 *
	 * @return the nombre titular
	 */
	public String getNombre_Titular() {
		return this.nombre_Titular;
	}

	/**
	 * Sets the nombre titular.
	 *
	 * @param nombre_Titular the new nombre titular
	 */
	public void setNombre_Titular(String nombre_Titular) {
		this.nombre_Titular = nombre_Titular;
	}

	/**
	 * Gets the numero tarjeta.
	 *
	 * @return the numero tarjeta
	 */
	public String getNumero_Tarjeta() {
		return this.numero_Tarjeta;
	}

	/**
	 * Sets the numero tarjeta.
	 *
	 * @param numero_Tarjeta the new numero tarjeta
	 */
	public void setNumero_Tarjeta(String numero_Tarjeta) {
		this.numero_Tarjeta = numero_Tarjeta;
	}

}