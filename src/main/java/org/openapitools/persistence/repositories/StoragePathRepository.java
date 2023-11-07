package org.openapitools.persistence.repositories;

import org.openapitools.persistence.entities.StoragePathEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoragePathRepository extends JpaRepository<StoragePathEntity, Integer> {
}
