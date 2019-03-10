package sda.training.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("cat")
public class CatDTO {

    @JsonProperty("cat_name")
    private String catName;

    @JsonProperty("owner_personal_code")
    private String ownerPersonalCode;

    @JsonProperty("cat_passport_code")
    private String catPassportCode;

    @JsonProperty("parent_cat_passport_code")
    private String parenCatPassportCode;

    @JsonProperty("cat_status")
    private String catStatus;

    /**
     * Please create additional table for it
     */
    @JsonProperty("cat_model")
    private String catModel;

    @JsonProperty("type")
    private String type;

    public CatDTO() {
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getOwnerPersonalCode() {
        return ownerPersonalCode;
    }

    public void setOwnerPersonalCode(String ownerPersonalCode) {
        this.ownerPersonalCode = ownerPersonalCode;
    }

    public String getCatPassportCode() {
        return catPassportCode;
    }

    public void setCatPassportCode(String catPassportCode) {
        this.catPassportCode = catPassportCode;
    }

    public String getParenCatPassportCode() {
        return parenCatPassportCode;
    }

    public void setParenCatPassportCode(String parenCatPassportCode) {
        this.parenCatPassportCode = parenCatPassportCode;
    }

    public String getCatStatus() {
        return catStatus;
    }

    public void setCatStatus(String catStatus) {
        this.catStatus = catStatus;
    }

    public String getCatModel() {
        return catModel;
    }

    public void setCatModel(String catModel) {
        this.catModel = catModel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
