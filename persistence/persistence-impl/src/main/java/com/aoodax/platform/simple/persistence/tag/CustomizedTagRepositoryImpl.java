package com.aoodax.platform.simple.persistence.tag;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.support.PageableExecutionUtils;
import org.springframework.stereotype.Repository;

import static com.aoodax.jvm.common.utils.validation.ParameterValidator.assertNotNullParameterArgument;
import static org.springframework.data.mongodb.core.query.Criteria.where;

@Slf4j
@Repository
@RequiredArgsConstructor
public class CustomizedTagRepositoryImpl implements CustomizedTagRepository {

    private final MongoOperations mongoOperations;

    @Override
    public Page<TagEntity> find(final Pageable pageable) {
        assertNotNullParameterArgument(pageable, "pageable");

        log.debug("Executing get tags method with page info - {}", pageable);
        final Query query = new Query()
                .with(Sort.by("created_at").descending())
                .addCriteria(where("is_deleted").is(false));
        final long count = mongoOperations.count(query, TagEntity.class);
        query.with(pageable);
        final Page<TagEntity> page = PageableExecutionUtils.getPage(mongoOperations.find(query, TagEntity.class), pageable, () -> count);
        log.debug("Successfully executed get tags with page info - {}", pageable);
        return page;
    }
}