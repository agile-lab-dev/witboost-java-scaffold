package com.witboost.provisioning.javascaffold.config;

import com.witboost.provisioning.framework.service.validation.ValidationConfiguration;
import com.witboost.provisioning.javascaffold.service.validation.OutputPortValidationService;
import com.witboost.provisioning.javascaffold.service.validation.StorageAreaValidationService;
import com.witboost.provisioning.javascaffold.service.validation.WorkloadValidationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ValidationConfigurationBean {

    // TODO Remove the components you don't need to support on your Tech Adapter
    @Bean
    ValidationConfiguration validationConfiguration(
            OutputPortValidationService outputPortValidationService,
            StorageAreaValidationService storageAreaValidationService,
            WorkloadValidationService workloadValidationService) {
        return ValidationConfiguration.builder()
                .outputPortValidationService(outputPortValidationService)
                .storageValidationService(storageAreaValidationService)
                .workloadValidationService(workloadValidationService)
                .build();
    }
}
