package dev.vmartinez.sfgpetclinic.services;

import dev.vmartinez.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetService extends CrudRepository<Pet, Long> {

}
