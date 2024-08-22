package itst.ws;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import itst.model.Peliculas;

@RestController
public class PeliculasController {
	@Autowired
	private PeliculasService service;
	
	@GetMapping("/peliculas")
	public List<Peliculas> obtenerTodos() {
		return service.obtenerTodos();
	}
	
	@GetMapping("/peliculas/{numeroId}")
	public ResponseEntity<Peliculas> obtenerPorId(@PathVariable Integer numeroId) {
		//try {
			Peliculas pelicula = service.obtenerPorId(numeroId);
			return new ResponseEntity<Peliculas>(pelicula, HttpStatus.OK);
		//} catch (NoSuchElementException e) {
		//	return new ResponseEntity<Peliculas>(HttpStatus.NOT_FOUND);
		//}
	}
	
	@PostMapping("/peliculas")
	public void registrar(@RequestBody Peliculas peliculas) {
		service.guardarPost(peliculas);
	}
	
	@PutMapping("/peliculas/{numeroId}")
	public ResponseEntity<?> actualizar(@RequestBody Peliculas peliculas, @PathVariable Integer numeroId) {
		//try {
			Peliculas auxPeli = service.obtenerPorId(numeroId);
			peliculas.setId(auxPeli.getId());
			service.guardar(peliculas);
			return new ResponseEntity<String>("Pelicula actualizada", HttpStatus.OK);
		//}catch (NoSuchElementException e) {
	    //    return new ResponseEntity<String>("El registro con el numero de balon proporcionado no se encuentra en la base de datos", HttpStatus.NOT_FOUND);
	    //}
	}
	
	@DeleteMapping("/peliculas/{numeroId}")
	public void eliminar(@PathVariable Integer numeroId) {
		//try {
			service.eliminar(numeroId);
		//}catch(Exception e) {
		//	
		//}
	}
	
	
	
	
	
	
	
	
}
