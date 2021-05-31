package dev.vmartinez.sfgpetclinic.services;

import dev.vmartinez.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findByLastName(String lastName);

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
