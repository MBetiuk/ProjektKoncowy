package pl.betiuk.projektkoncowy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.betiuk.projektkoncowy.model.Client;


public interface ClientRepository extends JpaRepository<Client, Long> {
}