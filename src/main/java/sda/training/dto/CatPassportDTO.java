package sda.training.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.List;

/**
 * To be stored in MONGO
 */
@JsonRootName("cat_passport")
public class CatPassportDTO {

    @JsonProperty("cat_passport_code")
    private String catPassportCode;

    @JsonProperty("image")
    private String image;

    @JsonProperty("birthday_code")
    private String birthdayCode;

    @JsonProperty("color")
    private String color;

    @JsonProperty("vaccines_codes")
    private List<String> vaccinesCodes;


    public CatPassportDTO() {
    }

    public String getCatPassportCode() {
        return catPassportCode;
    }

    public void setCatPassportCode(String catPassportCode) {
        this.catPassportCode = catPassportCode;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBirthdayCode() {
        return birthdayCode;
    }

    public void setBirthdayCode(String birthdayCode) {
        this.birthdayCode = birthdayCode;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<String> getVaccinesCodes() {
        return vaccinesCodes;
    }

    public void setVaccinesCodes(List<String> vaccinesCodes) {
        this.vaccinesCodes = vaccinesCodes;
    }
}
