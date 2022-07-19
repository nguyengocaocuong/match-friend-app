package com.matching.friend.webapp.pojo;

import com.matching.friend.webapp.pojo.entity.FreeTimeAction;
import com.matching.friend.webapp.pojo.entity.Location;
import com.matching.friend.webapp.pojo.entity.Person;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProfilePOJO {
    private Long personId;
    private String name;
    private String email;
    private Location location;
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
    private Boolean isAdmin;
    private Long hobbyId;
    private Location likeLocation;
    private Integer likeAgeFrom;
    private Integer likeAgeTo;
    private Double likeHeightFrom;
    private Double likeHeightTo;
    private Integer likeSex;
    private Boolean likeReligion;
    private Integer likeEducation;
    private FreeTimeAction likeFreeTimeAction;
}
