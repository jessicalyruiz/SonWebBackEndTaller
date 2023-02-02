package ec.edu.uce.repository;

import ec.edu.uce.repository.modelo.Provedor;

public interface IProvedorRepo {

	public void create(Provedor provedor);
	public Provedor read(Integer id); 
	public void update(Provedor provedor); 
	public void delete(Integer id); 
	public Provedor buscarNombre(String nombre);
	public Provedor buscarRuc(String ruc);
}
