package ec.edu.uce.repository.modelo;

import java.time.LocalDateTime;
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
@Table(name = "pedido")
public class Pedido {
	@Id
	@Column(name = "pedi_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pedi")
	@SequenceGenerator(name = "seq_pedi", sequenceName = "seq_pedi", allocationSize = 1)
	private Integer id;
	
	@Column(name = "pedi_codigo")
	private String codigo;
	
	@OneToMany(mappedBy = "pedido")
	private List<Producto> productos;
	
	
	@ManyToOne( cascade = {
            CascadeType.MERGE,
            CascadeType.REFRESH
        })
	@JoinColumn(name="pedi_fk_cliente")
	private Usuario usuario;
	
	@OneToOne( cascade = CascadeType.ALL)
	@JoinColumn(name="pedi_fk_pago")
	private Pago pago;
	
	@OneToOne( cascade = CascadeType.ALL)
	@JoinColumn(name="pedi_fk_factura")
	private Factura factura;
	
	@Column(name = "pedi_fecha", columnDefinition = "TIMESTAMP")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private LocalDateTime fecha;
	

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Pago getPago() {
		return pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", codigo=" + codigo + "]";
	}
	
	
	
}