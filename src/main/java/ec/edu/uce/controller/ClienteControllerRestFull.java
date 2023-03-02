package ec.edu.uce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.uce.repository.modelo.Producto;
import ec.edu.uce.service.IProductoService;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteControllerRestFull {

	@Autowired
	IProductoService productoService;
	
	@GetMapping(path = "/productos")
	public List<Producto> obtenerProductosCategoria(@RequestParam String categoria){
		return this.productoService.buscarProductoCategoria(categoria);
	}
	
	@GetMapping(path = "/productos")
	public List<Producto> obtenerProductos(){
		return this.productoService.buscarTodos();
	}
	
	@GetMapping(path = "productos/porId/{id}")
	public Producto obtenerProductoId(@PathVariable("id") Integer id) {
		return this.productoService.buscarId(id);
	}
	@GetMapping(path = "productos/porCodigo/{codigo}")
	public Producto obtenerProductoCodigo(@PathVariable("codigo") Integer codigo) {
		return this.productoService.buscarCodigo(codigo) ;
	}
	@GetMapping(path = "productos/porNombre/{nombre}")
	public Producto obtenerProductoNombre(@PathVariable("nombre") String nombre) {
		return this.productoService.buscarNombre(nombre);
	}
}
