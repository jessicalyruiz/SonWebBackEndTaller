package ec.edu.uce.service;

import ec.edu.uce.repository.modelo.Factura;

public interface IFacturaService {

	public void create(Factura factura);

	public Factura read(Integer id);

	public void update(Factura factura);

	public void delete(Integer id);
}
