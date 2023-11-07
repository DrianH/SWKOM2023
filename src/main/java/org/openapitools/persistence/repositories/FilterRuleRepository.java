package org.openapitools.persistence.repositories;

import org.openapitools.persistence.entities.FilterRuleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilterRuleRepository extends JpaRepository<FilterRuleEntity, Integer> {
}
