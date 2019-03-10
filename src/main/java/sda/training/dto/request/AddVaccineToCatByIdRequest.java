package sda.training.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("add_vaccine_to_cat_by_passport_code_request")
public class AddVaccineToCatByIdRequest {

    @JsonProperty("cat_passport_code")
    private String catPassportCode;

    @JsonProperty("vaccine")
    private String vaccine;

    public AddVaccineToCatByIdRequest() {

    }

    public String getCatPassportCode() {
        return catPassportCode;
    }

    public void setCatPassportCode(String catPassportCode) {
        this.catPassportCode = catPassportCode;
    }

    public String getVaccine() {
        return vaccine;
    }

    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }
}
