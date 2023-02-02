package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.repository.IFacturaRepo;
import ec.edu.uce.repository.IPedidoRepo;
import ec.edu.uce.repository.modelo.Pedido;

@Service
public class PedidoServiceImpl implements IPedidoService {

	@Autowired
	private IPedidoRepo pedidoRepo;

	@Override
	public void create(Pedido pedido) {
		// TODO Auto-generated method stub
		this.pedidoRepo.create(pedido);
	}

	@Override
	public Pedido read(Integer id) {
		// TODO Auto-generated method stub
		return this.pedidoRepo.read(id);
	}

	@Override
	public void update(Pedido pedido) {
		// TODO Auto-generated method stub
		this.pedidoRepo.update(pedido);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.pedidoRepo.delete(id);
	}
}
