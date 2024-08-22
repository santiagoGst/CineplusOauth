package itst.ws;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import itst.model.VentaBoletos;

@Service
@Transactional
public class VentaBoletosService {
	
	@Autowired
	private VentaBoletosRepository repo;
	
	public List<VentaBoletos> obtenerTodos() {
		return repo.findAll();
	}

	public void guardar(VentaBoletos ventaboletos) {
		repo.save(ventaboletos);
	
	}
	
	public void guardarPost(VentaBoletos ventaboletos) {
		if(!repo.existsById(ventaboletos.getId())) {
			repo.save(ventaboletos);
		}
	}

	public VentaBoletos obtenerPorId(Integer numeroId) {
		return repo.findById(numeroId).get();
	}

	public void eliminar(Integer numeroId) {
		repo.deleteById(numeroId);
	}

}
