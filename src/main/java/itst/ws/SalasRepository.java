package itst.ws;

import org.springframework.data.jpa.repository.JpaRepository;
import itst.model.Salas;

public interface SalasRepository extends JpaRepository<Salas, Integer> {

}

