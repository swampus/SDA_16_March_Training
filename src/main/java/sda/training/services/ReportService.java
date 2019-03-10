package sda.training.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sda.training.dto.request.GetAllEntitiesByKeyRequest;
import sda.training.dto.request.GetAllEntitiesRequest;
import sda.training.dto.response.CatOwnerWithCatsResponse;
import sda.training.mapper.CatMapper;
import sda.training.mapper.CatOwnerMapper;

import java.util.List;

@Service
public class ReportService {

    private CatOwnerMapper catOwnerMapper;
    private CatMapper catMapper;

    @Autowired
    public ReportService(CatOwnerMapper catOwnerMapper, CatMapper catMapper) {
        this.catOwnerMapper = catOwnerMapper;
        this.catMapper = catMapper;
    }

    public CatOwnerWithCatsResponse getCatOwnerWithCatsByOwnerPersonCode(
            GetAllEntitiesByKeyRequest getAllEntitiesByKeyRequest) {
        return null;
    }

    public List<CatOwnerWithCatsResponse> getAllCatOwnersWithCatsByOwnerPersonCode(
            GetAllEntitiesRequest getAllEntitiesRequest) {
        return null;
    }
}
