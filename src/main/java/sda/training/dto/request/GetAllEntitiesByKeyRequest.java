package sda.training.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("get_all_entities_by_id_request")
public class GetAllEntitiesByKeyRequest {

    @JsonProperty("code")
    private String code;

    public GetAllEntitiesByKeyRequest() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
