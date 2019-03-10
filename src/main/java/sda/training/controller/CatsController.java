package sda.training.controller;

import sda.training.dto.CatDTO;
import sda.training.dto.request.DeleteEntityByIdRequest;
import sda.training.dto.request.GetAllEntitiesByKeyRequest;
import sda.training.dto.request.GetAllEntitiesRequest;
import sda.training.dto.request.GetPossibleMarriageListRequest;
import sda.training.dto.response.OperationResponse;

import java.util.List;

public interface CatsController {

    List<CatDTO> getAllCats(GetAllEntitiesRequest getAllEntitiesRequest);

    List<CatDTO> getAllCatsByCatCode(GetAllEntitiesByKeyRequest getAllEntitiesByKeyRequest);

    List<CatDTO> getAllCatsByCatModel(GetAllEntitiesByKeyRequest getAllEntitiesByKeyRequest);

    List<CatDTO> getAllPossibleCatsForMarriageByCatCode(GetPossibleMarriageListRequest
                                                                getPossibleMarriageListRequest);

    OperationResponse addCat(CatDTO catDTO);

    OperationResponse deleteCat(DeleteEntityByIdRequest deleteEntityByIdRequest);

    List<CatDTO> getAllDisabledCats(GetAllEntitiesByKeyRequest getAllEntitiesByKeyRequest);

    List<CatDTO> getAllCatsByOwnersPersonalCode(GetAllEntitiesRequest getAllEntitiesRequest);

    /**
     * Different Type, ACTIVE, Same Model, Both Age +/- 2, Not Parent
     */
    List<CatDTO> getAllCatsForPossibleMarriage(GetAllEntitiesByKeyRequest getAllEntitiesByKeyRequest);

}
