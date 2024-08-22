package itst.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import itst.model.Salas;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
public class SalasController {
	
	@Autowired
	private SalasService service;
	
	@GetMapping("/salas")
	public List<Salas> obtenerTodos() {
		return service.obtenerTodos();
	}
	
	@GetMapping("/salas/{numeroId}")
	public ResponseEntity<Salas> obtenerPorId(@PathVariable Integer numeroId) {
		//try {
			Salas sala = service.obtenerPorId(numeroId);
			return new ResponseEntity<Salas>(sala, HttpStatus.OK);
		//} catch (NoSuchElementException e) {
		//	return new ResponseEntity<Salas>(HttpStatus.NOT_FOUND);
		//}
	}
	
	@PostMapping("/salas")
	public void registrar(@RequestBody Salas salas) {
			service.guardarPost(salas);
	}
	
	@PutMapping("/salas/{numeroId}")
	public ResponseEntity<?> actualizar(@RequestBody Salas salas, @PathVariable Integer numeroId) {
		//try {
			Salas auxSala = service.obtenerPorId(numeroId);
			salas.setId(auxSala.getId());
			service.guardar(salas);
			return new ResponseEntity<String>("Sala actualizada", HttpStatus.OK);
		//}catch (NoSuchElementException e) {
	    //    return new ResponseEntity<String>("El registro con el numero de balon proporcionado no se encuentra en la base de datos", HttpStatus.NOT_FOUND);
	    //}
	}
	
	@DeleteMapping("/salas/{numeroId}")
	public void eliminar(@PathVariable Integer numeroId) {
		//try {
			service.eliminar(numeroId);
		//}catch(Exception e) {
		//	
		//}
	}
	
}
