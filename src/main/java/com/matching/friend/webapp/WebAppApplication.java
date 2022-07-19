package com.matching.friend.webapp;

import com.matching.friend.webapp.pojo.entity.FreeTimeAction;
import com.matching.friend.webapp.pojo.entity.Hobby;
import com.matching.friend.webapp.pojo.entity.Location;
import com.matching.friend.webapp.pojo.entity.Person;
import com.matching.friend.webapp.repository.FreeTimeActionRepository;
import com.matching.friend.webapp.repository.HobbyRepository;
import com.matching.friend.webapp.repository.LocationRepository;
import com.matching.friend.webapp.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.Date;
import java.util.Random;

@SpringBootApplication
public class WebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebAppApplication.class, args);
    }

    CommandLineRunner run(PersonRepository personRepository, HobbyRepository hobbyRepository, FreeTimeActionRepository freeTimeActionRepository, LocationRepository locationRepository) {
        return args -> {
            Location location1 = locationRepository.save(Location.builder().locationName("Nghệ An").build());
            Location location2 = locationRepository.save(Location.builder().locationName("Thanh Hóa").build());
            Location location3 = locationRepository.save(Location.builder().locationName("Hà Tĩnh").build());
            Location location4 = locationRepository.save(Location.builder().locationName("Ninh Bình").build());
            Location location5 = locationRepository.save(Location.builder().locationName("Bình Dương").build());
            Location location6 = locationRepository.save(Location.builder().locationName("Hà Nội").build());
            Location location7 = locationRepository.save(Location.builder().locationName("Hải Dường").build());
            Location location8 = locationRepository.save(Location.builder().locationName("Thái Bình").build());
            Location location9 = locationRepository.save(Location.builder().locationName("Sài Gòn").build());
            Location location10 = locationRepository.save(Location.builder().locationName("Nha Trang").build());
            Location location11 = locationRepository.save(Location.builder().locationName("Bắc Ninh").build());
            Location location12 = locationRepository.save(Location.builder().locationName("Ninh Bình").build());
            Location location13 = locationRepository.save(Location.builder().locationName("Trà Vinh").build());
            Location location14 = locationRepository.save(Location.builder().locationName("Lai Châu").build());

            FreeTimeAction freeTimeAction1 = freeTimeActionRepository.save(FreeTimeAction.builder().actionName("Đi du lịch").build());
            FreeTimeAction freeTimeAction2 =freeTimeActionRepository.save(FreeTimeAction.builder().actionName("Đi bơi").build());
            FreeTimeAction freeTimeAction3 =freeTimeActionRepository.save(FreeTimeAction.builder().actionName("Xem phim").build());
            FreeTimeAction freeTimeAction4 =freeTimeActionRepository.save(FreeTimeAction.builder().actionName("Nghe nhạc").build());
            FreeTimeAction freeTimeAction5 =freeTimeActionRepository.save(FreeTimeAction.builder().actionName("Đọc sách").build());
            FreeTimeAction freeTimeAction6 =freeTimeActionRepository.save(FreeTimeAction.builder().actionName("Ăn uống").build());
            FreeTimeAction freeTimeAction7 =freeTimeActionRepository.save(FreeTimeAction.builder().actionName("Nấu ăn").build());
            FreeTimeAction freeTimeAction8 =freeTimeActionRepository.save(FreeTimeAction.builder().actionName("Nằm ngủ").build());


            Person person1 = personRepository.save(Person.builder().age(21).email("nguyenngocaocuong@gmail.com").password("password").location(location1).avatar("url").height(12.3).education(1).freeTimeAction(1).isAdmin(Boolean.TRUE).phoneNumber("0818988577").createTime(12).isAdmin(Boolean.TRUE).build());
            Person person2 =personRepository.save(Person.builder().age(22).email("nguyendinhcanh@gmail.com").password("password").location(location2).avatar("url").height(12.3).education(1).freeTimeAction(3).isAdmin(Boolean.TRUE).phoneNumber("0818988577").createTime(12).isAdmin(Boolean.FALSE).build());
            Person person3 =personRepository.save(Person.builder().age(18).email("lebaohieu@gmail.com").password("password").location(location2).avatar("url").height(12.3).education(1).freeTimeAction(5).isAdmin(Boolean.TRUE).phoneNumber("0818988577").createTime(12).isAdmin(Boolean.FALSE).build());
            Person person4 =personRepository.save(Person.builder().age(16).email("tadanghuy@gmail.com").password("cuongcuong").location(location2).avatar("url").height(12.3).education(1).freeTimeAction(2).isAdmin(Boolean.TRUE).phoneNumber("0818988577").createTime(11).isAdmin(Boolean.FALSE).build());
            Person person5 =personRepository.save(Person.builder().age(32).email("daoduythai@gmail.com").password("password").location(location3).avatar("url").height(12.3).education(1).freeTimeAction(5).isAdmin(Boolean.TRUE).phoneNumber("0818988577").createTime(10).isAdmin(Boolean.FALSE).build());
            Person person6 =personRepository.save(Person.builder().age(23).email("lethaitong@gmail.com").password("password").location(location3).avatar("url").height(12.3).education(1).freeTimeAction(6).isAdmin(Boolean.TRUE).phoneNumber("0818988577").createTime(1).isAdmin(Boolean.FALSE).build());
            Person person7 =personRepository.save(Person.builder().age(16).email("hadaihanh@gmail.com").password("password").location(location5).avatar("url").height(12.3).education(1).freeTimeAction(8).isAdmin(Boolean.TRUE).phoneNumber("0818988577").createTime(7).isAdmin(Boolean.FALSE).build());
            Person person8 =personRepository.save(Person.builder().age(17).email("dongthamthuc@gmail.com").password("password").location(location5).avatar("url").height(12.3).education(1).freeTimeAction(9).isAdmin(Boolean.TRUE).phoneNumber("0818988577").createTime(12).isAdmin(Boolean.FALSE).build());
            Person person9 =personRepository.save(Person.builder().age(27).email("toquymac@gmail.com").password("password").location(location7).avatar("url").height(12.3).education(1).freeTimeAction(5).isAdmin(Boolean.TRUE).phoneNumber("0818988577").createTime(7).isAdmin(Boolean.FALSE).build());
            Person person10 =personRepository.save(Person.builder().age(32).email("anhtuha@gmail.com").password("cuongcuong").location(location8).avatar("url").height(12.3).education(1).freeTimeAction(2).isAdmin(Boolean.TRUE).phoneNumber("0818988577").createTime(8).isAdmin(Boolean.FALSE).build());
            Person person11 =personRepository.save(Person.builder().age(18).email("nguyenduclam@gmail.com").password("cuongcuong").location(location7).avatar("url").height(12.3).education(1).freeTimeAction(3).isAdmin(Boolean.TRUE).phoneNumber("0855050635").createTime(3).isAdmin(Boolean.FALSE).build());
            Person person12 =personRepository.save(Person.builder().age(18).email("phamhongson@gmail.com").password("cuongcuong").location(location5).avatar("url").height(12.3).education(1).freeTimeAction(4).isAdmin(Boolean.TRUE).phoneNumber("0818988577").createTime(4).isAdmin(Boolean.FALSE).build());
            Person person13 =personRepository.save(Person.builder().age(19).email("nguyenvanlong@gmail.com").password("cuongcuong").location(location6).avatar("url").height(12.3).education(1).freeTimeAction(4).isAdmin(Boolean.TRUE).phoneNumber("0818988577").createTime(4).isAdmin(Boolean.FALSE).build());
            Person person14 =personRepository.save(Person.builder().age(26).email("truongsyhung@gmail.com").password("cuongcuong").location(location4).avatar("url").height(12.3).education(1).freeTimeAction(7).isAdmin(Boolean.TRUE).phoneNumber("0818988577").createTime(6).isAdmin(Boolean.FALSE).build());
            Person person15 =personRepository.save(Person.builder().age(29).email("lathevinh@gmail.com").password("cuongcuong").location(location6).avatar("url").height(12.3).education(1).freeTimeAction(7).isAdmin(Boolean.TRUE).phoneNumber("0818988577").createTime(6).isAdmin(Boolean.FALSE).build());
            Person person16 =personRepository.save(Person.builder().age(33).email("dangthaimai@gmail.com").password("cuongcuong").location(location2).avatar("url").height(12.3).education(1).freeTimeAction(8).isAdmin(Boolean.TRUE).phoneNumber("0818988577").createTime(3).isAdmin(Boolean.FALSE).build());
            Person person17 =personRepository.save(Person.builder().age(31).email("songkhongtu@gmail.com").password("cuongcuong").location(location2).avatar("url").height(12.3).education(1).freeTimeAction(6).isAdmin(Boolean.TRUE).phoneNumber("0818988577").createTime(7).isAdmin(Boolean.FALSE).build());
            Person person18 =personRepository.save(Person.builder().age(35).email("hongbemac@gmail.com").password("cuongcuong").location(location1).avatar("url").height(12.3).education(1).freeTimeAction(6).isAdmin(Boolean.TRUE).phoneNumber("0818988577").createTime(8).isAdmin(Boolean.FALSE).build());
            Person person19 =personRepository.save(Person.builder().age(16).email("dangsuthe@gmail.com").password("cuongcuong").location(location1).avatar("url").height(12.3).education(1).freeTimeAction(6).isAdmin(Boolean.TRUE).phoneNumber("0818988577").createTime(2).isAdmin(Boolean.FALSE).build());

            hobbyRepository.save(Hobby.builder().likeAgeFrom(15).likeAgeTo(18).likeHeightFrom(157.0).likeHeightTo(166.0).likeSex(0).likeLocation(location1).likeEducation(1).likeFreeTimeAction(freeTimeAction2).person(person1).build());
            hobbyRepository.save(Hobby.builder().likeAgeFrom(21).likeAgeTo(33).likeHeightFrom(169.0).likeHeightTo(175.0).likeSex(1).likeLocation(location2).likeEducation(2).likeFreeTimeAction(freeTimeAction3).person(person2).build());
            hobbyRepository.save(Hobby.builder().likeAgeFrom(12).likeAgeTo(22).likeHeightFrom(150.0).likeHeightTo(170.0).likeSex(1).likeLocation(location3).likeEducation(3).likeFreeTimeAction(freeTimeAction1).person(person3).build());
            hobbyRepository.save(Hobby.builder().likeAgeFrom(23).likeAgeTo(43).likeHeightFrom(160.0).likeHeightTo(180.0).likeSex(0).likeLocation(location4).likeEducation(2).likeFreeTimeAction(freeTimeAction1).person(person4).build());
            hobbyRepository.save(Hobby.builder().likeAgeFrom(31).likeAgeTo(35).likeHeightFrom(154.0).likeHeightTo(160.0).likeSex(-1).likeLocation(location4).likeEducation(3).likeFreeTimeAction(freeTimeAction4).person(person5).build());
            hobbyRepository.save(Hobby.builder().likeAgeFrom(8).likeAgeTo(10).likeHeightFrom(159.0).likeHeightTo(165.0).likeSex(0).likeLocation(location6).likeEducation(3).likeFreeTimeAction(freeTimeAction5).person(person6).build());
            hobbyRepository.save(Hobby.builder().likeAgeFrom(30).likeAgeTo(35).likeHeightFrom(170.0).likeHeightTo(187.0).likeSex(0).likeLocation(location11).likeEducation(1).likeFreeTimeAction(freeTimeAction3).person(person7).build());
            hobbyRepository.save(Hobby.builder().likeAgeFrom(20).likeAgeTo(25).likeHeightFrom(166.0).likeHeightTo(180.0).likeSex(-1).likeLocation(location5).likeEducation(1).likeFreeTimeAction(freeTimeAction6).person(person8).build());

        };
    }
}
