package org.openapitools.persistence.repositories;

import org.openapitools.persistence.entities.ProcessedMail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcessedMailRepository extends JpaRepository<ProcessedMail, Integer> {
}
