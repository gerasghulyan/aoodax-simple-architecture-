package com.aoodax.platform.simple.migration.changeunit;

import io.mongock.api.annotations.Execution;
import io.mongock.api.annotations.RollbackExecution;

public class QueryDocumentMigrationBaseChangeUnit {
    @Execution
    public void migrationMethod() {
        // Only DML allowed
    }

    @RollbackExecution
    public void rollback() {
        // Rollback login for DML in migrationMethod
    }
}