package es.ifp.app.tienda.modelo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


// TODO: Auto-generated Javadoc
/**
 * The persistent class for the pedidos database table.
 * 
 */
@Entity
@Table(name="pedidos")
@NamedQuery(name="Pedido.findAll", query="SELECT p FROM Pedido p")
public class Pedido implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The I D pedidos. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ID_Pedidos;

	/** The estado. */
	private String estado;

	/** The compras productos. */
	//bi-directional many-to-one association to ComprasProducto
	@OneToMany(mappedBy="pedido", cascade={CascadeType.PERSIST})
	private List<ComprasProducto> comprasProductos;

	/** The cliente. */
	//uni-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="ID_Cliente")
	private Cliente cliente;

	/** The direcciones. */
	//uni-directional many-to-one association to Direccione
	@ManyToOne
	@JoinColumn(name="ID_Direccion")
	private Direccione direcciones;

	/** The tarjetas bancaria. */
	//uni-directional many-to-one association to TarjetasBancaria
	@ManyToOne
	@JoinColumn(name="ID_Tarjeta")
	private TarjetasBancaria tarjetasBancaria;

	/**
	 * Instantiates a new pedido.
	 */
	public Pedido() {
	}

	/**
	 * Gets the i D pedidos.
	 *
	 * @return the i D pedidos
	 */
	public int getID_Pedidos() {
		return this.ID_Pedidos;
	}

	/**
	 * Sets the i D pedidos.
	 *
	 * @param ID_Pedidos the new i D pedidos
	 */
	public void setID_Pedidos(int ID_Pedidos) {
		this.ID_Pedidos = ID_Pedidos;
	}

	/**
	 * Gets the estado.
	 *
	 * @return the estado
	 */
	public String getEstado() {
		return this.estado;
	}

	/**
	 * Sets the estado.
	 *
	 * @param estado the new estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * Gets the compras productos.
	 *
	 * @return the compras productos
	 */
	public List<ComprasProducto> getComprasProductos() {
		return this.comprasProductos;
	}

	/**
	 * Sets the compras productos.
	 *
	 * @param comprasProductos the new compras productos
	 */
	public void setComprasProductos(List<ComprasProducto> comprasProductos) {
		this.comprasProductos = comprasProductos;
	}

	/**
	 * Adds the compras producto.
	 *
	 * @param comprasProducto the compras producto
	 * @return the compras producto
	 */
	public ComprasProducto addComprasProducto(ComprasProducto comprasProducto) {
		getComprasProductos().add(comprasProducto);
		comprasProducto.setPedido(this);

		return comprasProducto;
	}

	/**
	 * Removes the compras producto.
	 *
	 * @param comprasProducto the compras producto
	 * @return the compras producto
	 */
	public ComprasProducto removeComprasProducto(ComprasProducto comprasProducto) {
		getComprasProductos().remove(comprasProducto);
		comprasProducto.setPedido(null);

		return comprasProducto;
	}

	/**
	 * Gets the cliente.
	 *
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return this.cliente;
	}

	/**
	 * Sets the cliente.
	 *
	 * @param cliente the new cliente
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * Gets the direcciones.
	 *
	 * @return the direcciones
	 */
	public Direccione getDirecciones() {
		return this.direcciones;
	}

	/**
	 * Sets the direcciones.
	 *
	 * @param direcciones the new direcciones
	 */
	public void setDirecciones(Direccione direcciones) {
		this.direcciones = direcciones;
	}

	/**
	 * Gets the tarjetas bancaria.
	 *
	 * @return the tarjetas bancaria
	 */
	public TarjetasBancaria getTarjetasBancaria() {
		return this.tarjetasBancaria;
	}

	/**
	 * Sets the tarjetas bancaria.
	 *
	 * @param tarjetasBancaria the new tarjetas bancaria
	 */
	public void setTarjetasBancaria(TarjetasBancaria tarjetasBancaria) {
		this.tarjetasBancaria = tarjetasBancaria;
	}

}