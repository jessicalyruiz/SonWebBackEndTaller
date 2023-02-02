package ec.edu.uce.repository;

import ec.edu.uce.repository.modelo.Rol;

public interface IRolRepo {

	public void create(Rol rol);
	public Rol read(Integer id); 
	public void update(Rol rol); 
	public void delete(Integer id); 
}
