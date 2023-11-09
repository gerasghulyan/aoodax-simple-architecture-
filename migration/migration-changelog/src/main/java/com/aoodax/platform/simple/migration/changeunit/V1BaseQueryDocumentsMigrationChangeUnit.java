package com.aoodax.platform.simple.migration.changeunit;

import io.mongock.api.annotations.BeforeExecution;
import io.mongock.api.annotations.ChangeUnit;
import io.mongock.api.annotations.RollbackBeforeExecution;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.core.MongoTemplate;

@ChangeUnit(id = "baseQueryDocumentsMigrationChangeUnitId", order = "1", author = "AOODAX")
@RequiredArgsConstructor
@Slf4j
public class V1BaseQueryDocumentsMigrationChangeUnit extends QueryDocumentMigrationBaseChangeUnit {
    private final MongoTemplate mongoTemplate;

    @BeforeExecution
    public void before() {
        log.debug("BeforeExecution was called for baseQueryDocumentsMigrationChangeUnitId, order 1");
//        mongoTemplate.createCollection(EventQueryDocument.class)
//                .createIndex(
//                        new Document().append("eventId", 1),
//                        new IndexOptions().name("ui-eventId").unique(true)
//                );
//        mongoTemplate.createCollection(SpaceQueryDocument.class)
//                .createIndexes(List.of(
//                        new IndexModel(
//                                new Document().append("uuid", 1),
//                                new IndexOptions().name("ui-uuid").unique(Boolean.TRUE)
//                        ),
//                        new IndexModel(
//                                new Document().append("customerUuid", 1),
//                                new IndexOptions().name("ui-customerUuid").unique(Boolean.TRUE)
//                        ),
//                        new IndexModel(
//                                new Document().append("name", 1),
//                                new IndexOptions().name("ui-name").unique(Boolean.TRUE)
//                        )
//                ));
        log.debug("Successfully executed BeforeExecution for baseQueryDocumentsMigrationChangeUnitId, order 1 ");
    }

    @RollbackBeforeExecution
    public void rollbackBefore() {
        log.warn("RollbackBeforeExecution was called for baseQueryDocumentsMigrationChangeUnitId, order 1");
    }
}