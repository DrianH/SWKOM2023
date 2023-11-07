package org.openapitools.persistence.repositories;

import org.openapitools.persistence.entities.UiSettingsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UiSettingsRepository extends JpaRepository<UiSettingsEntity, Integer> {
}
