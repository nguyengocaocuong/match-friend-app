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
        name = "FreeTimeAction"
)
@Entity(
        name = "FreeTimeAction"
)
public class FreeTimeAction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long freeTimeActionId;
    @Column(
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String actionName;
}
