package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.repository.IFacturaRepo;
import ec.edu.uce.repository.modelo.Factura;


	@Service
	public class FacturaServiceImpl implements IFacturaService {

		@Autowired
		private IFacturaRepo facturaRepo;

		@Override
		public void create(Factura factura) {
			// TODO Auto-generated method stub
			this.facturaRepo.create(factura);
		}

		@Override
		public Factura read(Integer id) {
			// TODO Auto-generated method stub
			return this.facturaRepo.read(id);
		}

		@Override
		public void update(Factura factura) {
			// TODO Auto-generated method stub
			this.facturaRepo.update(factura);
		}

		@Override
		public void delete(Integer id) {
			// TODO Auto-generated method stub
			this.facturaRepo.delete(id);
		}
	}


