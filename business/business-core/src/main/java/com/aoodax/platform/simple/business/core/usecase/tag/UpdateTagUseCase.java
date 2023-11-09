package com.aoodax.platform.simple.business.core.usecase.tag;

import com.aoodax.platform.simple.business.core.usecase.tag.dto.request.UpdateTagRequest;
import com.aoodax.platform.simple.business.core.usecase.tag.dto.response.TagResponse;

public interface UpdateTagUseCase {

    TagResponse update(UpdateTagRequest dto);

}
