package sda.training.utils;

import org.springframework.stereotype.Service;
import sda.training.dto.response.OperationResponse;

@Service
public class OperationResponseFactory {

    public OperationResponse createPositiveOperationResponse() {
        OperationResponse operationResponse = new OperationResponse();
        operationResponse.setResult(true);
        return operationResponse;
    }

    public OperationResponse createNegativeOperationResponse(String message) {
        OperationResponse operationResponse = new OperationResponse();
        operationResponse.setResult(false);
        operationResponse.setMessage(message);
        return operationResponse;
    }

}
