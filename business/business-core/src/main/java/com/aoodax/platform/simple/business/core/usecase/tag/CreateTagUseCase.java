package com.aoodax.platform.simple.business.core.usecase.tag;

import com.aoodax.platform.simple.business.core.usecase.tag.dto.request.CreateTagRequest;
import com.aoodax.platform.simple.business.core.usecase.tag.dto.response.TagResponse;

public interface CreateTagUseCase {

    TagResponse create(CreateTagRequest dto);

}
