package org.openapitools.persistence.repositories;

import org.openapitools.persistence.entities.LogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogRepository extends JpaRepository<LogEntity, Integer> {
}
