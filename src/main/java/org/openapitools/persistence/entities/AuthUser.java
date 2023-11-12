package org.openapitools.persistence.entities;

import javax.persistence.*;
import lombok.*;

import java.time.OffsetDateTime;
import java.util.Set;


@Getter
@Setter
@Entity
public class AuthUser {

    @Id
    @Column(nullable = false, updatable = false)
    @SequenceGenerator(
            name = "primary_sequence",
            sequenceName = "primary_sequence",
            allocationSize = 1,
            initialValue = 10000
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "primary_sequence"
    )
    private Integer id;

    @Column(nullable = false, length = 128)
    private String password;

    @Column
    private OffsetDateTime lastLogin;

    @Column(nullable = false)
    private Boolean isSuperuser;

    @Column(nullable = false, length = 150)
    private String username;

    @Column(nullable = false, length = 150)
    private String firstName;

    @Column(nullable = false, length = 150)
    private String lastName;

    @Column(nullable = false, length = 254)
    private String email;

    @Column(nullable = false)
    private Boolean isStaff;

    @Column(nullable = false)
    private Boolean isActive;

    @Column(nullable = false)
    private OffsetDateTime dateJoined;

    @OneToMany(mappedBy = "user")
    private Set<AuthUserGroups> userAuthUserGroups;

    @OneToMany(mappedBy = "owner")
    private Set<CorrespondentEntity> ownerCorrespondentEntities;

    @OneToMany(mappedBy = "owner")
    private Set<DocumentTypeEntity> ownerDocumentTypeEntities;

    @OneToMany(mappedBy = "owner")
    private Set<StoragePathEntity> ownerStoragePathEntities;

    @OneToMany(mappedBy = "owner")
    private Set<TagEntity> ownerTagEntities;

    @OneToMany(mappedBy = "user")
    private Set<UiSettingsEntity> userUiSettingsEntities;

    @OneToMany(mappedBy = "owner")
    private Set<SavedViewEntity> ownerSavedViewEntities;

    @OneToMany(mappedBy = "owner")
    private Set<MailAccount> ownerMailAccounts;

    @OneToMany(mappedBy = "owner")
    private Set<DocumentEntity> ownerDocumentEntities;

    @OneToMany(mappedBy = "user")
    private Set<NoteEntity> userNoteEntities;

    @OneToMany(mappedBy = "owner")
    private Set<MailRule> ownerMailrules;

    @OneToMany(mappedBy = "user")
    private Set<AuthUserPermissions> userAuthUserPermissions;

    @OneToMany(mappedBy = "user")
    private Set<AuthToken> userAuthTokens;

    @OneToMany(mappedBy = "owner")
    private Set<ProcessedMail> ownerProcessedMails;
}