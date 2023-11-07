package org.openapitools.persistence.repositories;

import org.openapitools.persistence.entities.TagEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<TagEntity, Integer> {
}
