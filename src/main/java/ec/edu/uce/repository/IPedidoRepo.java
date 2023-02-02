package ec.edu.uce.repository;

import ec.edu.uce.repository.modelo.Pedido;

public interface IPedidoRepo {

	public void create(Pedido pedido);
	public Pedido read(Integer id); 
	public void update(Pedido pedido); 
	public void delete(Integer id); 
	
}
