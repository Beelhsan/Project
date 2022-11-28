package com.belhassen.Services;

import com.belhassen.Entities.Particulier;
import com.belhassen.Repos.ParticulierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParticulierServiceImpl implements ParticulierService {

    @Autowired
    ParticulierRepository particulierRepository;


    public Particulier saveParticulier(Particulier particulier) {
        return particulierRepository.save(particulier);
    }

    @Override
    public Particulier updateParticulier(Particulier particulier) {
        return particulierRepository.save(particulier);
    }


    @Override
    public List<Particulier> getAllParticulier() {

        return (List<Particulier>) particulierRepository.findAll();
    }

    @Override
    public Particulier getParticulier(Long particulierId) {
        return particulierRepository.findById(particulierId).get();
    }

    @Override
    public void deleteParticulier(Long particulierId) {
        particulierRepository.deleteById(particulierId);
    }

}
