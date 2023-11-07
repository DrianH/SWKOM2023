package org.openapitools.persistence.repositories;

import org.openapitools.persistence.entities.MailAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MailAccountRepository extends JpaRepository<MailAccount, Integer> {
}
