package by.salei.rental.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "profile")
public class Profile extends BaseEntity {

    private String firstName;
    private String lasName;
    private String middleName;
    private String phoneNumber;
    private String city;
    private Integer age;
}
