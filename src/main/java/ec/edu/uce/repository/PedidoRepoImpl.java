package ec.edu.uce.repository;



import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ec.edu.uce.repository.modelo.Pedido;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Transactional
public class PedidoRepoImpl implements IPedidoRepo{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void create(Pedido pedido) {
		// TODO Auto-generated method stub
		this.entityManager.persist(pedido);
	}

	@Override
	public Pedido read(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Pedido.class, id);
	}

	@Override
	public void update(Pedido pedido) {
		// TODO Auto-generated method stub
		this.entityManager.merge(pedido);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.read(id));
	}
}
