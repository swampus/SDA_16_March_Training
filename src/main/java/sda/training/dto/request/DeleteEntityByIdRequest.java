package sda.training.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("delete_entity_by_id_request")
public class DeleteEntityByIdRequest {

    @JsonProperty("code")
    private String code;

    public DeleteEntityByIdRequest() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
