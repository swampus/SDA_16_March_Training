package sda.training.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("get_possible_marriage_list_request")
public class GetPossibleMarriageListRequest {

    @JsonProperty("code")
    private String catPassportCode;

    public GetPossibleMarriageListRequest() {
    }

    public String getCatPassportCode() {
        return catPassportCode;
    }

    public void setCatPassportCode(String catPassportCode) {
        this.catPassportCode = catPassportCode;
    }
}
