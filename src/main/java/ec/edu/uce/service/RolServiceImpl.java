package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.repository.IRolRepo;
import ec.edu.uce.repository.modelo.Rol;

@Service
public class RolServiceImpl implements IRolService{

	@Autowired
	private IRolRepo usuarioRepo;

	@Override
	public void create(Rol rol) {
		// TODO Auto-generated method stub
		this.usuarioRepo.create(rol);
	}

	@Override
	public Rol read(Integer id) {
		// TODO Auto-generated method stub
		return this.usuarioRepo.read(id);
	}

	@Override
	public void update(Rol rol) {
		// TODO Auto-generated method stub
		this.usuarioRepo.update(rol);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.usuarioRepo.delete(id);
	}


	
}
