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
import itst.model.VentaBoletos;

@RestController
public class VentaBoletosController {
	
	@Autowired
	private VentaBoletosService service;
	
	@GetMapping("/ventaboletos")
	public List<VentaBoletos> obtenerTodos() {
		return service.obtenerTodos();
	}
	
	@GetMapping("/ventaboletos/{numeroId}")
	public ResponseEntity<VentaBoletos> obtenerPorId(@PathVariable Integer numeroId) {
		//try {
			VentaBoletos ventaboletos = service.obtenerPorId(numeroId);
			return new ResponseEntity<VentaBoletos>(ventaboletos, HttpStatus.OK);
		//} catch (NoSuchElementException e) {
		//	return new ResponseEntity<Salas>(HttpStatus.NOT_FOUND);
		//}
	}
	
	@PostMapping("/ventaboletos")
	public void registrar(@RequestBody VentaBoletos ventaboletos) {
		service.guardarPost(ventaboletos);
	}
	
	@PutMapping("/ventaboletos/{numeroId}")
	public ResponseEntity<?> actualizar(@RequestBody VentaBoletos ventaboletos, @PathVariable Integer numeroId) {
		//try {
			VentaBoletos auxVenta = service.obtenerPorId(numeroId);
			ventaboletos.setId(auxVenta.getId());
			service.guardar(ventaboletos);
			return new ResponseEntity<String>("Venta Actualizada", HttpStatus.OK);
		//}catch (NoSuchElementException e) {
	    //    return new ResponseEntity<String>("El registro con el numero de balon proporcionado no se encuentra en la base de datos", HttpStatus.NOT_FOUND);
	    //}
	}
	
	@DeleteMapping("/ventaboletos/{numeroId}")
	public void eliminar(@PathVariable Integer numeroId) {
		//try {
			service.eliminar(numeroId);
		//}catch(Exception e) {
		//	
		//}
	}

}
