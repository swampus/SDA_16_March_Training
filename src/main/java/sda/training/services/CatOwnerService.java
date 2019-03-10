package sda.training.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sda.training.dto.CatOwnerDTO;
import sda.training.dto.request.GetAllEntitiesByKeyRequest;
import sda.training.dto.request.GetAllEntitiesRequest;
import sda.training.mapper.CatOwnerMapper;

import java.util.List;

@Service
public class CatOwnerService {

    private CatOwnerMapper catOwnerMapper;

    @Autowired
    public CatOwnerService(CatOwnerMapper catOwnerMapper) {
        this.catOwnerMapper = catOwnerMapper;
    }

    public List<CatOwnerDTO> getAllCatOwners(GetAllEntitiesRequest getAllEntitiesRequest) {
        return null;
    }

    public CatOwnerDTO getCatOwnerByCatPassportCode(GetAllEntitiesByKeyRequest getAllEntitiesByKeyRequest) {
        return null;
    }
}
