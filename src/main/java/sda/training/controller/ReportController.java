package sda.training.controller;

import sda.training.dto.request.GetAllEntitiesByKeyRequest;
import sda.training.dto.request.GetAllEntitiesRequest;
import sda.training.dto.response.CatOwnerWithCatsResponse;

import java.util.List;

public interface ReportController {

    CatOwnerWithCatsResponse getCatOwnerWithCatsByOwnerPersonCode(
            GetAllEntitiesByKeyRequest getAllEntitiesByKeyRequest);

    List<CatOwnerWithCatsResponse> getAllCatOwnersWithCatsByOwnerPersonCode(
            GetAllEntitiesRequest getAllEntitiesRequest);

}
