package ec.edu.uce.repository;


import org.springframework.stereotype.Repository;

import ec.edu.uce.repository.modelo.Provedor;
import ec.edu.uce.repository.modelo.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ProvedorRepoImpl implements IProvedorRepo{

	
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void create(Provedor provedor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(provedor);
	}

	@Override
	public Provedor read(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Provedor.class, id);
	}

	@Override
	public void update(Provedor provedor) {
		// TODO Auto-generated method stub
		this.entityManager.merge(provedor);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.read(id));
	}

	

	@Override
	public Provedor buscarNombre(String nombre) {
		TypedQuery<Provedor> myQuery=this.entityManager.createQuery("Select c from Provedor c where c.nombre=:valor", Provedor.class);
		myQuery.setParameter("valor", nombre);
		return myQuery.getSingleResult();
	}

	@Override
	public Provedor buscarRuc(String ruc) {
		TypedQuery<Provedor> myQuery=this.entityManager.createQuery("Select c from Provedor c where c.ruc=:valor", Provedor.class);
		myQuery.setParameter("valor", ruc);
		return myQuery.getSingleResult();
	}

	

}
