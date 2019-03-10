package sda.training.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sda.training.dto.CatDTO;
import sda.training.dto.request.DeleteEntityByIdRequest;
import sda.training.dto.request.GetAllEntitiesByKeyRequest;
import sda.training.dto.request.GetAllEntitiesRequest;
import sda.training.dto.request.GetPossibleMarriageListRequest;
import sda.training.dto.response.OperationResponse;
import sda.training.mapper.CatMapper;

import java.util.List;

@Service
public class CatService {

    private CatMapper catMapper;

    @Autowired
    public CatService(CatMapper catMapper) {
        this.catMapper = catMapper;
    }

    public List<CatDTO> getAllCats(GetAllEntitiesRequest getAllEntitiesRequest) {
        return null;
    }

    public List<CatDTO> getAllCatsByCatCode(GetAllEntitiesByKeyRequest getAllEntitiesByKeyRequest) {
        return null;
    }

    public List<CatDTO> getAllCatsByCatModel(GetAllEntitiesByKeyRequest getAllEntitiesByKeyRequest) {
        return null;
    }

    public List<CatDTO> getAllPossibleCatsForMarriageByCatCode(GetPossibleMarriageListRequest getPossibleMarriageListRequest) {
        return null;
    }

    public OperationResponse addCat(CatDTO catDTO) {
        return null;
    }

    public OperationResponse deleteCat(DeleteEntityByIdRequest deleteEntityByIdRequest) {
        return null;
    }

    public List<CatDTO> getAllDisabledCats(GetAllEntitiesByKeyRequest getAllEntitiesByKeyRequest) {
        return null;
    }

    public List<CatDTO> getAllCatsByOwnersPersonalCode(GetAllEntitiesRequest getAllEntitiesRequest) {
        return null;
    }

    public List<CatDTO> getAllCatsForPossibleMarriage(GetAllEntitiesByKeyRequest getAllEntitiesByKeyRequest) {
        return null;
    }
}
