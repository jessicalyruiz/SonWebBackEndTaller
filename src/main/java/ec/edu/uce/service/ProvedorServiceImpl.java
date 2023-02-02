package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.repository.IProvedorRepo;
import ec.edu.uce.repository.modelo.Provedor;

@Service
public class ProvedorServiceImpl implements IProvedorService {

	@Autowired
	private IProvedorRepo provedorRepo;

	@Override
	public void create(Provedor provedor) {
		// TODO Auto-generated method stub
		this.provedorRepo.create(provedor);
	}

	@Override
	public Provedor read(Integer id) {
		// TODO Auto-generated method stub
		return this.provedorRepo.read(id);
	}

	@Override
	public void update(Provedor provedor) {
		// TODO Auto-generated method stub
		this.provedorRepo.update(provedor);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.provedorRepo.delete(id);
	}

	@Override
	public Provedor buscarNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.provedorRepo.buscarNombre(nombre);
	}

	@Override
	public Provedor buscarRuc(String ruc) {
		// TODO Auto-generated method stub
		return this.provedorRepo.buscarRuc(ruc);
	}


	

}
