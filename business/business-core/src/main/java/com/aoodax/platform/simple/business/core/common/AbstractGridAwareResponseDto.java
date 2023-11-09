package com.aoodax.platform.simple.business.core.common;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

import static com.aoodax.jvm.common.utils.validation.ParameterValidator.assertNotNullParameterArgument;

@Data
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public abstract class AbstractGridAwareResponseDto<T extends BusinessResult> implements BusinessResult {

    List<T> items;
    long total;

    protected AbstractGridAwareResponseDto(
            final List<T> items,
            final long total) {
        assertNotNullParameterArgument(items, "items");

        this.items = items;
        this.total = total;
    }
}