package org.openapitools.persistence.repositories;

import org.openapitools.persistence.entities.AuthToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthTokenRepository extends JpaRepository<AuthToken, Integer> {
}
