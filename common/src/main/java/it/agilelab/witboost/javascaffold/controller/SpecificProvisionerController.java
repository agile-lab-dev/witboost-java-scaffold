package it.agilelab.witboost.javascaffold.controller;

import it.agilelab.witboost.javascaffold.openapi.controller.V1ApiDelegate;
import it.agilelab.witboost.javascaffold.openapi.model.ProvisioningRequest;
import it.agilelab.witboost.javascaffold.openapi.model.ValidationResult;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * API Controller for the Java Specific Provisioner which implements the autogenerated {@link
 * V1ApiDelegate} interface. The interface defaults the endpoints to throw 501 Not Implemented
 * unless overridden in this class.
 *
 * <p>Exceptions thrown will be handled by {@link SpecificProvisionerExceptionHandler}
 */
@Service
public class SpecificProvisionerController implements V1ApiDelegate {
    @Override
    public ResponseEntity<ValidationResult> validate(ProvisioningRequest provisioningRequest)
            throws Exception {
        return ResponseEntity.ok(new ValidationResult(true));
    }
}
