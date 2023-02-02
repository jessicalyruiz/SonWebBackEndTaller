package ec.edu.uce.repository;

import ec.edu.uce.repository.modelo.Usuario;

public interface IUsuarioRepo {

	public void create(Usuario usuario);
	public Usuario read(Integer id); 
	public void update(Usuario usuario); 
	public void delete(Integer id); 
	public Usuario buscarEmail(String email);
	public Usuario buscarCedula(String cedula);
}
