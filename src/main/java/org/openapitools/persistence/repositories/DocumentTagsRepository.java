package org.openapitools.persistence.repositories;

import org.openapitools.persistence.entities.DocumentTagsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentTagsRepository extends JpaRepository<DocumentTagsEntity, Integer> {
}
