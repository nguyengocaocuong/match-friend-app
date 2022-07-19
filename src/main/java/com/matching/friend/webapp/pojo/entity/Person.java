package com.matching.friend.webapp.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(
        name = "Person",
        uniqueConstraints = {
                @UniqueConstraint(name = "person_unique_column", columnNames = "email")
        }
)
@Entity(
        name = "Person"
)
public class Person {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long personId;

    @Column(
            nullable = false,
            columnDefinition = "TEXT",
            unique = true
    )
    private String email;
    @ManyToOne
    @JoinColumn(
            name = "location_id",
            referencedColumnName = "locationId"
    )
    private Location location;
    private String name;
    private Integer age;
    private String image;
    private String avatar;
    private Double height;
    private String phoneNumber;
    private Integer sex;
    private Boolean religion;
    private Integer education;
    private Integer createTime;
    private Integer freeTimeAction;
    @Column(
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String password;
    @Column(
            columnDefinition = "boolean default false"
    )
    private Boolean isAdmin;


}
