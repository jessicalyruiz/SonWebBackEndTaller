package ec.edu.uce.repository;

import ec.edu.uce.repository.modelo.Factura;

public interface IFacturaRepo {

	public void create(Factura factura);

	public Factura read(Integer id);

	public void update(Factura factura);

	public void delete(Integer id);
}
