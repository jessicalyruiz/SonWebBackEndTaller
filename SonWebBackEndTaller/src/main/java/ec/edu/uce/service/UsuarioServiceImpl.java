package ec.edu.uce.service;

import org.springframework.stereotype.Service;

import ec.edu.uce.repository.IUsuarioRepo;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private IUsuarioRepo usuarioRepo;

	@Override
	public void create(Usuario usuario) {
		// TODO Auto-generated method stub
		this.usuarioRepo.create(usuario);
	}

	@Override
	public Usuario read(Integer id) {
		// TODO Auto-generated method stub
		return this.usuarioRepo.read(id);
	}

	@Override
	public void update(Usuario usuario) {
		// TODO Auto-generated method stub
		this.usuarioRepo.update(usuario);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.usuarioRepo.delete(id);
	}

	@Override
	public Usuario buscarEmail(String email) {
		// TODO Auto-generated method stub
		return this.usuarioRepo.buscarEmail(email);
	}

	

}