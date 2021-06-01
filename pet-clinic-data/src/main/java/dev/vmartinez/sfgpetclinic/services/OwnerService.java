package dev.vmartinez.sfgpetclinic.services;

import dev.vmartinez.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
