package com.matching.friend.webapp.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(

)
@Entity(
        name = "Hobby"
)
public class Hobby {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long hobbyId;

    @OneToOne
    @JoinColumn(
            name = "person_id",
            referencedColumnName = "personId"
    )
    private Person person;
    @ManyToOne
    @JoinColumn(
            name = "location_id",
            referencedColumnName = "locationId"
    )
    private Location likeLocation;
    private Integer likeAgeFrom;
    private Integer likeAgeTo;
    private Double likeHeightFrom;
    private Double likeHeightTo;
    private Integer likeSex;
    private Boolean likeReligion;
    private Integer likeEducation;
    @ManyToOne
    @JoinColumn(
            referencedColumnName = "freeTimeActionId"
    )
    private FreeTimeAction likeFreeTimeAction;
}
