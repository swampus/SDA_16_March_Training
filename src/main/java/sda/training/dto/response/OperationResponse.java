package sda.training.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("operation_response")
public class OperationResponse {

    @JsonProperty("result")
    private Boolean result;

    @JsonProperty("message")
    private String message;

    public OperationResponse() {

    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
