package sda.training.controller;

import sda.training.dto.CatOwnerDTO;
import sda.training.dto.request.GetAllEntitiesByKeyRequest;
import sda.training.dto.request.GetAllEntitiesRequest;

import java.util.List;

public interface CatOwnerController {

    List<CatOwnerDTO> getAllCatOwners(GetAllEntitiesRequest getAllEntitiesRequest);

    CatOwnerDTO getCatOwnerByCatPassportCode(GetAllEntitiesByKeyRequest getAllEntitiesByKeyRequest);

}
