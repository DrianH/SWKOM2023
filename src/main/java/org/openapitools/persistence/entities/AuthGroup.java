package org.openapitools.persistence.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
public class AuthGroup {
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

    @Column(nullable = false, length = 150)
    private String name;

    @OneToMany(mappedBy = "group")
    private Set<AuthUserGroups> groupAuthUserGroups;

    @OneToMany(mappedBy = "group")
    private Set<AuthGroupPermissions> groupAuthGroupPermissions;
}
