package ec.edu.uce.repository;

import org.springframework.stereotype.Repository;

import ec.edu.uce.repository.modelo.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UsuarioRepoImpl implements IUsuarioRepo{

	
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void create(Usuario usuario) {
		// TODO Auto-generated method stub
		this.entityManager.persist(usuario);
	}

	@Override
	public Usuario read(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Usuario.class, id);
	}

	@Override
	public void update(Usuario usuario) {
		// TODO Auto-generated method stub
		this.entityManager.merge(usuario);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.read(id));
	}

	@Override
	public Usuario buscarEmail(String email) {
		TypedQuery<Usuario> myQuery=this.entityManager.createQuery("Select c from Usuario c where c.email=:valor", Usuario.class);
		myQuery.setParameter("valor", email);
		return myQuery.getSingleResult();
	}

	@Override
	public Usuario buscarCedula(String cedula) {
		TypedQuery<Usuario> myQuery=this.entityManager.createQuery("Select c from Usuario c where c.cedula=:valor", Usuario.class);
		myQuery.setParameter("valor", cedula);
		return myQuery.getSingleResult();
	}

	

}