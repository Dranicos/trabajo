package es.ifp.app.tienda.modelo.entity;

import java.io.Serializable;
import javax.persistence.*;


// TODO: Auto-generated Javadoc
/**
 * The persistent class for the productos database table.
 * 
 */
@Entity
@Table(name="productos")
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
public class Producto implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The I D producto. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ID_Producto;

	/** The descripcion. */
	private String descripcion;

	/** The img. */
	private String img;

	/** The nombre. */
	private String nombre;

	/** The precio. */
	private double precio;

	/** The stock. */
	private int stock;
	
	/** The tipos producto. */
	@ManyToOne
	@JoinColumn(name="ID_TIPO")
	private TiposProducto tiposProducto;

	/**
	 * Instantiates a new producto.
	 */
	public Producto() {
	}

	/**
	 * Gets the i D producto.
	 *
	 * @return the i D producto
	 */
	public int getID_Producto() {
		return this.ID_Producto;
	}

	/**
	 * Sets the i D producto.
	 *
	 * @param ID_Producto the new i D producto
	 */
	public void setID_Producto(int ID_Producto) {
		this.ID_Producto = ID_Producto;
	}

	/**
	 * Gets the descripcion.
	 *
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return this.descripcion;
	}

	/**
	 * Sets the descripcion.
	 *
	 * @param descripcion the new descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Gets the img.
	 *
	 * @return the img
	 */
	public String getImg() {
		return this.img;
	}

	/**
	 * Sets the img.
	 *
	 * @param img the new img
	 */
	public void setImg(String img) {
		this.img = img;
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
	 * Gets the precio.
	 *
	 * @return the precio
	 */
	public double getPrecio() {
		return this.precio;
	}

	/**
	 * Sets the precio.
	 *
	 * @param precio the new precio
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * Gets the stock.
	 *
	 * @return the stock
	 */
	public int getStock() {
		return this.stock;
	}

	/**
	 * Sets the stock.
	 *
	 * @param stock the new stock
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

}