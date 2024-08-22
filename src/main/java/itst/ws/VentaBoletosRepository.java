package itst.ws;

import org.springframework.data.jpa.repository.JpaRepository;
import itst.model.VentaBoletos;

public interface VentaBoletosRepository extends JpaRepository<VentaBoletos, Integer> {

}
