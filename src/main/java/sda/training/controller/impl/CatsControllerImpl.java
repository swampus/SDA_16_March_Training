package sda.training.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sda.training.controller.CatsController;
import sda.training.dto.CatDTO;
import sda.training.dto.request.DeleteEntityByIdRequest;
import sda.training.dto.request.GetAllEntitiesByKeyRequest;
import sda.training.dto.request.GetAllEntitiesRequest;
import sda.training.dto.request.GetPossibleMarriageListRequest;
import sda.training.dto.response.OperationResponse;
import sda.training.services.CatService;

import java.util.List;

@RestController
@RequestMapping("/cats")
public class CatsControllerImpl implements CatsController {

    private CatService catService;

    @Autowired
    public CatsControllerImpl(CatService catService) {
        this.catService = catService;
    }

    @Override
    @PutMapping(value = "/get_all_cats",
            headers = {"Accept=application/json"})
    @ResponseBody
    public List<CatDTO> getAllCats(@RequestBody GetAllEntitiesRequest getAllEntitiesRequest) {
        return catService.getAllCats(getAllEntitiesRequest);
    }

    @Override
    @PutMapping(value = "/get_all_cats_by_cat_code",
            headers = {"Accept=application/json"})
    @ResponseBody
    public List<CatDTO> getAllCatsByCatCode(@RequestBody GetAllEntitiesByKeyRequest getAllEntitiesByKeyRequest) {
        return catService.getAllCatsByCatCode(getAllEntitiesByKeyRequest);
    }

    @Override
    @PutMapping(value = "/get_all_cats_by_cat_model",
            headers = {"Accept=application/json"})
    @ResponseBody
    public List<CatDTO> getAllCatsByCatModel(@RequestBody GetAllEntitiesByKeyRequest getAllEntitiesByKeyRequest) {
        return catService.getAllCatsByCatModel(getAllEntitiesByKeyRequest);
    }

    @Override
    @PutMapping(value = "/get_all_possible_cats_for_marriage_by_cat_code",
            headers = {"Accept=application/json"})
    @ResponseBody
    public List<CatDTO> getAllPossibleCatsForMarriageByCatCode(
            @RequestBody GetPossibleMarriageListRequest getPossibleMarriageListRequest) {
        return catService.getAllPossibleCatsForMarriageByCatCode(getPossibleMarriageListRequest);
    }

    @Override
    @PutMapping(value = "/add_cat",
            headers = {"Accept=application/json"})
    @ResponseBody
    public OperationResponse addCat(@RequestBody CatDTO catDTO) {
        return catService.addCat(catDTO);
    }

    @Override
    @PutMapping(value = "/delete_cat",
            headers = {"Accept=application/json"})
    @ResponseBody
    public OperationResponse deleteCat(@RequestBody DeleteEntityByIdRequest deleteEntityByIdRequest) {
        return catService.deleteCat(deleteEntityByIdRequest);
    }

    @Override
    @PutMapping(value = "/get_all_disabled_cats",
            headers = {"Accept=application/json"})
    @ResponseBody
    public List<CatDTO> getAllDisabledCats(@RequestBody GetAllEntitiesByKeyRequest getAllEntitiesByKeyRequest) {
        return catService.getAllDisabledCats(getAllEntitiesByKeyRequest);
    }

    @Override
    @PutMapping(value = "/get_all_cats_by_owners_personal_code",
            headers = {"Accept=application/json"})
    @ResponseBody
    public List<CatDTO> getAllCatsByOwnersPersonalCode(@RequestBody GetAllEntitiesRequest getAllEntitiesRequest) {
        return catService.getAllCatsByOwnersPersonalCode(getAllEntitiesRequest);
    }

    @Override
    @PutMapping(value = "/get_all_cats_for_possible_marriage",
            headers = {"Accept=application/json"})
    @ResponseBody
    public List<CatDTO> getAllCatsForPossibleMarriage(
            @RequestBody GetAllEntitiesByKeyRequest getAllEntitiesByKeyRequest) {
        return catService.getAllCatsForPossibleMarriage(getAllEntitiesByKeyRequest);
    }
}
