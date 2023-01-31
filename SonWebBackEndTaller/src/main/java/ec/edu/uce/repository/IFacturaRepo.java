package ec.edu.uce.repository;

public interface IFacturaRepo {

	public void create(Factura factura);
	public Factura read(Integer id); 
	public void update(Factura factura); 
	public void delete(Integer id); 
}
