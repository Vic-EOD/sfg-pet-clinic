package dev.vmartinez.sfgpetclinic.services;

import dev.vmartinez.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetService extends CrudRepository<Vet, Long> {
}
