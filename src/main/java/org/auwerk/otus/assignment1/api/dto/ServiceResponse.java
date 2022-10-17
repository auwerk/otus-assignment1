package org.auwerk.otus.assignment1.api.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ServiceResponse {
    ServiceResponseStatus status;
}
