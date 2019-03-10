package sda.training.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sda.training.controller.ReportController;
import sda.training.dto.request.GetAllEntitiesByKeyRequest;
import sda.training.dto.request.GetAllEntitiesRequest;
import sda.training.dto.response.CatOwnerWithCatsResponse;
import sda.training.services.ReportService;

import java.util.List;

@RestController
@RequestMapping("/report")
public class ReportControllerImpl implements ReportController {

    private ReportService reportService;

    @Autowired
    public ReportControllerImpl(ReportService reportService) {
        this.reportService = reportService;
    }

    @Override
    @PutMapping(value = "/get_cat_owner_with_cats_by_owner_person_code",
            headers = {"Accept=application/json"})
    @ResponseBody
    public CatOwnerWithCatsResponse getCatOwnerWithCatsByOwnerPersonCode(
            @RequestBody GetAllEntitiesByKeyRequest getAllEntitiesByKeyRequest) {
        return reportService.getCatOwnerWithCatsByOwnerPersonCode(getAllEntitiesByKeyRequest);
    }

    @Override
    @PutMapping(value = "/get_all_cat_owners_with_cats_by_owner_person_code",
            headers = {"Accept=application/json"})
    @ResponseBody
    public List<CatOwnerWithCatsResponse> getAllCatOwnersWithCatsByOwnerPersonCode(
            @RequestBody GetAllEntitiesRequest getAllEntitiesRequest) {
        return reportService.getAllCatOwnersWithCatsByOwnerPersonCode(getAllEntitiesRequest);
    }
}
