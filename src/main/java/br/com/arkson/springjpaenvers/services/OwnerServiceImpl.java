package br.com.arkson.springjpaenvers.services;

import br.com.arkson.springjpaenvers.model.Owner;
import br.com.arkson.springjpaenvers.repositories.OwnerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * @author arkson
 * @date 16/11/2020
 */
@Service
@AllArgsConstructor
public class OwnerServiceImpl implements OwnerService {

    private final OwnerRepository ownerRepository;

    @Override
    public Owner save(Owner owner) {
        owner = Objects.requireNonNull(owner, "Owner cannot be null");
        return ownerRepository.save(owner);
    }

    @Override
    public List<Owner> findAll() {
        List<Owner> owners = new LinkedList<>();
        ownerRepository.findAll().iterator().forEachRemaining(owners::add);

        return owners;
    }

    @Override
    public Optional<Owner> findById(Long id) {
        return ownerRepository.findById(id);
    }

    @Override
    public void delete(Owner owner) {
        ownerRepository.delete(owner);
    }

    @Override
    public void deleteById(Long id) {
        ownerRepository.deleteById(id);
    }
}
