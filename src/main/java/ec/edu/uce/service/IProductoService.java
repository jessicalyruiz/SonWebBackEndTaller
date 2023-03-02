package ec.edu.uce.service;

import java.util.List;

import ec.edu.uce.repository.modelo.Producto;

public interface IProductoService {

	public void create(Producto producto);
	public Producto read(Integer id); 
	public void update(Producto producto); 
	public void delete(Integer id);
	List<Producto> buscarProductoCategoria(String categoria);
	
	
	Producto buscarId(Integer id);
	Producto buscarCodigo(Integer codigo);
	Producto buscarNombre(String nombre);
	List<Producto> buscarTodos();
}
