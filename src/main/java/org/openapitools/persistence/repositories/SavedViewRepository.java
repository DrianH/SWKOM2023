package org.openapitools.persistence.repositories;

import org.openapitools.persistence.entities.SavedViewEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavedViewRepository extends JpaRepository<SavedViewEntity, Integer> {
}
