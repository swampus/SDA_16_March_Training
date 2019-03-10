package sda.training.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("cat_owner")
public class CatOwnerDTO {

    @JsonProperty("owner_personal_code")
    private String ownerPersonalCode;

    @JsonProperty("name")
    private String name;

    @JsonProperty("phone")
    private String phone;

    @JsonProperty("address")
    private String address;

    public CatOwnerDTO() {
    }

    public String getOwnerPersonalCode() {
        return ownerPersonalCode;
    }

    public void setOwnerPersonalCode(String ownerPersonalCode) {
        this.ownerPersonalCode = ownerPersonalCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
