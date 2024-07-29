package it.agilelab.witboost.javascaffold.service.validation;

import static io.vavr.control.Either.left;

import io.vavr.control.Either;
import it.agilelab.witboost.javascaffold.common.FailedOperation;
import it.agilelab.witboost.javascaffold.common.Problem;
import it.agilelab.witboost.javascaffold.model.Component;
import it.agilelab.witboost.javascaffold.model.DataProduct;
import it.agilelab.witboost.javascaffold.model.Specific;
import jakarta.validation.Valid;
import java.util.Collections;
import org.springframework.validation.annotation.Validated;

@org.springframework.stereotype.Component
@Validated
public class OutputPortValidation {

    public Either<FailedOperation, Void> validate(
            DataProduct dataProduct, @Valid Component<? extends Specific> component) {
        // TODO Remember to implement the validation for the output port.
        return left(new FailedOperation(Collections.singletonList(
                new Problem("Implement the validation for output port based on your requirements!"))));
    }
}
