package es.ifp.app.tienda.modelo.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


// TODO: Auto-generated Javadoc
/**
 * The Class TiposProducto.
 */
@Entity
@Table(name="tipos_producto")
@NamedQuery(name="TiposProducto.findAll", query="SELECT t FROM TiposProducto t")
public class TiposProducto implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

		/** The id tipo. */
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="ID_TIPO")
		private int idTipo;

		/** The nombre tipo. */
		@Column(name="NOMBRE_TIPO")
		private String nombreTipo;

		/**
		 * Gets the id tipo.
		 *
		 * @return the id tipo
		 */
		public int getIdTipo() {
			return idTipo;
		}

		/**
		 * Sets the id tipo.
		 *
		 * @param idTipo the new id tipo
		 */
		public void setIdTipo(int idTipo) {
			this.idTipo = idTipo;
		}

		/**
		 * Gets the nombre tipo.
		 *
		 * @return the nombre tipo
		 */
		public String getNombreTipo() {
			return nombreTipo;
		}

		/**
		 * Sets the nombre tipo.
		 *
		 * @param nombreTipo the new nombre tipo
		 */
		public void setNombreTipo(String nombreTipo) {
			this.nombreTipo = nombreTipo;
		}

		/**
		 * Hash code.
		 *
		 * @return the int
		 */
		@Override
		public int hashCode() {
			return Objects.hash(idTipo);
		}

		/**
		 * Equals.
		 *
		 * @param obj the obj
		 * @return true, if successful
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!(obj instanceof TiposProducto))
				return false;
			TiposProducto other = (TiposProducto) obj;
			return idTipo == other.idTipo;
		}
	
}
