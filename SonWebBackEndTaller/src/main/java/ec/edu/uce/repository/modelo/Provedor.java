package ec.edu.uce.repository.modelo;


import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "provedor")
public class Provedor {

	@Id
	@Column(name = "prov_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_proveedor")
	@SequenceGenerator(name = "seq_proveedor", sequenceName = "seq_proveedor", allocationSize = 1)
	private Integer id;
	
	
	@Column(name = "prov_nombre")
	private String nombre;
	
	@Column(name = "prov_ruc")
	private String ruc;

	@Column(name = "prov_telefono")
	private String telefono;

	
	@Column(name = "prov_email")
	private String email;
	
	
	@Column(name = "prov_ciudad")
	private String ciudad;
	
	

	
	@OneToMany(mappedBy = "provedor")
	private List<Producto> productos;




	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getRuc() {
		return ruc;
	}




	public void setRuc(String ruc) {
		this.ruc = ruc;
	}




	public String getTelefono() {
		return telefono;
	}




	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getCiudad() {
		return ciudad;
	}




	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}




	public List<Producto> getProductos() {
		return productos;
	}




	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}




	@Override
	public String toString() {
		return "Provedor [id=" + id + ", nombre=" + nombre + ", ruc=" + ruc + ", telefono=" + telefono + ", email="
				+ email + ", ciudad=" + ciudad + "]";
	}
	

	
	
	
	
}