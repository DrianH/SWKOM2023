package org.openapitools.persistence.repositories;

import org.openapitools.persistence.entities.AuthUserPermissions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthUserPermissionsRepository extends JpaRepository<AuthUserPermissions, Integer> {
}
