package org.openapitools.persistence.repositories;

import org.openapitools.persistence.entities.NoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<NoteEntity, Integer> {
}
