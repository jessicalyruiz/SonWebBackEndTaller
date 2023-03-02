package ec.edu.uce.repository;


import java.util.List;

import org.springframework.stereotype.Repository;

import ec.edu.uce.repository.modelo.Producto;
import ec.edu.uce.repository.modelo.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ProductoRepoImpl implements IProductoRepo{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void create(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.persist(producto);
	}

	@Override
	public Producto read(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Producto.class, id);
	}

	@Override
	public void update(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.merge(producto);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.read(id));
	}
	
	
	
	@Override
	public List<Producto> buscarProductoCategoria(String categoria) {
		TypedQuery<Producto> myQuery=this.entityManager.createQuery("Select p from Producto p where p.categoria=:valor", Producto.class);
		myQuery.setParameter("valor", categoria);
		//System.out.println(myQuery.getResultList());
		return myQuery.getResultList();
	}

	@Override
	public Producto buscarId(Integer id) {
		TypedQuery<Producto> myQuery=this.entityManager.createQuery("Select p from Producto p where p.id=:valor", Producto.class);
		myQuery.setParameter("valor", id);
		//System.out.println(myQuery.getResultList());
		return myQuery.getSingleResult();
	}

	@Override
	public Producto buscarCodigo(Integer codigo) {
		TypedQuery<Producto> myQuery=this.entityManager.createQuery("Select p from Producto p where p.codigo=:valor", Producto.class);
		myQuery.setParameter("valor", codigo);
		//System.out.println(myQuery.getResultList());
		return myQuery.getSingleResult();
	}

	@Override
	public Producto buscarNombre(String nombre) {
		TypedQuery<Producto> myQuery=this.entityManager.createQuery("Select p from Producto p where p.nombre=:valor", Producto.class);
		myQuery.setParameter("valor", nombre);
		//System.out.println(myQuery.getResultList());
		return myQuery.getSingleResult();
	}

	@Override
	public List<Producto> buscarTodos() {
		TypedQuery<Producto> myQuery=this.entityManager.createQuery("Select p from Producto p", Producto.class);
		
		return myQuery.getResultList();
	}

	
}