package es.ifp.app.tienda.modelo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


// TODO: Auto-generated Javadoc
/**
 * The persistent class for the compras_productos database table.
 * 
 */
@Entity
@Table(name="compras_productos")
@NamedQuery(name="ComprasProducto.findAll", query="SELECT c FROM ComprasProducto c")
public class ComprasProducto implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The num orden. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int num_Orden;

	/** The cantidad. */
	private int cantidad;

	/** The precio venta. */
	@Column(name="precio_venta")
	private BigDecimal precioVenta;

	/** The pedido. */
	//bi-directional many-to-one association to Pedido
	@ManyToOne
	@JoinColumn(name="ID_Pedidos")
	private Pedido pedido;

	/** The producto. */
	//uni-directional many-to-one association to Producto
	@ManyToOne
	@JoinColumn(name="ID_Producto")
	private Producto producto;

	/**
	 * Instantiates a new compras producto.
	 */
	public ComprasProducto() {
	}

	/**
	 * Gets the num orden.
	 *
	 * @return the num orden
	 */
	public int getNum_Orden() {
		return this.num_Orden;
	}

	/**
	 * Sets the num orden.
	 *
	 * @param num_Orden the new num orden
	 */
	public void setNum_Orden(int num_Orden) {
		this.num_Orden = num_Orden;
	}

	/**
	 * Gets the cantidad.
	 *
	 * @return the cantidad
	 */
	public int getCantidad() {
		return this.cantidad;
	}

	/**
	 * Sets the cantidad.
	 *
	 * @param cantidad the new cantidad
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * Gets the precio venta.
	 *
	 * @return the precio venta
	 */
	public BigDecimal getPrecioVenta() {
		return this.precioVenta;
	}

	/**
	 * Sets the precio venta.
	 *
	 * @param precioVenta the new precio venta
	 */
	public void setPrecioVenta(BigDecimal precioVenta) {
		this.precioVenta = precioVenta;
	}

	/**
	 * Gets the pedido.
	 *
	 * @return the pedido
	 */
	public Pedido getPedido() {
		return this.pedido;
	}

	/**
	 * Sets the pedido.
	 *
	 * @param pedido the new pedido
	 */
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	/**
	 * Gets the producto.
	 *
	 * @return the producto
	 */
	public Producto getProducto() {
		return this.producto;
	}

	/**
	 * Sets the producto.
	 *
	 * @param producto the new producto
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}