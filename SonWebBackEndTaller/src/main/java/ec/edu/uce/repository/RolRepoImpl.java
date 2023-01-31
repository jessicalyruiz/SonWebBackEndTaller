package ec.edu.uce.repository;


import org.springframework.stereotype.Repository;

import ec.edu.uce.repository.modelo.Provedor;
import ec.edu.uce.repository.modelo.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class RolRepoImpl implements IRolRepo{

	
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void create(Rol rol) {
		// TODO Auto-generated method stub
		this.entityManager.persist(rol);
	}

	@Override
	public Rol read(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Rol.class, id);
	}

	@Override
	public void update(Rol rol) {
		// TODO Auto-generated method stub
		this.entityManager.merge(rol);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.read(id));
	}

	@Override
	public Rol buscarEmail(String email) {
		TypedQuery<Rol> myQuery=this.entityManager.createQuery("Select c from Rol c where c.email=:valor", Rol.class);
		myQuery.setParameter("valor", email);
		return myQuery.getSingleResult();
	}

	

}