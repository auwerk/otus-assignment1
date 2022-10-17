package org.auwerk.otus.assignment1.api;

import org.auwerk.otus.assignment1.api.dto.ServiceResponse;
import org.auwerk.otus.assignment1.api.dto.ServiceResponseStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping
    ServiceResponse health() {
        return ServiceResponse.builder()
                .status(ServiceResponseStatus.OK)
                .build();
    }
}
