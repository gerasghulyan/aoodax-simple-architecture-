package com.aoodax.platform.simple.business.core.usecase.tag.dto.request;

import com.aoodax.jvm.common.utils.validation.ParameterValidator;
import com.aoodax.platform.simple.business.core.common.BusinessRequest;
import lombok.Builder;

public record CreateTagRequest(String name) implements BusinessRequest {

    @Builder
    public CreateTagRequest {
        ParameterValidator.assertHasTextParameterArgument(name, "name");
    }
}
