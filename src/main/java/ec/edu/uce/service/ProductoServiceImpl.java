package ec.edu.uce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.repository.IProductoRepo;
import ec.edu.uce.repository.modelo.Producto;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private IProductoRepo productoRepo;

	@Override
	public void create(Producto producto) {
		// TODO Auto-generated method stub
		
		
		this.productoRepo.create(producto);
	}

	@Override
	public Producto read(Integer id) {
		// TODO Auto-generated method stub
		return this.productoRepo.read(id);
	}

	@Override
	public void update(Producto producto) {
		// TODO Auto-generated method stub
		this.productoRepo.update(producto);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.productoRepo.delete(id);
	}

	@Override
	public List<Producto> buscarProductoCategoria(String categoria) {
		// TODO Auto-generated method stub
		return this.productoRepo.buscarProductoCategoria(categoria);
	}

	@Override
	public Producto buscarId(Integer id) {
		// TODO Auto-generated method stub
		return this.productoRepo.buscarId(id);
	}

	@Override
	public Producto buscarCodigo(Integer codigo) {
		// TODO Auto-generated method stub
		return this.productoRepo.buscarCodigo(codigo);
	}

	@Override
	public Producto buscarNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.productoRepo.buscarNombre(nombre);
	}

	@Override
	public List<Producto> buscarTodos() {
		// TODO Auto-generated method stub
		return this.productoRepo.buscarTodos();
	}



}

