package com.belhassen.Services;

import com.belhassen.Entities.Particulier;

import java.util.List;

public interface ParticulierService {

    Particulier saveParticulier(Particulier particulier);
    Particulier updateParticulier(Particulier particulier);
    List<Particulier> getAllParticulier();
    Particulier getParticulier(Long particulierId);
    void deleteParticulier(Long particulierId);
}
