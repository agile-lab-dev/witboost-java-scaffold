package it.agilelab.witboost.javascaffold.service.validation;

import io.vavr.control.Either;
import it.agilelab.witboost.javascaffold.common.FailedOperation;
import it.agilelab.witboost.javascaffold.model.ProvisionRequest;
import it.agilelab.witboost.javascaffold.model.Specific;
import it.agilelab.witboost.javascaffold.openapi.model.ProvisioningRequest;

public interface ValidationService {

    Either<FailedOperation, ProvisionRequest<? extends Specific>> validate(ProvisioningRequest provisioningRequest);
}
