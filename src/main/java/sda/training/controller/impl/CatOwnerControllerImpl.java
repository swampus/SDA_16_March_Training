package sda.training.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sda.training.controller.CatOwnerController;
import sda.training.dto.CatOwnerDTO;
import sda.training.dto.request.GetAllEntitiesByKeyRequest;
import sda.training.dto.request.GetAllEntitiesRequest;
import sda.training.services.CatOwnerService;

import java.util.List;

@RestController
@RequestMapping("/cat_owner")
public class CatOwnerControllerImpl implements CatOwnerController {

    private CatOwnerService catOwnerService;

    @Autowired
    public CatOwnerControllerImpl(CatOwnerService catOwnerService) {
        this.catOwnerService = catOwnerService;
    }

    @Override
    @PutMapping(value = "/get_all_cat_owners",
            headers = {"Accept=application/json"})
    @ResponseBody
    public List<CatOwnerDTO> getAllCatOwners(@RequestBody GetAllEntitiesRequest getAllEntitiesRequest) {
        return catOwnerService.getAllCatOwners(getAllEntitiesRequest);
    }

    @Override
    @PutMapping(value = "/get_cat_owner_by_cat_passport_code",
            headers = {"Accept=application/json"})
    @ResponseBody
    public CatOwnerDTO getCatOwnerByCatPassportCode(
            @RequestBody GetAllEntitiesByKeyRequest getAllEntitiesByKeyRequest) {
        return catOwnerService.getCatOwnerByCatPassportCode(getAllEntitiesByKeyRequest);
    }
}
